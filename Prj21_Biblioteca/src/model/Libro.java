package model;

public class Libro {
	private String codice,autore,titolo,editore,anno,luogo,pagine,classificazione;

	public Libro() {}
	
	public Libro(String codice, String autore, String titolo, String editore, String anno, String luogo, String pagine,
			String classificazione) {
		this.codice = codice;
		this.autore = autore;
		this.titolo = titolo;
		this.editore = editore;
		this.anno = anno;
		this.luogo = luogo;
		this.pagine = pagine;
		this.classificazione = classificazione;
	}



	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public String getPagine() {
		return pagine;
	}

	public void setPagine(String pagine) {
		this.pagine = pagine;
	}

	public String getClassificazione() {
		return classificazione;
	}

	public void setClassificazione(String classificazione) {
		this.classificazione = classificazione;
	}

	@Override
	public String toString() {
		return "Libro [codice=" + codice + ", autore=" + autore + ", titolo=" + titolo + ", editore=" + editore
				+ ", anno=" + anno + ", luogo=" + luogo + ", pagine=" + pagine + ", classificazione=" + classificazione
				+ "]";
	}


}
