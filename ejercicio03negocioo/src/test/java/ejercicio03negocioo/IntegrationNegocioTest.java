package ejercicio03negocioo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03dao.ListDao;

public class IntegrationNegocioTest {
	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void nuevoAulaTest() {
		ListDao ejemplolistDao = new ListDao();
		AulasLN negocio = new AulasLN();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		negocio.setAulaDao(ejemplolistDao);
		Aula aula = new Aula();
		negocio.nuevoAula(aula);
		
		assertTrue("No añade el aula",negocio.getAulaDao().getAula(null).equals(aula));
		
	}
	
	
	@Test
	public void getAlumnosPorAulaTest() throws Throwable  {
		ListDao ejemplolistDao = new ListDao();
		AulasLN negocio = new AulasLN();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		negocio.setAulaDao(ejemplolistDao);
		Aula aula = new Aula();
		aula.setNombre("Alguna");
		
		Set<PuestoDeTrabajo>puestos = new HashSet<PuestoDeTrabajo>();
		puestos.add(new PuestoDeTrabajo());
		puestos.add(new PuestoDeTrabajo());
		puestos.add(new PuestoDeTrabajo());
		aula.setPuestosDeAlumnos(puestos);
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Untio");
		
		negocio.nuevoAula(aula);
		
		
		
			
				negocio.asignarAlumnoAAula(alumno1, "Alguna");
		
				
			
		
		
		assertTrue("No ha colocado al alumno",negocio.getAlumnosPorAula("Alguna").size()==1);
	}
	
	@Test
	public void getProfesoresPorAulaTest() {
		
		ListDao ejemplolistDao = new ListDao();
		AulasLN negocio = new AulasLN();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		negocio.setAulaDao(ejemplolistDao);
		Aula aula = new Aula();
		aula.setNombre("Alguna");
		
		PuestoDeTrabajo puestoprof = new PuestoDeTrabajo();
		
		Profesor prof = new Profesor();
		prof.setNombre("SeñorX");
		
		puestoprof.setPersona(prof);
		
		
		aula.setPuestoDelProfesor(puestoprof);
		
		negocio.nuevoAula(aula);
		
	
		
		assertTrue("No da los profesores",negocio.getProfesoresPorAula("Alguna").size() == 1);
	}
	
	
	@Test
	public void asignarAlumnoAAulaTest() throws Throwable {
		ListDao ejemplolistDao = new ListDao();
		AulasLN negocio = new AulasLN();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		negocio.setAulaDao(ejemplolistDao);
		Aula aula = new Aula();
		aula.setNombre("Alguna");
		
		Set<PuestoDeTrabajo>puestos = new HashSet<PuestoDeTrabajo>();
		puestos.add(new PuestoDeTrabajo());
		puestos.add(new PuestoDeTrabajo());
		puestos.add(new PuestoDeTrabajo());
		aula.setPuestosDeAlumnos(puestos);
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Untio");
		
		negocio.nuevoAula(aula);
		
		
		
			
				negocio.asignarAlumnoAAula(alumno1, "Alguna");
		
				
			
		
		
		assertTrue("No ha colocado al alumno",negocio.getAlumnosPorAula("Alguna").size()==1);
	}
	
	@Test
	public void eliminarAulaTest() {
		ListDao ejemplolistDao = new ListDao();
		AulasLN negocio = new AulasLN();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		negocio.setAulaDao(ejemplolistDao);
		Aula aula = new Aula();
		aula.setNombre("Alguna");
		
		negocio.nuevoAula(aula);
		
		negocio.eliminarAula("Alguna");
		
		
		assertTrue("No ha eliminado el aula",negocio.getAulaDao().getAulas().size()==0);
	}

}
