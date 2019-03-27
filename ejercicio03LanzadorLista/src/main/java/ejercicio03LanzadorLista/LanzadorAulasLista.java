package ejercicio03LanzadorLista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Persona;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03dao.IAulaDAO;
import ejercicio03dao.ListDao;
import ejercicio03negocioo.AulasLN;

public class LanzadorAulasLista {
	public static void main(String[] args) {
		
		
		AulasLN negocio = new AulasLN(new ListDao(new ArrayList<Aula>()));
		
		HashSet<PuestoDeTrabajo> puestos1 = new HashSet<PuestoDeTrabajo>();
		HashSet<PuestoDeTrabajo> puestos2 = new HashSet<PuestoDeTrabajo>();
		HashSet<PuestoDeTrabajo> puestos3 = new HashSet<PuestoDeTrabajo>();
		
		

		Aula aula1 = new Aula("Kepler", true, true, puestos1);
		Aula aula2 = new Aula("Galileo", true, true, puestos2);
		Aula aula3 = new Aula("Newton", true, true, puestos3);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
