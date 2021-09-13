package com.rominaDev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.rominaDev.model.Personaje;

@Repository
public interface IPersonajeRepo extends JpaRepository<Personaje, Integer  > {

}
