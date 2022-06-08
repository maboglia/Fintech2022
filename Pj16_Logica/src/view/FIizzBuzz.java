package view;

public class FIizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 100 ; i++) {
			System.out.println(i);
			if((i%5==0)&&(i%3==0)) {
				System.out.println("FIZZBUZZ");
			}else {
				if(i%3==0) {
					System.out.println("FIZZ");
				}
				if(i%5==0) {
					System.out.println("BUZZ");
				}
			
			}
			
		}
		
	}

}
