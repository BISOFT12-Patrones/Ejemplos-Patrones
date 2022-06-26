package constructores;

public class ConstructorBajo extends Builder{
	
	public ConstructorBajo(){}
	
	public void construirMotor() {
		 this.car.setMotor( "Motor de potencia baja" );                                                                                                                                                                                                                                                                                                                
	}
	
	public void construirCarroceria() {
		this.car.setCarroceria( "Carrocería de baja protección" );
	}
	
	public void construirAireAcond() {
		this.car.setAireAcond( false );
	}
	
	public void construirElevalunas() {
		this.car.setElevalunasElec( true );
	}
}
