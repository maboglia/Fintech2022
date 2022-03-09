package model;

public class Todo {

	public String cosaDaFare;
	public boolean completo;
	
	public Todo(String cosaDaFare) {
		this.cosaDaFare = cosaDaFare;
		this.completo = false;
	}

	@Override
	public String toString() {
		
		String done = "[ ]";
		if (completo) {
			done = "[*]";
		}
		
		return done + "[" + cosaDaFare + "]";
	}
	
	
}
