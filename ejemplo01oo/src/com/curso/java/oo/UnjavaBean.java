package com.curso.java.oo;

public class UnjavaBean {
	private String campo; // private lo veo yo
	//public Double campo2; // public lo ve todo el mundo
	//protected Boolean campo3; //protected lo ven los herederos
	//BigDecimal campo4; //default lo ven todos los que están en el mismo paquete

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}
	
}
