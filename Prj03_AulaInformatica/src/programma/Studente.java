package programma;

public class Studente {

	int nMatricola;
	String nome;
	String cognome;
	
	
	/**
	 * Costruttore degli oggetti di tipo studente
	 * @param nMatricola passare come primo arg il numero di matricola
	 * @param nome Stringa nome studente
	 * @param cognome Stringa cognome studente
	 */
	public Studente(int nMatricola, String nome, String cognome) {
		this.nMatricola = nMatricola;
		this.nome = nome;
		this.cognome = cognome;
	}


	@Override
	public String toString() {
		return "Studente [nMatricola=" + nMatricola + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
	
}
