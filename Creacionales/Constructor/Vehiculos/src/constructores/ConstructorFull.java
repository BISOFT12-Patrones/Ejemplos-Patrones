package constructores;

public class ConstructorFull extends Builder{

	public ConstructorFull() {}
	
	public void construirMotor() {
		 this.car.setMotor( "Motor de potencia alta" );                                                                                                                                                                                                                                                                                                                
	}

	public void construirCarroceria() {
		this.car.setCarroceria( "Carrocería de alta protección" );
	}

	public void construirAireAcond() {
		this.car.setAireAcond( true );
	}

	public void construirElevalunas() {
		this.car.setElevalunasElec( true );
	}

}
