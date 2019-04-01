package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "puesto")
@Scope(value = "prototype")
public class PuestoDeTrabajo {
	private Boolean ordenador;
	//@Autowired
	private Persona persona;
	
	
	
	
	
//	public PuestoDeTrabajo(boolean ordenador, Persona persona) {
//		super();
//		this.ordenador = ordenador;
//		this.persona = persona;
//	}
//	public PuestoDeTrabajo(boolean ordenador) {
//		this.ordenador = ordenador;
//	}

	public Boolean getOrdenador() {
		return ordenador;
	}
	public void setOrdenador(Boolean ordenador) {
		this.ordenador = ordenador;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}
