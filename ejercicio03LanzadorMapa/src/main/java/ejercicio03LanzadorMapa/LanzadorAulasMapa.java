package ejercicio03LanzadorMapa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class LanzadorAulasMapa {
	public static void main(String[] args) {
		
		
		
		Set<PuestoDeTrabajo> puesto1 = new HashSet<PuestoDeTrabajo>();
		Set<PuestoDeTrabajo> puesto2 = new HashSet<PuestoDeTrabajo>();
		Set<PuestoDeTrabajo> puesto3 = new HashSet<PuestoDeTrabajo>();
		
		Aula aula1 = new Aula("Edison", true, true, puesto1);
		Aula aula2 = new Aula("Einstein", true, true, puesto2);
		Aula aula3 = new Aula("Tesla", true, true, puesto3);
		
		System.out.println("Aulas creadas");
		
		
	}

}
