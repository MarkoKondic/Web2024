package com.example.KondicTravel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
//	@Autowired
//	private KorisnikService korisnikService;
//	
//	@Autowired
//	private PutovanjeService putovanjeService;
//	
	@GetMapping("/KondicTravel")
	public String getIndex() {
		return "index";
	}
	
}
