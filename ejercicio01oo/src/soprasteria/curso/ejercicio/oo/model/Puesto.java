package soprasteria.curso.ejercicio.oo.model;

public class Puesto  {
	private boolean ordenador;
	private Persona persona;
	public Puesto(boolean ordenador) {
		super();
		this.ordenador = ordenador;
	}
	public boolean isOrdenador() {
		return ordenador;
	}
	public void setOrdenador(boolean ordenador) {
		this.ordenador = ordenador;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	
}
