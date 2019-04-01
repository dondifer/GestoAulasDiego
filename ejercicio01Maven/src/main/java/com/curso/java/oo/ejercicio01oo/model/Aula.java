package com.curso.java.oo.ejercicio01oo.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Aula {
	@Value("")
	private String nombre;
	private Boolean proyector;
	private Boolean pizarra;
	@Autowired
	@Qualifier("puesto")
	private PuestoDeTrabajo puestoDelProfesor;
	@Autowired
	@Qualifier("puestosDeAlumnos")
	private Set<PuestoDeTrabajo> puestosDeAlumnos;
	
	
	
	public Boolean getProyector() {
		return proyector;
	}
	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}
	public Boolean getPizarra() {
		return pizarra;
	}
	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}
	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + ", proyector=" + proyector + ", pizarra=" + pizarra + ", puestoDelProfesor="
				+ puestoDelProfesor + ", puestosDeAlumnos=" + puestosDeAlumnos + "]";
	}
//	public Aula(String nombre, boolean proyector, boolean pizarra, Set<PuestoDeTrabajo> puestosDeAlumnos) {
//		super();
//		this.nombre = nombre;
//		this.proyector = proyector;
//		this.pizarra = pizarra;
//		this.puestosDeAlumnos = puestosDeAlumnos;
//	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
		System.out.println("Nombre de aula "+ nombre + " colocado");
	}
	
	public PuestoDeTrabajo getPuestoDelProfesor() {
		return puestoDelProfesor;
	}
	public void setPuestoDelProfesor(PuestoDeTrabajo puestoDelProfesor) {
		this.puestoDelProfesor = puestoDelProfesor;
	}
	public Set<PuestoDeTrabajo> getPuestosDeAlumnos() {
		return puestosDeAlumnos;
	}
	public void setPuestosDeAlumnos(Set<PuestoDeTrabajo> puestosDeAlumnos) {
		this.puestosDeAlumnos = puestosDeAlumnos;
	}

}
