package com.boglia.service;

import java.util.List;
import java.util.Set;

import com.boglia.entities.Alimento;

public interface AlimentoService {

	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCat(String cat);
	Set<String> getCategorie();
	
}
