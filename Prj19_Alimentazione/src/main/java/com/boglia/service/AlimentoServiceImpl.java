package com.boglia.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Alimento;
import com.boglia.repos.AlimentoDAO;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repoAlimenti;
	
	private List<Alimento> miaLista;
	
	
	@Override
	public List<Alimento> getAlimenti() {
		
		return repoAlimenti.findAll();
	}


	@Override
	public List<Alimento> getAlimentiByCat(String cat) {
		
		return repoAlimenti.findByCategoria(cat);
	}


	@Override
	public Set<String> getCategorie() {
		// TODO Auto-generated method stub
		return repoAlimenti.getCat();
	}

}
