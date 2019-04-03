package ejercicio03dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class UnitaryDaoTest {
	
	
	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void aulasEncapsulacionTest() {
		ListDao ejemplolistDao = new ListDao();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		
		assertTrue("No devuelve el edificio",ejemplolistDao.getAulas().equals(edificio));
	}
	
	
	@Test
	public void creategetAulaTest() {
		ListDao ejemplolistDao = new ListDao();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		Aula aula = new Aula();
		ejemplolistDao.createAula(aula);
		
		assertTrue("No crea el aula en el edificio",ejemplolistDao.getAula(null).equals(aula));
	}
	
	@Test
	public void updateAulaTest() {
		ListDao ejemplolistDao = new ListDao();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		Aula aula = new Aula();
		ejemplolistDao.createAula(aula);
		aula.setNombre("Kepler");
		ejemplolistDao.updateAula(aula);
		
		assertTrue("No actualiza el aula",ejemplolistDao.getAula("Kepler").equals(aula));
	}
	
	@Test
	public void deleteAulaTest() {
		ListDao ejemplolistDao = new ListDao();
		List<Aula> edificio = new ArrayList<Aula>();
		ejemplolistDao.setEdificio(edificio);
		Aula aula = new Aula();
		ejemplolistDao.createAula(aula);
		aula.setNombre("Kepler");
		ejemplolistDao.deleteAula("Kepler");
		
		
		
		assertTrue("No borra el aula",ejemplolistDao.getAulas().size()== 0);
	}
	

}
