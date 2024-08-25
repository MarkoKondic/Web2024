package com.example.KondicTravel.Models;

public class KategorijaPutovanja {
	private Long id;
	private String nazivKategorije;
	private String opis;
	public KategorijaPutovanja(Long id, String nazivKategorije, String opis) {
		super();
		this.id = id;
		this.nazivKategorije = nazivKategorije;
		this.opis = opis;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNazivKategorije() {
		return nazivKategorije;
	}
	public void setNazivKategorije(String nazivKategorije) {
		this.nazivKategorije = nazivKategorije;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	@Override
	public String toString() {
		return "KategorijaPutovanja [id=" + id + ", nazivKategorije=" + nazivKategorije + ", opis=" + opis + "]";
	}
	
	
	
}
