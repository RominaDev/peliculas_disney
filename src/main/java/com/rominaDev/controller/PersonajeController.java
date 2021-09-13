package com.rominaDev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rominaDev.model.Personaje;
import com.rominaDev.service.IPersonajeService;
import com.rominaDev.service.PersonajeServiceImpl;

@Controller
@RequestMapping
public class PersonajeController {

	@Autowired
	private IPersonajeService service;

	//@GetMapping	("/characters")
	//public String listar(Model model) {
	//	List<Personaje> personajes = service.listarPersonajes();
	//	model.addAttribute("personajes", personajes);
	//	return "tablePersonajes	";
	//}
	
	
}
