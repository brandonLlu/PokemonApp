package com.pokemon.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.app.model.Pokemon;
import com.pokemon.app.repository.IPokemonRepository;
import com.pokemon.app.service.IPokemonService;

@Service
public class PokemonServiceImpl implements IPokemonService{

	@Autowired
	private IPokemonRepository repo;
	
	
	@Override
	public Pokemon save(Pokemon Pokemon) {
		// TODO Auto-generated method stub
		return repo.save(Pokemon);
	}

	@Override
	public Pokemon update(Pokemon Pokemon) {
		// TODO Auto-generated method stub
		return repo.save(Pokemon);
	}

	@Override
	public Pokemon findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Pokemon> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
