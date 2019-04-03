package com.curso.java.spring.jpa.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="titulo")
	private String titulo;
	private String autor;
	private String director;
	private int year;
	
	

	public Pelicula(int id, String titulo, String autor, String director, int year) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.director = director;
		this.year = year;
	}
	
	

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", director=" + director + ", year="
				+ year + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
