package model;

public class Segmento {

	private Punto a, b;
	private double lunghezza;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		this.lunghezza = calcolaLunghezza();
	}
	
	public double calcolaLunghezza() {
		
		double diffX =  Math.pow(  b.getX() - a.getX(), 2);
		double diffY =  Math.pow(  b.getY() - a.getY(), 2);
		
		return Math.sqrt(         diffX + diffY        );
		
	}
	
	public double getLunghezza() {
		return lunghezza;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
	
}
