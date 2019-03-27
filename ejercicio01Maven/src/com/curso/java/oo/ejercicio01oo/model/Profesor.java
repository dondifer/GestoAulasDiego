package com.curso.java.oo.ejercicio01oo.model;

public class Profesor extends Persona {
	private boolean malaLeche;
	
	

	@Override
	public String toString() {
		return "Profesor [malaLeche=" + malaLeche + ", isMalaLeche()=" + isMalaLeche() + ", getNombre()=" + getNombre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Profesor(String string,boolean malaLeche) {
		super(string);
		this.malaLeche = malaLeche;
	}

	public boolean isMalaLeche() {
		return malaLeche;
	}

	public void setMalaLeche(boolean malaLeche) {
		this.malaLeche = malaLeche;
	}
}
