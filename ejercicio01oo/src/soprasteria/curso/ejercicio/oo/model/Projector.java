package soprasteria.curso.ejercicio.oo.model;

public class Projector   {
	private Integer numeroSerie;

	public Integer getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(Integer numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	public void apagar() {
		System.out.println("Shutting down...");
		
		
	}
	
	public void encender() {
		System.out.println("Starting...");
		
		
	}
	
}
