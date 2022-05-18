package model;

import java.util.ArrayList;
import java.util.List;

public class Portafoglio {

	private List<Azione> contenuto;
	private String nome;
	
	public Portafoglio(String nome) {
		this.contenuto = new ArrayList<>();
		this.nome = nome;
	}

	public List<Azione> getContenuto() {
		return contenuto;
	}

	public void setContenuto(List<Azione> contenuto) {
		this.contenuto = contenuto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
