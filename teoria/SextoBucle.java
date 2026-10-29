/*
 * SegundoBucle.java
 * 
 * Programa que repite un mensaje un nº de veces
 * el nº de veces coincide con un valor aleatorio
 * 
 */

import java.util.Random;

public class SextoBucle {
	
	public static void main (String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(5);
		System.out.println("Aleatorio: " + numeroAleatorio + '\n');
		
		/*int contador = 0;
		do {
			if (numeroAleatorio == 0)
				break;
			System.out.println(++contador + ". Dentro del bucle"); //0.  ----    1. ------  2. -----
			//contador++;
		} while (contador < numeroAleatorio);*/
		
		for (int i = 0; i < numeroAleatorio; i++) //no se usa {} porque se ejecuta una sola sentencia
			System.out.println((i + 1) + ". Dentro del bucle");
		
		
		//System.out.println("\nContador: " + i); no se ve la variable i, solo dentro del bucle for
	}
}

