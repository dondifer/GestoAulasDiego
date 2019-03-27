package soprasteria.curso.ejercicio.oo;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import soprasteria.curso.ejercicio.oo.model.Alumno;
import soprasteria.curso.ejercicio.oo.model.Aula;
import soprasteria.curso.ejercicio.oo.model.Profesor;
import soprasteria.curso.ejercicio.oo.model.Puesto;

public class EjercicioGestionAula {
	public static void main(String[] args) {
		Aula aula = new Aula("Kepler",3,(double) 300,true, true,new HashSet<Puesto>());
		aula.setPuestoDelProfesor(new Puesto(true));
	for (int i = 0; i<14;i++) {	
		aula.getPuestosDeAlumnos().add(new Puesto(true));
	}
	
	aula.getPuestosDeAlumnos().add(new Puesto(false));
	System.out.println("algo");
	aula.setPuestosDeAlumnos(aula.getPuestosDeAlumnos());
	aula.getPuestoDelProfesor().setPersona(new Profesor());
	Set<Puesto> puestos = aula.getPuestosDeAlumnos();
	Iterator<Puesto> iterador = puestos.iterator();
	
	
	int numeroDeAlumnos = 12;
	while(iterador.hasNext() && numeroDeAlumnos > 0) {
		Puesto puestoActual = iterador.next();
		if(puestoActual.isOrdenador()) {
			puestoActual.setPersona(new Alumno());
			numeroDeAlumnos--;
		}
	}
	
	System.out.println("algo");
	
}
}