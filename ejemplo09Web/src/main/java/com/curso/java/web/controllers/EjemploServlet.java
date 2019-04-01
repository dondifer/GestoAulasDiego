package com.curso.java.web.controllers;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03negocioo.AulasLN;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/patatas", "/limones" })
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;

	@Override
	public void init() throws ServletException {

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;

		AulasLN negocio = (AulasLN) context.getBean(AulasLN.class);
		Aula aula1 = context.getBean(Aula.class);
		aula1.setNombre("Kepler");
		Aula aula2 = context.getBean(Aula.class);
		aula2.setNombre("LOL");
		Alumno alumno1 = context.getBean(Alumno.class);
		alumno1.setNombre("Gervasio");
		Alumno alumno2 = context.getBean(Alumno.class);
		alumno2.setNombre("Maria");
		Alumno alumno3 = context.getBean(Alumno.class);
		alumno3.setNombre("Juana");
		PuestoDeTrabajo puesto1 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto2 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto3 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto4 = context.getBean(PuestoDeTrabajo.class);

		Set<PuestoDeTrabajo> puestosKepler = (Set<PuestoDeTrabajo>) context.getBean("puestosDeAlumnos");

		puestosKepler.add(puesto1);
		puestosKepler.add(puesto2);
		puestosKepler.add(puesto3);
		puestosKepler.add(puesto4);

		negocio.nuevoAula(aula1);

		try {
			negocio.asignarAlumnoAAula(alumno1, "Kepler");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			negocio.asignarAlumnoAAula(alumno2, "Kepler");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			negocio.asignarAlumnoAAula(alumno3, "Kepler");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Collection<Alumno> alumnosKepler = negocio.getAlumnosPorAula("Kepler");
		Iterator<Alumno> itAlumns = alumnosKepler.iterator();

		Alumno alu1 = itAlumns.next();
		Alumno alu2 = itAlumns.next();
		Alumno alu3 = itAlumns.next();

		request.setAttribute("alumno1", alu1);// context.getBean("mensajeSingleton")
		request.setAttribute("alumno2", alu2);// context.getBean("mensajePrototype")
		request.setAttribute("alumno3", alu3);// context.getBean("mensajeRequest")
		// request.setAttribute("mensajeSession", context.getBean("mensajeSession"));
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);

	}

}
