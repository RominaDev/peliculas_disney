package com.rominaDev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rominaDev.model.Personaje;
import com.rominaDev.repo.IPersonajeRepo;

@Service
public class PersonajeServiceImpl implements IPersonajeService {

	@Autowired
	private IPersonajeRepo repo;

	@Transactional
	public List<Personaje> listarPersonajes() {
		return (List<Personaje>)repo.findAll();
	}

	@Override
	public Optional<Personaje> findById(int id) {

		return repo.findById(id);
	}

	@Override
	public Personaje crearPersonaje(Personaje personaje) {

		return repo.save(personaje);
	}

	@Override
	public void deletePersonaje(int id) {

		repo.deleteById(id);
	}

}
