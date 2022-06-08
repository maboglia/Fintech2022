package com.jicmon.services;

import java.util.List;

import com.jicmon.entities.Viaggio;

public interface ViaggiService {
	
	List<Viaggio> getViaggi();
	
	Viaggio addViaggio(Viaggio v);
	
}
