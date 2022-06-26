package constructores;

public class ConstructorMedio extends Builder{

	public ConstructorMedio() {}
	
	public void construirMotor() {
		 this.car.setMotor( "Motor de potencia media" );                                                                                                                                                                                                                                                                                                                
	}

	public void construirCarroceria() {
		this.car.setCarroceria( "Carrocería de media protección" );
	}
	
	public void construirAireAcond() {
		this.car.setAireAcond( true );
	}
	
	public void construirElevalunas() {
		this.car.setElevalunasElec( false );
	}
}
