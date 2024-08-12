package test;

//IMPORTAMOS CLASES
import datos.FuncionesArray;
import datos.CountingSortSecuencial;
import datos.CountingSortConcurrente; 

public class TestCountingSort {
	
	public static void main(String [] args) {
		
		
		//1- DEFINICION DEL ARRAY ORIGINAL Y CARGA DEL MISMO CON VALORES ALEATORIOS
		//-------------------------------------------------------------------------
		int TAM = 20000000;
		int [] arrayOriginal = FuncionesArray.generarArrayAleatorio(TAM, 1, 1000);
		int [] arrayResultado = new int [TAM];
		//-------------------------------------------------------------------------
		
		//2- MUESTRA DEL ARRAY ANTES DE SER ORDENADO
		//-------------------------------------------------------------------------
		/*System.out.println("\n---ARRAY PREVIO A SU ORDENAMIENTO---\n");
		FuncionesArray.mostrarArray(arrayOriginal);*/
		//-------------------------------------------------------------------------
		
		//3- REALIZAMOS COUNTING SORT CONCURRENTE Y SECUENCIAL
		//-------------------------------------------------------------------------
		double tiempoInicial = System.nanoTime();
		arrayResultado = CountingSortSecuencial.countingSortSecuencial(arrayOriginal);
		System.out.println("\nEl CountingSort secuencial tardó un total de: " + (System.nanoTime() - tiempoInicial) / 1000 + " microSeg");
		
		tiempoInicial = System.nanoTime();
		arrayResultado = CountingSortConcurrente.countingSortConcurrente(arrayOriginal, 2 );
		System.out.println("\nEl CountingSort concurrente tardo un total de: " + (System.nanoTime() - tiempoInicial) / 1000 + " microSeg");
		//-------------------------------------------------------------------------

		//4- MOSTRAMOS EL ARRAY LUEGO DE SU ORDENAMIENTO
		//-------------------------------------------------------------------------
		/*System.out.println("\n\n---ARRAY LUEGO DE SU ORDENAMIENTO---\n");
		FuncionesArray.mostrarArray(arrayResultado);*/
		//-------------------------------------------------------------------------


		
		
		
	}
}