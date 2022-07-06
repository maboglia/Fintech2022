package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IndovinaNumero extends JFrame {
	
	private JTextField numeroScelto;
	private JButton bottone;
	private JTextPane output;
	
	private int numeroCasuale;
	
	public IndovinaNumero() {
		getContentPane().setBackground(new Color(238, 130, 238));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Indovina il numero");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(44, 11, 338, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserisci un numero tra 1 e 100");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(57, 97, 205, 14);
		getContentPane().add(lblNewLabel_1);
		
		numeroScelto = new JTextField();
		numeroScelto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlla();
			}
		});
		numeroScelto.setBounds(277, 94, 86, 20);
		getContentPane().add(numeroScelto);
		numeroScelto.setColumns(10);
		
		bottone = new JButton("Prova");
		bottone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlla();
			}
		});
		bottone.setBounds(277, 125, 89, 23);
		getContentPane().add(bottone);
		
		output = new JTextPane();
		output.setBounds(57, 169, 306, 59);
		getContentPane().add(output);
	}

	public void nuovoGioco() {
		this.numeroCasuale = (int)(Math.random()*100)+1;
		this.output.setText("Inizia un nuovo gioco. \nInserisci un numero intero tra 1 e 100, poi premi il pulsante");
	}
	
	public void controlla() {
		
		String scelta = this.numeroScelto.getText();//quello che user scrive nel campo di text
		String messaggio = "";
		
		try {
			int guess = Integer.parseInt(scelta);//se ha scritto correttamente
			
			if (guess > this.numeroCasuale) {
				messaggio = "troppo grande, prova ancora!";
			}
			
			else if (guess < this.numeroCasuale) {
				messaggio = "troppo piccolo, prova ancora!";
			}
			else {
				messaggio = "hai indovinato!!!";
			}
			//this.output.setText(messaggio);
			
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			messaggio = "Devi inserire un numero intero!!!";
		}
		
		this.output.setText(messaggio);
		
		this.numeroScelto.requestFocus();
		this.numeroScelto.selectAll();
		
	}
	
	public static void main(String[] args) {
		
		IndovinaNumero gioco = new IndovinaNumero();
		gioco.nuovoGioco();
		gioco.setSize(500, 400);
		gioco.setTitle("Indovina il numero");
		gioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gioco.setVisible(true);
	}
}
