package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {

	public ArrayList<Todo> elenco;
	
	public TodoCtrl() {
		this.elenco = new ArrayList<Todo>();
	}
	
	public void addTodo(Todo t) {
		this.elenco.add(t);
	}
	
	public void addTodo(String s) {
		this.elenco.add(new Todo(s));
	}
	
	public void stampaElenco() {
		for (Todo todo : elenco) {
			System.out.println(todo);
		}
	}
	
	public String stampaHTML() {
		String output = "";
		
		output += "<ul>";
		
		for (Todo todo : elenco) {
			output += "<li>" + todo.cosaDaFare + "</li>";
		}
		
		output += "</ul>";
		
		return output;
		
		
	}
	
}
