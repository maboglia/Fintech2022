package com.boglia.integration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.dao.LibroDAO;
import com.boglia.model.Libro;

@RestController
@RequestMapping("api")
public class Libreria {

	@Autowired
	private LibroDAO dao;
			
	
	@GetMapping
	public List<Libro> prova() {
		return this.dao.findAll();
	}
	
	@PostMapping
	public Libro addLibro(@RequestBody Libro l) {
		return this.dao.save(l);
	}
	
	
}
