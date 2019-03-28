package ejercicio03dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class MapDao implements IAulaDAO {

	private Map<String, Aula> edificio ; 

	



//	public MapDao() {
//		super();
//		this.edificio = new HashMap<String,Aula>();
//	}







	public Map<String, Aula> getEdificio() {
		return edificio;
	}

	public void setEdificio(Map<String, Aula> edificio) {
		this.edificio = edificio;
	}

	public void createAula(Aula aula) {

		edificio.put(aula.getNombre(), aula);
		System.out.println("Aula " + aula.getNombre() + " creada");

	}

	public Collection<Aula> getAulas() {

		return edificio.values();
	}

	public void updateAula(Aula aula) {
		edificio.put(aula.getNombre(), aula);

	}

	public void deleteAula(String nombre) {
		edificio.remove(nombre);
		System.out.println("Aula " + nombre + " eliminada");

	}

	public Aula getAula(String nombre) {
		
		return edificio.get(nombre);
	}

}
