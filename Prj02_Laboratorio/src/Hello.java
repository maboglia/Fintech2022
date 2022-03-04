
public class Hello {

	public static void main(String[] args) {
		
		
		String saluto = new String("ciao");
		String salutShort = saluto;
		String hi = "ciao";
		
		int a = 7;//byte, short,int,long
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 9;
		
		System.out.println(a);
		System.out.println(b);
				
		
		if (a == b) {
			System.out.println("sono uguali");
		} else {
			System.out.println("sono diversi");
		}
		
		if (saluto.equals(hi)) {
			System.out.println("sono uguali");
		} else {
			System.out.println("sono diverse");
		}
		

	}

}
