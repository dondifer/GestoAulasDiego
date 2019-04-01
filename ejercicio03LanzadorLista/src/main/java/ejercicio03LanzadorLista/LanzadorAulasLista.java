package ejercicio03LanzadorLista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//import java.util.Set;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

//import com.curso.java.oo.ejercicio01oo.model.Alumno;
//import com.curso.java.oo.ejercicio01oo.model.Aula;
//import com.curso.java.oo.ejercicio01oo.model.Persona;
//import com.curso.java.oo.ejercicio01oo.model.Profesor;
//import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03dao.IAulaDAO;
import ejercicio03dao.ListDao;
import ejercicio03negocioo.AulasLN;




public class LanzadorAulasLista {
	
	public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beanContext.xml");
	}
	
	
	public static void main(String[] args) throws Exception {

		AulasLN negocio =  (AulasLN) context.getBean("aulasLN",AulasLN.class);
		Aula aula1 = context.getBean(Aula.class);
		aula1.setNombre("Kepler");
		Aula aula2 = context.getBean(Aula.class);
		aula2.setNombre("LOL");
		Alumno alumno1= context.getBean(Alumno.class);
		alumno1.setNombre("Gervasio");
		Alumno alumno2= context.getBean(Alumno.class);
		alumno1.setNombre("Maria");
		Alumno alumno3= context.getBean(Alumno.class);
		alumno1.setNombre("Juana");
		PuestoDeTrabajo puesto1 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto2 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto3 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puesto4 = context.getBean(PuestoDeTrabajo.class);
		Set<PuestoDeTrabajo> puestosKepler= (Set<PuestoDeTrabajo>) context.getBean("puestosDeAlumnos");
		Set<PuestoDeTrabajo> puestosLOL= (Set<PuestoDeTrabajo>) context.getBean("puestosDeAlumnos");
		
		
		puestosKepler.add(puesto1);
		puestosKepler.add(puesto2);
		puestosKepler.add(puesto3);
		puestosKepler.add(puesto4);
		
		
		negocio.asignarAlumnoAAula(alumno1, "Kepler");
		negocio.asignarAlumnoAAula(alumno2, "Kepler");
		negocio.asignarAlumnoAAula(alumno3, "Kepler");
		
		
		
//		AulasLN negocio = new AulasLN((IAulaDAO) context.getBean("ListAulaDao"));
		
		
		
		
	
		
		
//		HashSet<PuestoDeTrabajo> puestos1 = new HashSet<PuestoDeTrabajo>();
//		HashSet<PuestoDeTrabajo> puestos2 = new HashSet<PuestoDeTrabajo>();
//		HashSet<PuestoDeTrabajo> puestos3 = new HashSet<PuestoDeTrabajo>();
//
	
//		Aula aula2 = new Aula("Galileo", true, true, puestos2);
//		Aula aula3 = new Aula("Newton", true, true, puestos3);
//		
//		Aula aula4 = (Aula) context.getBean("nuevaAula");

//		Alumno alumno1 = new Alumno("Pedro");
//		// Alumno alumno2 = new Alumno("Maria");
//		// Alumno alumno3 = new Alumno("Alba");
//		// Alumno alumno4 = new Alumno("Jose");
//		// Alumno alumno5 = new Alumno("Noelia");
//		// Alumno alumno6 = new Alumno("Dani");
//		Profesor prof = new Profesor("Señor", true);
//
//		PuestoDeTrabajo puesto1_1 = new PuestoDeTrabajo(true, null);
//		PuestoDeTrabajo puesto1_2 = new PuestoDeTrabajo(true, null);
//		PuestoDeTrabajo puesto2_1 = new PuestoDeTrabajo(true, null);
//		PuestoDeTrabajo puesto2_2 = new PuestoDeTrabajo(true, null);
//		PuestoDeTrabajo puesto3_1 = new PuestoDeTrabajo(true, null);
//		PuestoDeTrabajo puesto3_2 = new PuestoDeTrabajo(true, null);
//
//		PuestoDeTrabajo puesto1_3 = new PuestoDeTrabajo(true, prof);
//
//		puestos1.add(puesto1_1);
//		puestos1.add(puesto1_2);
//		puestos2.add(puesto2_1);
//		puestos2.add(puesto2_2);
//		puestos3.add(puesto3_1);
//		puestos3.add(puesto3_2);
//
//		aula1.setPuestoDelProfesor(puesto1_3);

//		negocio.nuevoAula(aula1);
//		negocio.nuevoAula(aula2);
//		negocio.nuevoAula(aula3);
////		negocio.nuevoAula(aula4);
//
//		negocio.asignarAlumnoAAula(alumno1, "Kepler");
//
//		System.out.println(negocio.getAlumnosPorAula("Kepler"));
//		System.out.println(negocio.getProfesoresPorAula("Kepler"));
//
//		negocio.eliminarAula("Galileo");

	}
}
