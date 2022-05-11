package com.boglia.canzoni.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.canzoni.entities.Canzone;
import com.boglia.canzoni.services.CanzoneService;

@Controller
@RequestMapping("mvc")
public class CanzoniMVC {

	@Autowired
	private CanzoneService service;
	
	@GetMapping("canzoni")
	public String getCanzoni(Model m){
		m.addAttribute("titolo", "Tutte le canzoni disponibili");
		m.addAttribute("canzoni", this.service.getCanzoni());
		return "elencoCanzoni";
	}
	
	@GetMapping("canzoni/genere/{genere}")
	public String getCanzoniByGenere(@PathVariable String genere, Model m){
		m.addAttribute("titolo", "Tutte le canzoni " + genere);
		m.addAttribute("canzoni", this.service.getCanzoniByGenere(genere));
		return "elencoCanzoni";
	}
	
	
}
