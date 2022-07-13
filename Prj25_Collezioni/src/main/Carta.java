package main;

import java.util.Objects;

public class Carta implements Comparable<Carta> {

	private int valore;
	private Seme seme;
	
	public Carta(int valore, Seme seme) {
		
		this.valore = valore;
		this.seme = seme;
	}

	public int getValore() {
		return valore;
	}
	
	public Seme getSeme() {
		return seme;
	}
	
	@Override
	public String toString() {
		return "Carta [valore=" + valore + ", seme=" + seme + "]";
	}

	@Override
	public int compareTo(Carta altra) {
		
		return this.valore - altra.valore;
	}

	@Override
	public int hashCode() {
		return Objects.hash(seme, valore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return seme == other.seme && valore == other.valore;
	}
	
	
	
	
}
