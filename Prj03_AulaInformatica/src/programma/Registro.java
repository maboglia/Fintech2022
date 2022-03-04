package programma;

public class Registro {

	//proprieta, attributi, fields
	Studente[] studenti = new Studente[27];
	
	
	
	
	//metodi
	void aggiungiStudente(Studente s, int pos) {
		studenti[pos] = s;
	}
	
	void stampaRegistro() {
		for (Studente s : studenti) {
			if (s != null)
				System.out.println(s.cognome);
		}
	}
	
}
