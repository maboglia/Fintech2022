package programma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiFile {

	public static Studente[] studenti() {//appartiene alla classe
		//non ho bisogno di creare un oggetto per usare il metodo
		//Math.sqrt()
		Studente[] contenitore = new Studente[27];
		File f = new File("files/studenti.txt");
		
		try {//prova
			Scanner sc = new Scanner(f);
			int matr = 1;
			while(sc.hasNextLine()) {
				String riga =   sc.nextLine();
				String[] parole = riga.split(",");
				String nome = parole[0];
				String cognome = parole[1];
				
				Studente s = new Studente(matr++, nome, cognome);
				contenitore[matr -2] = s;
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contenitore;
	}
	
}
