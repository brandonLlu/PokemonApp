package com.pokemon.app.service;

import java.util.List;

import com.pokemon.app.model.Pokemon;


public interface IPokemonService {
	Pokemon save(Pokemon pokemon);
	
	Pokemon update(Pokemon pokemon);
	
	Pokemon findById(Integer id);
	
	List<Pokemon> findAll();
	
	void delete(Integer id);
}
