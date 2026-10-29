/*
 * PrimerBucle.java
 * 
 * Programa que repite un mensaje un nº de veces
 * el nº de veces coincide con un valor aleatorio
 * 
 */

import java.util.Random;

public class PrimerBucle {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(5);
		System.out.println("Aleatorio: " + numeroAleatorio + '\n');
		
		int contador = 0;
		while (contador < numeroAleatorio) 
			System.out.println(++contador + ". Dentro del bucle"); //0.  ----    1. ------  2. -----
			//contador++;
		
		System.out.println("\nContador: " + contador);
	}
}

