package model;

public class Registro {

	public String nome;
	public Lezione[] lezioni;
	
	public Registro(String nomeRegistro) {
		nome = nomeRegistro;
		lezioni = new Lezione[25];
	}
	
	//public Lezione secondaLezione;
	
	/**
	 * Con questo metodo ottieni una stampa del registro...
	 * @return Questo metodo ritorna una stringa....
	 */
	public String stampaRegistro() {
		String risultato = "";
		
		risultato += nome;
		risultato += "\n";

		for (int i = 0; i < lezioni.length; i++) {
			risultato += i +") ";
			
			if (lezioni[i] != null ) {
				risultato += lezioni[i].stampaLezione();
				risultato += "\n";
			}
		}
		
		return risultato;
	}
	
}
