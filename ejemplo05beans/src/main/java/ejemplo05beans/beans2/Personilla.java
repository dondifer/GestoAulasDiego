package ejemplo05beans.beans2;

public class Personilla {
	private String comosellama;
	private int edad;
	private double peso;
	public String getComosellama() {
		return comosellama;
	}
	public void setComosellama(String comosellama) {
		this.comosellama = comosellama;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Personilla [comosellama=" + comosellama + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	

}
