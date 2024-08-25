package com.example.KondicTravel.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KondicTravel.Dao.KorisnikDao;
import com.example.KondicTravel.Models.EUloga;
import com.example.KondicTravel.Models.Korisnik;
import com.example.KondicTravel.Service.KorisnikService;

import jakarta.servlet.http.Cookie;

@Service
public class KorisnikServiceImpl implements KorisnikService {
	
	@Autowired
	private KorisnikDao korisnikDao;

	
	
	
	@Override
	public Korisnik get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik get(String email, String lozinka) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Korisnik> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik findKorisnikByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik findKorisnikByEmailAndPassowrd(String email, String lozinka) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik save(Korisnik korisnik) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik update(Korisnik korisnik) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkCookies(Cookie[] cookies, EUloga uloga) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Korisnik checkCookieUser(Cookie[] cookies) {
		// TODO Auto-generated method stub
		return null;
	}

}
