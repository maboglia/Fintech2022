package com.boglia.canzoni.integration;

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

import com.boglia.canzoni.entities.Canzone;
import com.boglia.canzoni.services.CanzoneService;

@RestController
@RequestMapping("api")
public class CanzoniREST {

	@Autowired
	private CanzoneService service;
	
	@GetMapping("canzoni")
	public List<Canzone> getCanzoni(){
		return this.service.getCanzoni();
	}
	
	@PostMapping("canzoni")
	public Canzone addCanzone(@RequestBody Canzone c) {
		return this.service.addCanzone(c);
	}
	
	
	@PutMapping("canzoni")
	public Canzone updateCanzone(@RequestBody Canzone c) {
		return this.service.updateCanzone(c);
	}
	
	@DeleteMapping("canzoni/{id}")
	public void delCanzone(@PathVariable int id) {
		this.service.deleteCanzoneById(id);
	}
}
