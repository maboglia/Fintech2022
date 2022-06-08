package com.jicmon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jicmon.entities.Viaggio;
import com.jicmon.repos.ViaggioDAO;

@Service
public class ViaggioServiceImpl implements ViaggiService {
	@Autowired
	private ViaggioDAO repo;
	@Override
	public List<Viaggio> getViaggi() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		// TODO Auto-generated method stub
		return repo.save(v);
	}

}
