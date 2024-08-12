package datos;

//IMPORTAMOS LIBRERIAS
import java.util.Random;

public class FuncionesArray {
	
	//1- FUNCION PARA GENERAR ARRAY ALEATORIO
	//-------------------------------------------------------------------------
	public static int [] generarArrayAleatorio (int tam, int min, int max) {
		
		int [] array = new int [tam];
		
		Random numeroAleatorio = new Random ();
		
		for (int i = 0; i < tam; i ++) {
			
			array [i] = numeroAleatorio.nextInt(max) + min;
		}
		
		return array;
	}
	//-------------------------------------------------------------------------
	
	//2- FUNCION PARA MOSTRAR EL ARRAY
	//-------------------------------------------------------------------------
	public static void mostrarArray (int [] array) {
		
		for (int i = 0; i < array.length; i ++) {
			
			System.out.print("[" + array [i] + "] ");
		}
	}
	//-------------------------------------------------------------------------	
}