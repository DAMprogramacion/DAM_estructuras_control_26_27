/*
 * MainBiblioteca.java
 * Clase para probar los métodos de
 * la clase Biblioteca
 * No tengo que hacer importaciones,
 * porque está el fichero está en el
 * mismo directorio
 */

import java.util.Random;
public class MainBiblioteca {
	
	public static void main (String[] args) {
		Random random = new Random();
		int numero1 = random.nextInt(100);
		int numero2 = random.nextInt(100);
		int numero3 = random.nextInt(100);
		int minimo = BibliotecaMatematica.obtenerMinimoDeTres(numero1, numero2, numero3);
		//souf el mínimo de numero1, numero2 y numero3 es minimo
		System.out.printf("el mínimo de %d, %d y %d es %d%n%n", numero1, numero2, numero3, minimo );
		boolean primo1 = BibliotecaMatematica.esPrimo(numero1);
		//souf el numero1 ¿es primo? primo1 
		//System.out.printf("el %d ¿es primo? %b", numero1, primo1); no gusta que mezclemos español e inglés
		String mensaje1 = primo1 ? "es número primo" : "NO es número primo"; 
		System.out.printf("El %d %s\n\n", numero1, mensaje1);
		boolean primo2 = BibliotecaMatematica.esPrimo(numero2);
		String mensaje2 = primo2 ? "es número primo" : "NO es número primo"; 
		System.out.printf("El %d %s\n\n", numero2, mensaje2);
		boolean primo3 = BibliotecaMatematica.esPrimo(numero3);
		String mensaje3 = primo3 ? "es número primo" : "NO es número primo"; 
		System.out.printf("El %d %s\n\n", numero3, mensaje3);

	}
}

