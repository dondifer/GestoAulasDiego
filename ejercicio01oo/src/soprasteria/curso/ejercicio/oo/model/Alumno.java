package soprasteria.curso.ejercicio.oo.model;

public class Alumno extends Persona {
private boolean subvencionado;
private String asistencia;
private Integer nota;
public boolean isSubvencionado() {
	return subvencionado;
}
public void setSubvencionado(boolean subvencionado) {
	this.subvencionado = subvencionado;
}
public String getAsistencia() {
	return asistencia;
}
public void setAsistencia(String asistencia) {
	this.asistencia = asistencia;
}
public Integer getNota() {
	return nota;
}
public void setNota(Integer nota) {
	this.nota = nota;
}

}
