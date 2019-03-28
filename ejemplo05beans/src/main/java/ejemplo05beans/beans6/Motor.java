package ejemplo05beans.beans6;

public class Motor {
	private String tipoDeMotor;
	private int caballosVapor;
	private boolean electrico;
	
	public String getTipoDeMotor() {
		return tipoDeMotor;
	}
	public void setTipoDeMotor(String tipoDeMotor) {
		this.tipoDeMotor = tipoDeMotor;
	}
	public int getcaballosVapor() {
		return caballosVapor;
	}
	public void setcaballosVapor(int caballosVapor) {
		this.caballosVapor = caballosVapor;
	}
	public boolean isElectrico() {
		return electrico;
	}
	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
	@Override
	public String toString() {
		return "Motor [tipoDeMotor=" + tipoDeMotor + ", caballosVapor=" + caballosVapor + ", electrico=" + electrico
				+ "]";
	}
	
	
	
	
}
