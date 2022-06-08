package com.boglia.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class Router {

	@GetMapping("")
	public String getElenco() {
		return "elenco";
	}
	
	@GetMapping("add")
	public String getForm() {
		return "form";
	}
	
	@PostMapping("addParola")
	public String addParola(@RequestParam("indovinoParola") String parola) {
		System.out.println(parola);
		return "elenco";
	}
	
	@GetMapping("serviziRest")
	@ResponseBody
	public String getRestService() {
		
		StringBuilder sb = new StringBuilder();
		
		URL sitoWeb;
		try {
			sitoWeb = new URL("https://www.ansa.it/");
			URLConnection conn = sitoWeb.openConnection();
			
			Scanner input = new Scanner(conn.getInputStream(), StandardCharsets.UTF_8);
			
			while(input.hasNextLine()) {
				sb.append(input.nextLine());
			}

		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return sb.toString();
	}
	
	
}
