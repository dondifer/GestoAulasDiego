package com.curso.java.oo.model;

public class Policia extends Persona {
	private Integer numeroDePlaca; // integer es un objeto
	private CargoDePolicia cargo;
	
	public Integer getNumeroDePlaca() {
		return numeroDePlaca;
	}
	public void setNumeroDePlaca(Integer numeroDePlaca) {
		this.numeroDePlaca = numeroDePlaca;
	}
	public CargoDePolicia getCargo() {
		return cargo;
	}
	public void setCargo(CargoDePolicia cargo) {
		this.cargo = cargo;
	}
	
	//private int numeroDePlacaPrimitivo; // int es primitivo
	//private Boolean booleano;
	//private boolean booleanoPrimitivo;

	
	// Intenter de usar para los m�todos lo m�nimo posble los primitivos en los par�metros de entrada
	
}
