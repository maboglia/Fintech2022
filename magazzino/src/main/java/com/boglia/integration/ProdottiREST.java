package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Prodotto;
import com.boglia.services.ProdottoService;

@RestController
@RequestMapping("api")
public class ProdottiREST {

	@Autowired
	private ProdottoService service;
	
	@GetMapping("prodotti")
	public List<Prodotto> getAll(){
		return service.getProdotti();
	}
	
	@PostMapping("prodotti")
	public Prodotto addProdotto(@RequestBody Prodotto p) {
		return service.addProdotto(p);
	}
	
	@PutMapping("prodotti")
	public Prodotto updProdotto(@RequestBody Prodotto p) {
		return service.updateProdotto(p);
	}
	
	@DeleteMapping("prodotti/{id}")
	public void deleteProdotto(@PathVariable int id) {
		service.deleteProdottoById(id);
	}
		
	
}
