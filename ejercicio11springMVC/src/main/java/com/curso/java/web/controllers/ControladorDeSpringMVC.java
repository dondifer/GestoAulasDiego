package com.curso.java.web.controllers;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;
import com.curso.java.web.model.MensajeChulo;

import ejercicio03negocioo.AulasLN;

@Controller
@Scope("request")
public class ControladorDeSpringMVC {
	
	@Autowired
	private MensajeChulo mensajeChulo;
	@Autowired
	private AulasLN negocio;
	@Autowired
	private Aula aula;
	@Autowired
	private Alumno alumno;
	@Autowired
	private PuestoDeTrabajo puesto;
	
	
	
	
	
	// /mvc/verFormularioSpringMVC
	@RequestMapping("verFormularioSpringMVC")
	public ModelAndView verFormulario() {
		//Llamo al negocio y en el model and view le pongo  los datos.
		return new ModelAndView("formularioSpringMVC");
	}
	
	
	
	@RequestMapping("aulas")
	public ModelAndView miraAlumnosDelAula(
			@RequestParam("nombreAlumno") String nombreAlumno,
			@RequestParam("nombreAula") String nombreAula,
			HttpServletRequest request) throws Exception {
		System.out.println("El nombre es : " + nombreAlumno);
		System.out.println("Desde la request : " + request.getParameter("nombreAlumno"));
		
		
		alumno.setNombre(nombreAlumno);
		aula.setNombre(nombreAula);
		Set<PuestoDeTrabajo> puestos = new HashSet<PuestoDeTrabajo>();
		puestos.add(puesto);
		puestos.add(puesto);
		puestos.add(puesto);
		aula.setPuestosDeAlumnos(puestos);
		negocio.nuevoAula(aula);
		negocio.asignarAlumnoAAula(alumno, nombreAula);
		
		String mensaje =negocio.getAlumnosPorAula(nombreAula).toString();
		
		
	
		
//		mensajeChulo.setNombre(nombre);
//		mensajeChulo.setDescripcion("El nombre es : " + nombre);
		
		ModelAndView modelAndView = new ModelAndView("aulas");
		modelAndView.addObject("mensaje",mensaje);
		modelAndView.addObject("aula",aula);
		return modelAndView;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
