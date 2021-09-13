package com.rominaDev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rominaDev.model.Genero;
import com.rominaDev.model.Pelicula;

@Repository
public interface IGeneroRepo extends JpaRepository<Genero, Integer  >  {

}
