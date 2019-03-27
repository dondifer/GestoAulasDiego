package ejercicio03dao;

import java.util.Collection;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public interface IAulaDAO {
	void createAula(Aula aula);
	Collection<Aula> getAulas();
	void updateAula(Aula aula);
	void deleteAula(String nombre);
	Aula getAula(String nombre);

}
