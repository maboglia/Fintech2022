package com.jicmon.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jicmon.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
