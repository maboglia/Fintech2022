package com.boglia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alimenti")
public class Alimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoria;
	private String prodotto;
	private double proteine;
	private double lipidi;
	private double carboidrati;
	private int energia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getProdotto() {
		return prodotto;
	}
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	public double getProteine() {
		return proteine;
	}
	public void setProteine(double proteine) {
		this.proteine = proteine;
	}
	public double getLipidi() {
		return lipidi;
	}
	public void setLipidi(double lipidi) {
		this.lipidi = lipidi;
	}
	public double getCarboidrati() {
		return carboidrati;
	}
	public void setCarboidrati(double carboidrati) {
		this.carboidrati = carboidrati;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	
	
}
