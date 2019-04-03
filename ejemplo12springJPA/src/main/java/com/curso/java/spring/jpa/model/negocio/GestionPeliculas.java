package com.curso.java.spring.jpa.model.negocio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.java.spring.jpa.model.dao.PeliculaDao;
import com.curso.java.spring.jpa.model.entities.Pelicula;

@Service
public class GestionPeliculas {
	
	@Autowired
	private PeliculaDao peliculaDao;

	@Transactional
	public void insertar(Pelicula pelicula) {
		peliculaDao.insertar(pelicula);
	}
	
	public List<Pelicula> listar(){
		return peliculaDao.listar();
	}
}
