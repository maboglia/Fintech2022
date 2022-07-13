package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CodaCarte {

	public static void main(String[] args) {
//		Queue<Carta> carte = new PriorityQueue<>();//FIFO
		
		Deque<Carta> carte = new ArrayDeque<>();//LIFO

		//Pila LIFO
		
		carte.add(new Carta(1, Seme.CUORI));
		carte.add(new Carta(2, Seme.QUADRI));
		carte.add(new Carta(3, Seme.CUORI));
		carte.add(new Carta(4, Seme.FIORI));
		carte.add(new Carta(5, Seme.PICCHE));
		carte.add(new Carta(2, Seme.CUORI));
		
		Carta cartaTolta = carte.poll();
		
		
		
		
		
		System.out.println(cartaTolta);
		

	}

}
