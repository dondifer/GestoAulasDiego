package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Persona {
	
	private String nombre;
	
	
//
//	public Persona() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

//	public Persona(String nombre) {
//		super();
//		this.nombre = nombre;
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Nombre "+ nombre+ " colocado");
	}
}
