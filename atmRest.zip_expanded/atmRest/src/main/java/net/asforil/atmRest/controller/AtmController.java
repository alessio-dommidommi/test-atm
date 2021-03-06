package net.asforil.atmRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.asforil.atmRest.model.Atm;
import net.asforil.atmRest.service.AtmService;

@RestController
public class AtmController {
	
	@Autowired
	private AtmService service;
	
	@GetMapping("/allAtm")
	List<Atm> getAllAtm() {
		return service.getAllAtm();
	}

}
