package ejercicio03negocioo;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
//import com.curso.java.oo.ejercicio01oo.model.Persona;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
import java.util.Set;

import ejercicio03dao.IAulaDAO;

public class AulasLN {
	private IAulaDAO aulaDao ;
	
	
	
	

	public AulasLN(IAulaDAO aulaDao) {
		super();
		this.aulaDao = aulaDao;
	}



	public void nuevoAula(Aula aula) {

		aulaDao.createAula(aula);
	}

	public Collection<Alumno> getAlumnosPorAula(String nombreAula) {
		
		
		Collection<Alumno> estudiante = new HashSet<Alumno>();
		Collection<PuestoDeTrabajo> puestos = aulaDao.getAula(nombreAula).getPuestosDeAlumnos();

		for (PuestoDeTrabajo puesto : puestos) {
			estudiante.add((Alumno) puesto.getPersona());
		}
		return estudiante;
	}

	public Collection<Profesor> getProfesoresPorAula(String nombreAula) {
		Collection<Profesor> profesores = new HashSet<Profesor>();
		PuestoDeTrabajo puestoDelProfesor = aulaDao.getAula(nombreAula).getPuestoDelProfesor();
		//TODO: Y si hay un profe entre los alumnos!
		if(puestoDelProfesor.getPersona() != null && puestoDelProfesor.getPersona() instanceof Profesor) {
			profesores.add((Profesor) puestoDelProfesor.getPersona());
		}

		return profesores;
	}

	public void asignarAlumnoAAula(Alumno alumno, String nombreaula) throws Exception {
		Set<PuestoDeTrabajo> puestos = aulaDao.getAula(nombreaula).getPuestosDeAlumnos();
		Iterator<PuestoDeTrabajo> itr = puestos.iterator();
		
		while (itr.hasNext()) {
			PuestoDeTrabajo puestoDeTrabajo = itr.next();
			if(puestoDeTrabajo.getPersona() == null) {
				puestoDeTrabajo.setPersona(alumno);
				return;
			}
			
		}
		throw new Exception("No hay sitio en el aula!");
	}

	public void eliminarAula(String nombre) {

		aulaDao.deleteAula(nombre);
	}

}
