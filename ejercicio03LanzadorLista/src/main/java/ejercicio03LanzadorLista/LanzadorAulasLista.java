package ejercicio03LanzadorLista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Persona;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03dao.IAulaDAO;
import ejercicio03dao.ListDao;
import ejercicio03negocioo.AulasLN;

public class LanzadorAulasLista {
	public static void main(String[] args) throws Exception {

		AulasLN negocio = new AulasLN(new ListDao());

		HashSet<PuestoDeTrabajo> puestos1 = new HashSet<PuestoDeTrabajo>();
		HashSet<PuestoDeTrabajo> puestos2 = new HashSet<PuestoDeTrabajo>();
		HashSet<PuestoDeTrabajo> puestos3 = new HashSet<PuestoDeTrabajo>();

		Aula aula1 = new Aula("Kepler", true, true, puestos1);
		Aula aula2 = new Aula("Galileo", true, true, puestos2);
		Aula aula3 = new Aula("Newton", true, true, puestos3);

		Alumno alumno1 = new Alumno("Pedro");
		// Alumno alumno2 = new Alumno("Maria");
		// Alumno alumno3 = new Alumno("Alba");
		// Alumno alumno4 = new Alumno("Jose");
		// Alumno alumno5 = new Alumno("Noelia");
		// Alumno alumno6 = new Alumno("Dani");
		Profesor prof = new Profesor("Señor", true);

		PuestoDeTrabajo puesto1_1 = new PuestoDeTrabajo(true, null);
		PuestoDeTrabajo puesto1_2 = new PuestoDeTrabajo(true, null);
		PuestoDeTrabajo puesto2_1 = new PuestoDeTrabajo(true, null);
		PuestoDeTrabajo puesto2_2 = new PuestoDeTrabajo(true, null);
		PuestoDeTrabajo puesto3_1 = new PuestoDeTrabajo(true, null);
		PuestoDeTrabajo puesto3_2 = new PuestoDeTrabajo(true, null);

		PuestoDeTrabajo puesto1_3 = new PuestoDeTrabajo(true, prof);

		puestos1.add(puesto1_1);
		puestos1.add(puesto1_2);
		puestos2.add(puesto2_1);
		puestos2.add(puesto2_2);
		puestos3.add(puesto3_1);
		puestos3.add(puesto3_2);

		aula1.setPuestoDelProfesor(puesto1_3);

		negocio.nuevoAula(aula1);
		negocio.nuevoAula(aula2);
		negocio.nuevoAula(aula3);

		negocio.asignarAlumnoAAula(alumno1, "Kepler");

		System.out.println(negocio.getAlumnosPorAula("Kepler"));
		System.out.println(negocio.getProfesoresPorAula("Kepler"));

		negocio.eliminarAula("Galileo");

	}
}
