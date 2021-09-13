package com.rominaDev.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//indicar con la anotacion d JPA de persistence
@Getter
@Setter
@Entity
@Table(name = "personaje")
public class Personaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personaje_id;

	private String imagen;

	private String nombre;

	private double peso;

	private String historia;

	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinTable(name="personaje_peliculas",
	joinColumns=@JoinColumn(name="personaje_id"),
		inverseJoinColumns=@JoinColumn(name="pelicula_id"))
	List<Pelicula> peliculasAsociadas;

}
