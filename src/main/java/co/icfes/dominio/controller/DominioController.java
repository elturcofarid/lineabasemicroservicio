package co.icfes.dominio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.icfes.dominio.services.DominioService;

@RestController
public class DominioController {
	
	@Autowired
	private DominioService dominio;
	
	
	
	@GetMapping(path = "/individual/id")
	public String consultaId() {
		dominio.consultarId();
		System.out.println(" se ejecuto el get del servicio");
		return "";
	}
	
	@PostMapping(path = "/individual", consumes = "application/json", produces = "application/json")
	public String consultarIndividual(@RequestBody String request) {
		return null;
	}

}
