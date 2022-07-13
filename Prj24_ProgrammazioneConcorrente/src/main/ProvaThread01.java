package main;

public class ProvaThread01 {

	public static synchronized void stampaStringa(String s) {
		
		char[] charArray = s.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		
		
		MioThread mt = new MioThread("angela", 800);
		MioThread mt2 = new MioThread("paul", 1500);

		
		
		mt.start();
		mt2.start();
		
		String name = mt.getName();
		
		System.out.println(name);
		
		
		for (int i = 0; i < 5; i++) {
			try {
//				mt.join();
//				mt2.join();
				Thread.sleep(1000);
				Thread currentThread = Thread.currentThread();
				
				System.out.println(currentThread.getName());
				
				//System.out.println("Angela è viva? " + mt.isAlive());	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//System.out.println("pippo " + i);
			stampaStringa("pippo " + i);
			
		}
		
		System.out.println("Morte del main");

	}

}
