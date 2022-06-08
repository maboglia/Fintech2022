package com.boglia.integration;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Alimento;
import com.boglia.service.AlimentoService;

@RestController
@RequestMapping("api")
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	@GetMapping
	public List<Alimento> findAll(){
		return service.getAlimenti();
	}
	
	@GetMapping("/{id}")
	public Alimento getAlimento(@PathVariable int id) {
		
		Alimento a = service.getAlimenti()
				.stream()
				.filter(l -> l.getId() == id).toList().get(0);
		return a;
	}
	
	@GetMapping("/categoria/{categoria}")
	public List<Alimento> getbyCat(@PathVariable String categoria){
		return service.getAlimentiByCat(categoria);
	}
	
	@GetMapping("categorie")
	public Set<String> getCategorie(){
		return service.getCategorie();
	}
	
}
