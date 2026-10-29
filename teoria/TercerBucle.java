/*
 * TercerBucle.java
 * Programa que obtien dos aleatorios, aleatorio1 y aleatorio2
 * Muestra en consola desde 1 como máximo aleatorio1 con un paso de aleatorio2
 * Ejemplo aleatorio1 = 10 , aleatorio2 = 2
 * 1 3 5 7 9
 */

import java.util.Random;

public class TercerBucle {
	
	public static void main (String[] args) {
		
		Random random  = new Random();
		int aleatorio1 = random.nextInt(1, 101); //valores posibles: 1, 2, 3 .... 99, 100
		int aleatorio2 = random.nextInt(1, 4); //valores posibles 1, 2, 3
		
		int contador = 1;
		while (contador <= aleatorio1) {
			System.out.println(contador);
			//contador = contador + aleatorio2;  lo mismo con asignación compuesta:
			contador += aleatorio2;
		}
		System.out.println("\nContando desde el 1 al " + aleatorio1 + " de " + aleatorio2 + " en " + aleatorio2);


	}
}

