package main;

public class ProvaThread02 {
	
	
	public static void main(String[] args) {

				
		new Thread(() -> System.out.println("sono un runnable")).start();

	}

}
