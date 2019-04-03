package com.curso.java.spring.jpa;

import java.util.List;

import javax.security.auth.login.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.curso.java.spring.jpa.model.entities.Pelicula;
import com.curso.java.spring.jpa.model.negocio.GestionPeliculas;

public class LanzadorJPA {
	
	private static ApplicationContext context;
	
	
	static {
		context = new AnnotationConfigApplicationContext(Configuration.class);
		
	}
public static void main(String[] args) {
	System.out.println("Inicializamos la base de datos");
	Pelicula pelicula = new Pelicula();
	pelicula.setTitulo("adf");
	pelicula.setDirector("yuio");
	pelicula.setYear(1999);
	
	GestionPeliculas gestionPeliculas = context.getBean(GestionPeliculas.class);
	
	gestionPeliculas.insertar(pelicula);
	System.out.println("Pelicula insertada");
	List<Pelicula>peliculas = gestionPeliculas.listar();
	System.out.println(peliculas);
	
	
}

}
