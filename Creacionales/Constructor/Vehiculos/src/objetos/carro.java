package objetos;

public class carro {
	private String motor; //private Motor gMotor;
	private String carroceria;
    private boolean elevalunasElec;
    private boolean aireAcond;
    
    
    public carro(String motor, String carroceria, boolean elevalunasElec, boolean aireAcond) {
		this.motor = motor;
		this.carroceria = carroceria;
		this.elevalunasElec = elevalunasElec;
		this.aireAcond = aireAcond;
	}

    public carro() {
		this.motor = "N/A";
		this.carroceria = "N/A";
		this.elevalunasElec = false;
		this.aireAcond = false;
	}
    
    
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}
	public Boolean getElevalunasElec() {
		return elevalunasElec;
	}
	public void setElevalunasElec(Boolean elevalunasElec) {
		this.elevalunasElec = elevalunasElec;
	}
	public Boolean getAireAcond() {
		return aireAcond;
	}
	public void setAireAcond(Boolean aireAcond) {
		this.aireAcond = aireAcond;
	}

	
    public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}

}
