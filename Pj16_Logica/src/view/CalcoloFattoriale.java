package view;

public class CalcoloFattoriale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int i = fattoriale(x);
		System.out.println(i);

	}

	private static int fattoriale(int x) {
//		int fattoriale=1;
//		int i=1;
//		while(x<i) {
//			fattoriale*=x*(x-i);
//			i++;
//		}
		if (x==0)
			return 1;
		else 
			return x*fattoriale(x-1);
	}
	
	

}
