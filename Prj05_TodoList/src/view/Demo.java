package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import controller.TodoCtrl;

public class Demo {

	public static void main(String[] args) {
		
		TodoCtrl ctrl = new TodoCtrl();
		
		String scelta = null;
		boolean gira = true;
		
		while(gira) {
			
			menu();
			scelta = chiediUtente();
			
			switch (scelta) {
			case "1": 
				System.out.println("aggiungi todo");
				String cosa = cosaFare();
				ctrl.addTodo(cosa);
				break;
			case "2": 
				System.out.println("stampa todo");
				ctrl.stampaElenco();
				break;
			case "3": 
				System.out.println("salva file");
				printer(ctrl);
				break;
			case "0": 
				gira = false;
				break;
				
			default:
				System.out.println("scelta non disponibile");
				break;
			}
			
			
			
		}
		
	}

	private static String cosaFare() {//metodo ausiliario
		System.out.println("Aggiungi una voce all'elenco");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	private static void printer(TodoCtrl ctrl) {
		try {
			PrintStream ps = new PrintStream(new File("lista.html"));
			ps.println(ctrl.stampaHTML());
			ps.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String chiediUtente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("scegli");
		
		return sc.next();
	}

	private static void menu() {
		System.out.println("Benvenut* nella todo list");
		System.out.println("1) aggiungi todo");
		System.out.println("2) elenco todo");
		System.out.println("3) stampa todo in html");
		System.out.println("0) esci");
	}

}
