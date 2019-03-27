package ejercicio03dao;

import java.util.Collection;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class MapDao implements IAulaDAO {

	private Map<String, Aula> edificio;

	public void createAula(Aula aula) {

		edificio.put(aula.getNombre(), aula);

	}

	public Collection<Aula> getAulas() {

		return edificio.values();
	}

	public void updateAula(Aula aula) {
		edificio.put(aula.getNombre(), aula);

	}

	public void deleteAula(String nombre) {
		edificio.remove(nombre);

	}

	public Aula getAula(String nombre) {
		
		return edificio.get(nombre);
	}

}
