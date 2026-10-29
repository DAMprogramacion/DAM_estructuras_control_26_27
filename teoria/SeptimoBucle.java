/*
 * SeptimoBucle.java
 * 
 * Programa que genera un aleatorio entre 1 y 10_000
 * El programa no muestra ese valor aleatorio con un sout
 * El programa debe averiguar ese valor usando un bucle 
 * y mostrar entonces el valor aleatorio
 * 
 * 
 */

import java.util.Random;
public class SeptimoBucle {
	
	public static void main (String[] args) {
		Random random = new Random();
		int aleatorio = random.nextInt(1, 10_001);
	//	System.out.println(aleatorio);
		for (int i = 1; i < 10_001; i++){
			System.out.println("Intentando: " + i);
			if (i == aleatorio){
				System.out.println("===========================El nº es: " + aleatorio);
				break;
			}
		}
	}
}

