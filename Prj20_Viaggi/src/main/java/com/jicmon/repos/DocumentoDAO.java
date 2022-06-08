package com.jicmon.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jicmon.entities.Documento;

public interface DocumentoDAO extends JpaRepository<Documento, Integer> {

}
