package com.nttdata.bootcamp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.*;
@RestController
public class Controller {

	@Autowired
	private Saludo saludo;
	
	@GetMapping(path="/prueba")
	public String pruebaSaludo(){
		return saludo.mensajeSaludo();
	}
}
