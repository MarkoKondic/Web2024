package com.example.KondicTravel.Service;

import java.util.List;

import com.example.KondicTravel.Models.EUloga;
import com.example.KondicTravel.Models.Korisnik;

import jakarta.servlet.http.Cookie;

public interface KorisnikService {
	Korisnik get(Long id);
	Korisnik get(String email, String lozinka);
	Korisnik get(String email);
	Korisnik findOne(Long id);
	List<Korisnik> findAll();
	Korisnik findKorisnikByEmail(String email);
	Korisnik findKorisnikByEmailAndPassowrd(String email, String lozinka);
	Korisnik save(Korisnik korisnik);
	Korisnik update(Korisnik korisnik);
	Korisnik delete(Long id);
	boolean checkCookies(Cookie[] cookies, EUloga uloga);
	Korisnik checkCookieUser(Cookie[] cookies);

}
