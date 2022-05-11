package com.boglia.canzoni.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boglia.canzoni.entities.Canzone;

@Repository
public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {

}
