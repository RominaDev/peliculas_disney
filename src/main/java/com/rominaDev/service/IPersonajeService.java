package com.rominaDev.service;

import java.util.List;
import java.util.Optional;

import com.rominaDev.model.Personaje;

public interface IPersonajeService {

	public List <Personaje> listarPersonajes();
	
	public Optional <Personaje> findById(int id);
	
	public Personaje crearPersonaje(Personaje personaje);
	
	public void deletePersonaje (int id);
	
}
