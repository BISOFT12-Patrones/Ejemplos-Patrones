package directores;

import constructores.Builder;

public class Director{
	private Builder builder;
    
	public Director() {}
    
	public void construirVehiculo( ){
	    builder.crearNuevoCoche();
	    builder.construirMotor();
	    builder.construirCarroceria();
	    builder.construirElevalunas();
	    builder.construirAireAcond();

	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
	public void agregarAire() {
		if(!builder.getCarro().getAireAcond())
			builder.getCarro().setAireAcond(true);
	}
	
	
}