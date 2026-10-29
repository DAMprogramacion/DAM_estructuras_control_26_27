/*
 * CuartoIF.java
 * 
 * PROGRAMA QUE GENERA NÚMEROS ENTRE 1 Y 9 (AMBOS INCLUSIVOS)
 * MENSAJES:
 * 	 número es divisible por 6 (también 2 y 3)
 * 	 número es divisible por 2 
 *   número es divisible por 3
 *   número NO es divisible NI por 2 NI por 3
 * 
 * 	 Ejemplos:
 *   6 es divisible por 6 (también 2 y 3)
 *   4 es divisible por 4
 *   9 es divisible por 3
 *   7 NO es divisible NI por 2 NI por 3
 *   Para el caso del 6, solo se obtiene un único mensaje, que es divisible por 6
 */

import java.util.Random;

public class CuartoIF {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		int numero = random.nextInt(1, 10);
		
		//SI DIVISIBLE POR 6: mensaje del 6
		//SI DIVISIBLE POR 3: mensaje del 3
		//SI DIVISIBLE POR 2: mensaje del 2
		//SINO mensaje NI por 2 NI por 3 
		
		//if (numero % 6 == 0) {
		if (numero % 3 == 0 && numero % 2 == 0) {
			System.out.println(numero + " es divisible por 6 (también 2 y 3)");
		} else if (numero % 3 == 0) {
			System.out.println(numero + " es divisible por 3");
		} else if (numero % 2 == 0) {
			System.out.println(numero + " es divisible por 2");
		} else {
			System.out.println(numero + " NO es divisible NI por 2 NI por 3");
		}
		
	}
}














