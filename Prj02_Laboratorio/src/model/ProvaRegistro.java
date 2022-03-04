package model;

public class ProvaRegistro {

	public static void main(String[] args) {

		Registro registroFintech = new Registro("Registro del corso Fintech 2022");
		Registro registroFintech2 = registroFintech;
		System.out.println(registroFintech);
		System.out.println(registroFintech2);
		
//		registroFintech.nome = "Registro del corso Fintech 2022";
		registroFintech.lezioni[0] = new Lezione();
		registroFintech.lezioni[0].argomento = "JDK Java";
		registroFintech.lezioni[0].presenti = 25;
		System.out.println("------------------------------------");
		
		registroFintech.lezioni[1] = new Lezione();
		registroFintech.lezioni[1].argomento = "Classi e oggetti";
		registroFintech.lezioni[1].presenti = 24;
		System.out.println(registroFintech.stampaRegistro());
		
		
	}

}
