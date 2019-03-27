package soprasteria.curso.ejercicio.oo.model;

public class PuestoProfesor extends Puesto  {
	

	private Integer numeroPuestoProf;

	public Integer getNumeroPuestoProf() {
		return numeroPuestoProf;
	}

	public void setNumeroPuestoProf(Integer numeroPuestoProf) {
		this.numeroPuestoProf = numeroPuestoProf;
	}
	 public PuestoProfesor(boolean ordenador) {
			super(ordenador);
			
		}
}
