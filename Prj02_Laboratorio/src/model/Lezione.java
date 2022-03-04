package model;

import java.time.LocalDate;

public class Lezione {

	public LocalDate data;
	public String argomento;
	public String dettaglio;
	
	public int presenti;
	public int assenti;
	
	public Lezione() {
//		System.out.println("sono il metodo costruttore");
//		System.out.println("hai costruito un oggetto di tipo lezione");
		data = LocalDate.now();
	}
	
	public String stampaLezione() {
		return data + "\n" + argomento +"\n"+presenti;
	}
	
}
