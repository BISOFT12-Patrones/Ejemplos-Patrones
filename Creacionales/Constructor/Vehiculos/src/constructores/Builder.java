package constructores;

import objetos.carro;

public abstract class Builder {
	protected carro car;
	public carro getCarro() {
		return this.car;	}
	
	public void crearNuevoCoche() {
	        this.car = new carro();
	}
	    
	
	// Métodos que deberán ser construídos por las clases que hereden de ésta
	public abstract void construirMotor();
	public abstract void construirCarroceria();
	public abstract void construirAireAcond();
	public abstract void construirElevalunas();
	
}
