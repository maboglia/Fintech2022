package com.boglia.canzoni.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
}
