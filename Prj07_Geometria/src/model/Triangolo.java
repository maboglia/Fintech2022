package model;

public class Triangolo extends Poligono {
	private Punto a, b, c;
	private Segmento ab, bc, ac;
	
	
	public Triangolo(Punto a, Punto b, Punto c) {
		super("Triangolo");
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a, b);
		this.bc = new Segmento(b, c);
		this.ac = new Segmento(a, c);

		this.perimetro = calcolaPerimetro();
		this.superficie = calcolaSuperficie();
			
	}
	
	public double calcolaPerimetro() {
		return this.ab.getLunghezza() + 
				this.bc.getLunghezza() + 
				this.ac.getLunghezza() ;
	}
	
	public double calcolaSuperficie() {
		
		double sp = calcolaPerimetro()/2;
		
		return Math.sqrt(
				sp *
				(sp - ab.getLunghezza()) *
				(sp - bc.getLunghezza()) *
				(sp - ac.getLunghezza()) 
				
				
				);
		
		
	}
	

}
