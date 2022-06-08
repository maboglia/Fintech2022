package view;

import java.util.Scanner;

public class Anagramma {

	public static void main(String[] args) {
		chiedi();

	}

	private static void chiedi() {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci 4 lettere: ");
		String parola = in.next();
		System.out.printf("Gli anagrammi di %s sono: %n", parola);
		anagramma(parola,"");
		
	}

	private static void anagramma(String parola, String string) {
		if(parola.length()<= 1)
			System.out.println(string+parola);
		else {			
			for(int i=0; i< parola.length();i++) {
				String a = parola.substring(i, i+1);
				String b = parola.substring(0, i);
				String c = parola.substring(i+1);
				System.out.println(string+a+" "+b+c);
				anagramma(string+a,b+c);
			}
		}
			
		
	}

}
