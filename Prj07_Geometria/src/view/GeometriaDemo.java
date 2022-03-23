package view;

import java.util.ArrayList;

import model.Poligono;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class GeometriaDemo {

	public static void main(String[] args) {

		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(7, 5);
		
		Segmento ab = new Segmento(a, b);
		Segmento bc = new Segmento(b, c);

		Triangolo t = new Triangolo(a, b, c);
		
		Rettangolo r = new Rettangolo(ab, bc);
		
		Quadrato q = new Quadrato(ab);
		
		ArrayList<Poligono> poligoni = new ArrayList<>();

		poligoni.add(t);
		poligoni.add(r);
		poligoni.add(q);
		
		double superficietot = 0;
		
		for (Poligono poligono : poligoni) {
			superficietot += poligono.getSuperficie();
		}
		
		System.out.println("La superficie tot dei poligoni: " + superficietot);
		
		
		
	}

}
