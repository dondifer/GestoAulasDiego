package soprasteria.curso.ejercicio.oo.model;


import java.util.Set;

public class Aula {
	private String nombre;
	private Integer NumeroDeAula;
	private Double DimensionesEnMetrosCubicos;
	private boolean proyector;
	private boolean pizarra;
	private Puesto puestoDelProfesor;
	private Set<Puesto> PuestosDeAlumnos;
	


	public Aula(String nombre, Integer numeroDeAula, Double dimensionesEnMetrosCubicos, boolean proyector,
			boolean pizarra, Set<Puesto> puestosDeAlumnos) {
		super();
		this.nombre = nombre;
		NumeroDeAula = numeroDeAula;
		DimensionesEnMetrosCubicos = dimensionesEnMetrosCubicos;
		this.proyector = proyector;
		this.pizarra = pizarra;
		PuestosDeAlumnos = puestosDeAlumnos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNumeroDeAula() {
		return NumeroDeAula;
	}
	public void setNumeroDeAula(Integer numeroDeAula) {
		NumeroDeAula = numeroDeAula;
	}
	public Double getDimensionesEnMetrosCubicos() {
		return DimensionesEnMetrosCubicos;
	}
	public void setDimensionesEnMetrosCubicos(Double dimensionesEnMetrosCubicos) {
		DimensionesEnMetrosCubicos = dimensionesEnMetrosCubicos;
	}
	public boolean isProyector() {
		return proyector;
	}
	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}
	public boolean isPizarra() {
		return pizarra;
	}
	public void setPizarra(boolean pizarra) {
		this.pizarra = pizarra;
	}
	public Puesto getPuestoDelProfesor() {
		return puestoDelProfesor;
	}
	public void setPuestoDelProfesor(Puesto puestoDelProfesor) {
		this.puestoDelProfesor = puestoDelProfesor;
	}
	public Set<Puesto> getPuestosDeAlumnos() {
		return PuestosDeAlumnos;
	}
	public void setPuestosDeAlumnos(Set<Puesto> puestosDeAlumnos) {
		PuestosDeAlumnos = puestosDeAlumnos;
	}
	


}
