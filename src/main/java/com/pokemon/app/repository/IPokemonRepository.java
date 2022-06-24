package com.pokemon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.app.model.Pokemon;

@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon, Integer>{

}
