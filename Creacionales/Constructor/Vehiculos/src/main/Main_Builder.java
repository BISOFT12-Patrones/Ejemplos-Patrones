package main;


public class Main_Builder {
	private static Gestor gGestor = new Gestor();
	
	public static void main(String[] args) {
		gGestor.construccion_base();
		gGestor.construccion_media();
		gGestor.construccion_full();
		System.out.println(gGestor.obtenerDatos());
	}
}



/***************************************************************************
 * TAREA: 
 * 
 * 1. Se deben de crear objetos que pueden componer el vehiculo. Motor, 
 * Aire Acondicionado, Elevalunas, carroceria, etc.
 * 
 * 2. Crear un metodo para construir solo motor desde el director.
 * 
 * 3. Hacerlo interactivo para el usuario para que pueda escoger que tipo de 
 * vehiculo crear.
 ****************************************************************************/

