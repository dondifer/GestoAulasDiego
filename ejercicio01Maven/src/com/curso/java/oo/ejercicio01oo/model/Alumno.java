package com.curso.java.oo.ejercicio01oo.model;

public class Alumno extends Persona {
	private boolean subvencionado;
	
	
	
	

	@Override
	public String toString() {
		return "Alumno [subvencionado=" + subvencionado + ", isSubvencionado()=" + isSubvencionado() + ", getNombre()="
				+ getNombre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Alumno(String string) {
		super(string);
		
	}

	public boolean isSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(boolean subvencionado) {
		this.subvencionado = subvencionado;
	}
}
