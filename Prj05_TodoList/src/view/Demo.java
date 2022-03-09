package view;

import java.util.ArrayList;

import model.Todo;

public class Demo {

	public static void main(String[] args) {
		
		Todo t = new Todo("studiare Java");
		Todo t2 = new Todo("studiare C#");
		
		ArrayList<Todo> lista = new ArrayList<Todo>();
		
		lista.add(t);
		lista.add(t2);
		
		for (Todo todo : lista) {//foreach
			System.out.println(todo);
		}
		
		for (int i = lista.size()-1; i >=0; i--) {
			System.out.println(lista.get(i));
		}
		
		
		
	}

}
