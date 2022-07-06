package com.boglia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.model.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
