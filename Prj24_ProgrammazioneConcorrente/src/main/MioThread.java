package main;

public class MioThread extends Thread{

	private String nome;
	private int durata;
	
	public MioThread(String nome, int durata) {
		this.nome = nome;
		this.durata = durata;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			//System.out.println("messaggio dal thread " + nome);
			
			ProvaThread01.stampaStringa("messaggio dal thread " + nome);
			
			ProvaThread01.stampaStringa("esecuzione n. " + i);
			try {
				sleep(this.durata);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
	
}
