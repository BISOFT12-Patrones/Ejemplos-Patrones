/************************************************************
 * Clase: main
 * Descripción: Esta clase es la principal del programa.
 * @author Erick Brenes
 ************************************************************/
package principal;

public class Main_Metodo_Fabrica {

	private static Gestor gGestor= new Gestor();
	
	public static void main(String[] args) {
		gGestor.nuevoTriangulo(10, 10, 10);
		gGestor.nuevoTriangulo(10, 20, 30);
		gGestor.nuevoTriangulo(10, 20, 10);
		gGestor.nuevoTriangulo(Helper.ramdomize(), Helper.ramdomize(),Helper.ramdomize());
		imprimir();
	}

/************************************************************
 * Metodo:		imprimir
 * 
 * Descripción:	Esta funcion imprime los datos de un objeto 
 * 				de tipo triangulo.
 * 
 * Parametros:	Triangulo tr // Objeto tipo triangulo
 * 
 * @return:		N/A
 *************************************************************/	
	private static void imprimir() {
		System.out.println(gGestor.obtenerDatos());
	}
	
	
	
	/***************************************************************************
	 * TAREA: 
	 * 
	 * 1. Terminar las getSuperficie faltantes
	 * 
	 * 2. Terminar las dibujar faltantes.
	 * 
	 * 3. Hacer una fabrica para cuadrado o rectangulo.
	 ****************************************************************************/
	
	
	
	
}



