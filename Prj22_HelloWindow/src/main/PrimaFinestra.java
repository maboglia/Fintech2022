package main;

import javax.swing.JFrame;

public class PrimaFinestra {

	public static void main(String[] args) {
		
		JFrame mioFrame = new JFrame();
		
		mioFrame.setSize(500, 400);
		mioFrame.setTitle("La mia prima finestra");
		mioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mioFrame.setVisible(true);
	}

}
