package com.drago.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drago.entities.Documento;
import com.drago.entities.Viaggio;

public interface DocRepos extends JpaRepository<Documento,Integer>{
	
	
}
