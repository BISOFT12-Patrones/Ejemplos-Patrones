package main;

import java.util.ArrayList;

import constructores.*;
import directores.Director;
import objetos.carro;

public class Gestor {
	private static ArrayList <carro> arrVehiculos = new ArrayList<carro>(); 
	private Director objDirector = new Director();
	
	public void construccion_base() {
		objDirector.setBuilder(new ConstructorBajo());
		nuevo_vehiculo();
	}
	public void construccion_media() {
		objDirector.setBuilder(new ConstructorMedio());
		nuevo_vehiculo();
	}
	public void construccion_full() {
		objDirector.setBuilder(new ConstructorFull());
		nuevo_vehiculo();
	}
	
	private void nuevo_vehiculo() {
		objDirector.construirVehiculo();
		add_objeto_array(objDirector.getBuilder().getCarro());
	}
	
	
/************************************************************
 * Metodo:		add_objeto_array
 * 
 * Descripción:	Recibe un nuevo objeto y lo guarda en el array.
 * 
 * Parametros:	pObj [Carro]
 * 
 * @return:		Void
 *************************************************************/
	private static void add_objeto_array(carro pObj) {
		arrVehiculos.add(pObj);
	}
	
/************************************************************
 * Metodo:		obtenerDatos
 * 
 * Descripción:	Obtiene los datos de los objetos del arreglo y los 
 * 				devuelve en una variable.
 * 
 * Parametros:	pid [int] id del arreglo.
 * 
 * @return:		mResult [String] 
 *************************************************************/
	public String obtenerDatos(int pid) {
		String mResult = "";

		carro mOb = arrVehiculos.get(pid);
		mResult = "Tipo de carroceria: " + mOb.getCarroceria() + "\n" 
				  +"Tipo de motor: " +  mOb.getMotor() + "\n" 
		          +"Tiene A/C:" +  mOb.getAireAcond() + "\n"
				  +"Tiene Elevalunas: " +  mOb.getElevalunasElec(); 

		return mResult;
	}	
/************************************************************
 * Metodo:		obtenerDatos
 * 
 * Descripción:	Obtiene los datos de los triangulos y los 
 * 				devuelve en una variable.
 * 
 * Parametros:	N/A
 * 
 * @return:		mResult [String] 
 *************************************************************/
	public String obtenerDatos() {
		String mResult = "";
		for (carro mOb : arrVehiculos)	{				
			mResult += "Tipo de carroceria: " + mOb.getCarroceria() + "\n" 
					  +"Tipo de motor: " +  mOb.getMotor() + "\n" 
			          +"Tiene A/C:" +  mOb.getAireAcond() + "\n"
					  +"Tiene Elevalunas: " +  mOb.getElevalunasElec()+ "\n\n"; 
		}
		
		return mResult;
		
	}
		
	
	
	/**
	 * @return the objDirector
	 */
	public Director getObjDirector() {
		return objDirector;
	}

	/**
	 * @param objDirector the objDirector to set
	 */
	public void setObjDirector(Director objDirector) {
		this.objDirector = objDirector;
	}
}
