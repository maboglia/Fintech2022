package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Prodotto;
import com.boglia.repos.ProdottoDAO;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	private ProdottoDAO repo;
	
	@Override
	public Prodotto addProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public List<Prodotto> getProdotti() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Prodotto getProdottoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prodotto updateProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void deleteProdottoById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
