package primo;

public class ProvaScorrimentoArray {

	public static void main(String[] args) {
		//int[] voti = new int[4];
//		voti[0] = 25;
		int[] voti = {26,26,26,29};
		
		int totale = 0;
		
		for (int i = 0; i < voti.length; i++) {
			System.out.println(voti[i]);
			totale += voti[i];
		}
		
		System.out.println("Il totale dei voti è: " + totale);
		
		double media = (double) totale / voti.length;
		
		System.out.println("la media dei voti è: " + media);
		
		
		
	}

}
