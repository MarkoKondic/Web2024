package com.example.KondicTravel.Dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.KondicTravel.Dao.KorisnikDao;
import com.example.KondicTravel.Models.Korisnik;

@Repository
public class KorisnikDaoImpl implements KorisnikDao {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	@Override
	public Korisnik findOne(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik findOne(String email, String lozinka) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik findKorisnikByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik findKorisnikByEmailAndPassword(String email, String lozinka) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Korisnik> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Korisnik korisnik) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Korisnik korisnik) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
