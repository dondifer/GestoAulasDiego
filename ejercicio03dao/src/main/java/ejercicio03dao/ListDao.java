package ejercicio03dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;



@Repository("ListDao")
public class ListDao implements IAulaDAO {
	
	
	@Autowired
	@Qualifier("edificio")
	private List<Aula> edificio;
	
	
	

	

	

//	public ListDao() {
//		super();
//		this.edificio  = new ArrayList<Aula>();
//	}

	

	public List<Aula> getEdificio() {
		return edificio;
	}

	public void setEdificio(List<Aula> edificio) {
		this.edificio = edificio;
	}

	public void createAula(Aula aula) {
		edificio.add(aula);
		System.out.println("Aula " + aula + " agregada");

	}

	public Collection<Aula> getAulas() {

		return edificio;
	}

	public void updateAula(Aula aula) {
		for (int i = 0; i < edificio.size(); i++) {
				if(edificio.get(i).getNombre()==aula.getNombre()) {
					edificio.set(i, aula);
				}
		}

	}

	public void deleteAula(String nombre) {
		for (int i = 0; i < edificio.size(); i++) {
			if(edificio.get(i).getNombre()==nombre) {
				edificio.remove(i);
				System.out.println("Aula " + nombre + " eliminada");
			}
		}

	}

	public Aula getAula(String nombre) {
		int i=0;
			while(edificio.get(i).getNombre()!=nombre) {
				i++;
			
		}

		return edificio.get(i);
	}

}
