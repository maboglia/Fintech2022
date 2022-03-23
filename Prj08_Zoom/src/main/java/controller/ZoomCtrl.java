package controller;

import java.util.ArrayList;

import model.Animale;

public class ZoomCtrl {

	private ArrayList<Animale> animali;
	
	public ZoomCtrl() {
		this.animali = new ArrayList<>();
	}
	
	public void addAnimale(Animale a) {
		this.animali.add(a);
	}
	
	public ArrayList<Animale> getAnimali() {
		return animali;
	}
	
	
}
