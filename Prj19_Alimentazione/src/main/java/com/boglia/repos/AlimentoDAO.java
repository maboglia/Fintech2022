package com.boglia.repos;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Alimento;

@Repository
public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

	List<Alimento> findByCategoria(String categoria);
	
	@Query(value = "select distinct(categoria) from alimenti order by categoria", nativeQuery = true )
	Set<String> getCat();
}
