package model;

import java.util.Random;

public class Word {

	private String secret = "";
	
	private String[] paroleSegrete = {"pizza", "bimbo", "carta"};
	
	public void genera() {
		
		Random r = new Random();
		
		this.secret = paroleSegrete[r.nextInt(paroleSegrete.length)];
		
	}
	
	public String getSecret() {
		if (secret.isEmpty())
			this.genera();
		
		return secret;
	}
	
}
