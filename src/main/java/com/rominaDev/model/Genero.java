package com.rominaDev.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="genero")
public class Genero {

	@Id
	private Long genero_id;
	
	private String nombre;
	
	private String imagen;
	
	@OneToMany
	private List <Personaje> personajesAsociados;
	
}
