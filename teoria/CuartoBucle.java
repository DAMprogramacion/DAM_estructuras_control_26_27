/*
 * CuartoBucle.java
 * Tablas de multiplicar del 1 al 10
 * Ejemplo la tabla del 6:
 * 
 * Tabla de multiplicar del 6
 * ===========================
 * 6 x 1 = 6
 * 6 x 2 = 12
 * 6 x 3 = 18
 * ..........
 * 6 x 8 = 48
 * 6 x 9 = 54
 * 6 x 10 = 60
 */

import java.util.Random;
public class CuartoBucle {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		int aleatorio = random.nextInt(1, 11);
		System.out.println("Tabla de multiplicar del " + aleatorio);
		System.out.println("==========================");
		int contador = 1;
		
		do {
			//int resultado = aleatorio * contador;
			System.out.println(aleatorio + " x " + contador + " = " + (aleatorio * contador));
			contador++;
		} while (contador <= 10);
		
	}
}






