package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alumno extends Persona {
	private Boolean subvencionado;
	
	
	
	

	public Boolean getSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(Boolean subvencionado) {
		this.subvencionado = subvencionado;
	}

	@Override
	public String toString() {
		return "Alumno [subvencionado=" + subvencionado + ", isSubvencionado()=" + getSubvencionado() + ", getNombre()="
				+ getNombre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

//	public Alumno(String string) {
//		super(string);
//		
//	}

	
}
