package com.rominaDev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rominaDev.model.Pelicula;

@Repository
public interface IPeliculaRepo extends JpaRepository<Pelicula, Integer  > {

	
}
