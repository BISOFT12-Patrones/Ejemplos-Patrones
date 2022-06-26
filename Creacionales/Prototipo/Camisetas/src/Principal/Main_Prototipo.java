package Principal;

import java.util.ArrayList;
import java.util.Random;

import iProtitpo.Camiseta;
import prototipo.*;

public class Main_Prototipo {
	private static Gestor gGestor;

	public static void main(String[] args) {
		// Variables
		int idMC = 100;
		int idML = 200;	
		
		//Inicializamos el gestor.
		gGestor = new Gestor(idMC,idML);
		
		//Creamos los clones
		for(int i = 0; i<20;i++)
			gGestor.nueva_camisa(i);
		
		//Los imprimimos
		System.out.println(gGestor.obtenerDatos());
		
		
	}
	
}
