/*
 * TercerIF.java
 * Programa que nos dice si un valor aleatorio es 0 1 2
 * 
 */

import java.util.Random;

public class TercerIF {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		int valorAleatorio = random.nextInt(3);
		System.out.println("Valor obtenido: " + valorAleatorio);
		
		if (valorAleatorio == 0) {
			System.out.println("Te ha tocado");
		} else if (valorAleatorio == 1) {
			System.out.println("Te ha tocado la 1/2");
		} else {
			System.out.println("No te ha tocado");
		}
	}
}
