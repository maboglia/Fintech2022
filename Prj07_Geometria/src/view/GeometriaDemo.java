package view;

import model.Punto;
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
		
		
		System.out.println(t);
		System.out.println(t.calcolaPerimetro());
		
		
		
		
		
		
	}

}
