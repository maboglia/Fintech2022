package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

import controller.TodoCtrl;
import model.Todo;

public class Demo {

	public static void main(String[] args) {
		
		TodoCtrl ctrl = new TodoCtrl();
		
		ctrl.addTodo("latte");
		ctrl.addTodo("pane");
		ctrl.addTodo("vino");
		ctrl.addTodo("biscotti");
		ctrl.addTodo(new Todo("patatine"));
		
		//ctrl.stampaElenco();
		System.out.println(  ctrl.stampaHTML() );
		
		try {
			PrintStream ps = new PrintStream(new File("lista.html"));
			ps.println(ctrl.stampaHTML());
			ps.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
