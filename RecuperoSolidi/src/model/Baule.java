package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baule implements Trasportabile {

	private List<Cosa> cose;
	private String nome;
	
	public Baule(String nome) {
		this.cose = new ArrayList<>();
		this.nome = nome;
	}

	public void addCosa(Cosa c) {
		this.cose.add(c);
	}

	public double getPesoBaule() {
		double pesoTotale=0;
		
		for (int i = 0; i < cose.size(); i++) {
			
			if (cose.get(i) != null)
				pesoTotale += cose.get(i).getPeso();
		}
		return pesoTotale;
		
	}
	
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Baule [cose=" + cose + ", nome=" + nome + "]";
	}

	@Override
	public void trasporta() {
		System.out.println("ci sono due manici e lo prendi da una parte e dall'altra");
		
	}
	
	
	
	
}
