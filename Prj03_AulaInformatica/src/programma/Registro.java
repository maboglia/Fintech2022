package programma;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Registro {

	// proprieta, attributi, fields
	Studente[] studenti = new Studente[27];// lunghezza nota priori

	// metodi
	void aggiungiStudente(Studente s, int pos) {
		studenti[pos] = s;
	}

	void stampaRegistro() {
		for (Studente s : studenti) {// foreach
			if (s != null)
				System.out.println(s.cognome);
		}
	}

	void faiAppello() {

		Scanner sc = new Scanner(System.in);
		int presenti = 0, assenti = 0;
		;

		for (int i = 0; i < studenti.length; i++) {

			if (studenti[i] != null) {

				System.out.println("E' presente lo studente: ");
				System.out.println(studenti[i].cognome);

				if (sc.nextLine().equals("s")) {
					presenti++;
				} else {
					assenti++;
				}
			}
		} // fine ciclo for

		System.out.println("L'appello del " + LocalDateTime.now());
		System.out.println("Sono presenti " + presenti);
		System.out.println("Sono assenti " + assenti);

	}

}
