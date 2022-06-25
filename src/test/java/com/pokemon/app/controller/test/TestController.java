package com.pokemon.app.controller.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import org.junit.jupiter.api.Test;
import com.pokemon.app.controller.PokemonController;
import com.pokemon.app.model.Pokemon;
import com.pokemon.app.service.IPokemonService;

public class TestController {

	
	@InjectMocks
	private PokemonController controller = new PokemonController();
	
	@Mock
	private IPokemonService service;
	
	@Test
	public void getById() {
		
//		Pokemon expected = new Pokemon();
//		expected.setName("pikachu");
//		expected.setType("fuego");
//		expected.setRegion("Johto");
//		expected.setWeight(8.6);
//		expected.setHeight(1.6);
//		expected.setHp(100);
//		expected.setQuickAtttack("Ascuas");
//		expected.setChargedAttack("Llamarada");
//		expected.setDescription("2do Pokemon de Ash");
//		
//		when(service.findById(Mockito.anyInt())).thenReturn(expected);
//		
//		ResponseEntity<?> result = controller.findById(1);
//		assertEquals(expected.getName(), ((Pokemon) result.getBody()).getName());
		
	}
}
