package com.example.KondicTravel.Models;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Putovanje {
	private Long id;
	private EPrevoznoSredstvo prevoznoSredstvo;
	private ESmestajnaJedinica smestajnaJedinica;
	private String nazivDestinacije;
	// slika lokacije
	private KategorijaPutovanja kategorijaPutovanja;
	private Long kategorijaPutovanjaId;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime datumIVremePolaska;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime datumIVremePovratka;
	
	private Long brojNocenja;
	private Long cenaAranzmana;
	private Long ukupanBrojMesta;
	private Long brojSlobodnihMesta;
	private Double procenatPopusta;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime pocetakAkcije;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime krajAkcije;
    private Double snizenaCena  = 0.0;
	public Putovanje(Long id, EPrevoznoSredstvo prevoznoSredstvo, ESmestajnaJedinica smestajnaJedinica,
			String nazivDestinacije, KategorijaPutovanja kategorijaPutovanja, Long kategorijaPutovanjaId,
			LocalDateTime datumIVremePolaska, LocalDateTime datumIVremePovratka, Long brojNocenja, Long cenaAranzmana,
			Long ukupanBrojMesta, Long brojSlobodnihMesta) {
		super();
		this.id = id;
		this.prevoznoSredstvo = prevoznoSredstvo;
		this.smestajnaJedinica = smestajnaJedinica;
		this.nazivDestinacije = nazivDestinacije;
		this.kategorijaPutovanja = kategorijaPutovanja;
		this.kategorijaPutovanjaId = kategorijaPutovanjaId;
		this.datumIVremePolaska = datumIVremePolaska;
		this.datumIVremePovratka = datumIVremePovratka;
		this.brojNocenja = brojNocenja;
		this.cenaAranzmana = cenaAranzmana;
		this.ukupanBrojMesta = ukupanBrojMesta;
		this.brojSlobodnihMesta = brojSlobodnihMesta;
	}
	
	
	public Putovanje(Long id, EPrevoznoSredstvo prevoznoSredstvo, ESmestajnaJedinica smestajnaJedinica,
			String nazivDestinacije, KategorijaPutovanja kategorijaPutovanja, Long kategorijaPutovanjaId,
			LocalDateTime datumIVremePolaska, LocalDateTime datumIVremePovratka, Long brojNocenja, Long cenaAranzmana,
			Long ukupanBrojMesta, Long brojSlobodnihMesta, Double procenatPopusta, LocalDateTime pocetakAkcije,
			LocalDateTime krajAkcije, Double snizenaCena) {
		super();
		this.id = id;
		this.prevoznoSredstvo = prevoznoSredstvo;
		this.smestajnaJedinica = smestajnaJedinica;
		this.nazivDestinacije = nazivDestinacije;
		this.kategorijaPutovanja = kategorijaPutovanja;
		this.kategorijaPutovanjaId = kategorijaPutovanjaId;
		this.datumIVremePolaska = datumIVremePolaska;
		this.datumIVremePovratka = datumIVremePovratka;
		this.brojNocenja = brojNocenja;
		this.cenaAranzmana = cenaAranzmana;
		this.ukupanBrojMesta = ukupanBrojMesta;
		this.brojSlobodnihMesta = brojSlobodnihMesta;
		this.procenatPopusta = procenatPopusta;
		this.pocetakAkcije = pocetakAkcije;
		this.krajAkcije = krajAkcije;
		this.snizenaCena = snizenaCena;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public EPrevoznoSredstvo getPrevoznoSredstvo() {
		return prevoznoSredstvo;
	}


	public void setPrevoznoSredstvo(EPrevoznoSredstvo prevoznoSredstvo) {
		this.prevoznoSredstvo = prevoznoSredstvo;
	}


	public ESmestajnaJedinica getSmestajnaJedinica() {
		return smestajnaJedinica;
	}


	public void setSmestajnaJedinica(ESmestajnaJedinica smestajnaJedinica) {
		this.smestajnaJedinica = smestajnaJedinica;
	}


	public String getNazivDestinacije() {
		return nazivDestinacije;
	}


	public void setNazivDestinacije(String nazivDestinacije) {
		this.nazivDestinacije = nazivDestinacije;
	}


	public KategorijaPutovanja getKategorijaPutovanja() {
		return kategorijaPutovanja;
	}


	public void setKategorijaPutovanja(KategorijaPutovanja kategorijaPutovanja) {
		this.kategorijaPutovanja = kategorijaPutovanja;
	}


	public Long getKategorijaPutovanjaId() {
		return kategorijaPutovanjaId;
	}


	public void setKategorijaPutovanjaId(Long kategorijaPutovanjaId) {
		this.kategorijaPutovanjaId = kategorijaPutovanjaId;
	}


	public LocalDateTime getDatumIVremePolaska() {
		return datumIVremePolaska;
	}


	public void setDatumIVremePolaska(LocalDateTime datumIVremePolaska) {
		this.datumIVremePolaska = datumIVremePolaska;
	}


	public LocalDateTime getDatumIVremePovratka() {
		return datumIVremePovratka;
	}


	public void setDatumIVremePovratka(LocalDateTime datumIVremePovratka) {
		this.datumIVremePovratka = datumIVremePovratka;
	}


	public Long getBrojNocenja() {
		return brojNocenja;
	}


	public void setBrojNocenja(Long brojNocenja) {
		this.brojNocenja = brojNocenja;
	}


	public Long getCenaAranzmana() {
		return cenaAranzmana;
	}


	public void setCenaAranzmana(Long cenaAranzmana) {
		this.cenaAranzmana = cenaAranzmana;
	}


	public Long getUkupanBrojMesta() {
		return ukupanBrojMesta;
	}


	public void setUkupanBrojMesta(Long ukupanBrojMesta) {
		this.ukupanBrojMesta = ukupanBrojMesta;
	}


	public Long getBrojSlobodnihMesta() {
		return brojSlobodnihMesta;
	}


	public void setBrojSlobodnihMesta(Long brojSlobodnihMesta) {
		this.brojSlobodnihMesta = brojSlobodnihMesta;
	}


	public Double getProcenatPopusta() {
		return procenatPopusta;
	}


	public void setProcenatPopusta(Double procenatPopusta) {
		this.procenatPopusta = procenatPopusta;
	}


	public LocalDateTime getPocetakAkcije() {
		return pocetakAkcije;
	}


	public void setPocetakAkcije(LocalDateTime pocetakAkcije) {
		this.pocetakAkcije = pocetakAkcije;
	}


	public LocalDateTime getKrajAkcije() {
		return krajAkcije;
	}


	public void setKrajAkcije(LocalDateTime krajAkcije) {
		this.krajAkcije = krajAkcije;
	}


	public Double getSnizenaCena() {
		return snizenaCena;
	}


	public void setSnizenaCena(Double snizenaCena) {
		this.snizenaCena = snizenaCena;
	}


	@Override
	public String toString() {
		return "Putovanje [id=" + id + ", prevoznoSredstvo=" + prevoznoSredstvo + ", smestajnaJedinica="
				+ smestajnaJedinica + ", nazivDestinacije=" + nazivDestinacije + ", kategorijaPutovanja="
				+ kategorijaPutovanja + ", kategorijaPutovanjaId=" + kategorijaPutovanjaId + ", datumIVremePolaska="
				+ datumIVremePolaska + ", datumIVremePovratka=" + datumIVremePovratka + ", brojNocenja=" + brojNocenja
				+ ", cenaAranzmana=" + cenaAranzmana + ", ukupanBrojMesta=" + ukupanBrojMesta + ", brojSlobodnihMesta="
				+ brojSlobodnihMesta + ", procenatPopusta=" + procenatPopusta + ", pocetakAkcije=" + pocetakAkcije
				+ ", krajAkcije=" + krajAkcije + ", snizenaCena=" + snizenaCena + "]";
	}
    
	
	
	
	
	
}
