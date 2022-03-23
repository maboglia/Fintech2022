package model;

public class Rettangolo extends Poligono {

	protected Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		super("Rettangolo");
		this.base = base;
		this.altezza = altezza;
		this.perimetro = calcolaPerimetro();
		this.superficie = calcolaSuperficie();
	}
	
	public double calcolaPerimetro() {
		return 2 * (base.getLunghezza() + altezza.getLunghezza());
	}
	
	public double calcolaSuperficie() {
		return base.getLunghezza() * altezza.getLunghezza();
	}
	
	
}
