package com.example.KondicTravel.Dao;

import java.util.List;

import com.example.KondicTravel.Models.Korisnik;

public interface KorisnikDao {
	public Korisnik findOne(String email);
	public Korisnik findOne(String email, String lozinka);
	public Korisnik findOne(Long id);
	public Korisnik findKorisnikByEmail(String email);
	public Korisnik findKorisnikByEmailAndPassword(String email, String lozinka);
	public List<Korisnik> findAll();
	public int save(Korisnik korisnik);
	public int update(Korisnik korisnik);
	public int delete(Long id);
}
