package com.rominaDev.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pelicula_id;

	private String imagen;

	private String titulo;

	private Date fechaCreacion;

	private int calificacion;

	@ManyToMany
	private List<Personaje> personajesAsociados;

	@JsonIgnore //para no sobrecargar de datos 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "genero_id")
	private Genero genero;

}
