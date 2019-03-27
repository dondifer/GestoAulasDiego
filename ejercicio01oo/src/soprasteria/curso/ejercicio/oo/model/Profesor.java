package soprasteria.curso.ejercicio.oo.model;

public class Profesor extends Persona {
private boolean malaLeche;

public boolean isMalaLeche() {
	return malaLeche;
}
public void setMalaLeche(boolean malaLeche) {
	this.malaLeche = malaLeche;
}
public String getExperiencia() {
	return experiencia;
}
public void setExperiencia(String experiencia) {
	this.experiencia = experiencia;
}
public Integer getValoracion() {
	return valoracion;
}
public void setValoracion(Integer valoracion) {
	this.valoracion = valoracion;
}
public Double getTarifaHora() {
	return tarifaHora;
}
public void setTarifaHora(Double tarifaHora) {
	this.tarifaHora = tarifaHora;
}
private String experiencia;
private Integer valoracion;
private Double tarifaHora;



}
