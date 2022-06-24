package com.pokemon.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.app.model.Pokemon;
import com.pokemon.app.service.IPokemonService;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	private IPokemonService service;
	
	@GetMapping
	public List<Pokemon> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		
		Pokemon pokemon = service.findById(id);
		Map<String, Object> response = new HashMap<>();
		
		if(pokemon == null) {	
			response.put("message", "The pokemon with ID:".concat(id.toString().concat(" doesn't exist in the database.")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Pokemon>(pokemon,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Pokemon pokemon) {
		Pokemon pokemonCreated = null;
		Map<String, Object> response = new HashMap<>();
		try {
			pokemonCreated = service.save(pokemon);
		}catch(DataAccessException e) {
			response.put("message", "Error inserting to DB.");
			response.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("message", "The pokemon has been created.");
		response.put("pokemon", pokemonCreated);
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Pokemon pokemon) {
		Pokemon pokemonUpdated = null;
		Map<String, Object> response = new HashMap<>();
		try {
			pokemonUpdated = service.update(pokemon);
		}catch(DataAccessException e) {
			response.put("message", "Error updating the DB.");
			response.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("message", "The pokemon has been updated.");
		response.put("pokemon", pokemonUpdated);
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		Pokemon pokemon = service.findById(id);
		Map<String, Object> response = new HashMap<>();

		if(pokemon == null) {
			response.put("message", "The pokemon with ID:".concat(id.toString().concat(" doesn't exist in the database.")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		service.delete(id);
		response.put("message", "The pokemon has been deleted");
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.OK);
		
	}
}
