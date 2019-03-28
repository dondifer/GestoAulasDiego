package ejemplo05beans.beans4;

public class MotorConConstructor {
	private String tipoDeMotor;
	private int caballosVapor;
	private boolean electrico;
	
	
	
	
	
	public MotorConConstructor(String tipoDeMotor, int caballosVapor, boolean electrico) {
		super();
		this.tipoDeMotor = tipoDeMotor;
		this.caballosVapor = caballosVapor;
		this.electrico = electrico;
	}
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
