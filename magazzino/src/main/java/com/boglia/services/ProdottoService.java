package com.boglia.services;

import java.util.List;

import com.boglia.entities.Prodotto;

public interface ProdottoService {

	//CRUD
	
	//Create
	Prodotto addProdotto(Prodotto p);
	
	//Read retrieve
	List<Prodotto> getProdotti();
	Prodotto getProdottoById(int id);
	
	//Update
	Prodotto updateProdotto(Prodotto p);
	
	//Delete
	void deleteProdottoById(int id);
	
}
