/*
 * Argumentos.java
 * Programa que procesa los argumentos de entrada
 */


public class Argumentos {
	
	public static void main (String[] args) {
		
		String nombre    = args[0];
		String apellido1 = args[1];
		String apellido2 = args[2];
		
		System.out.println("\"Hola " + nombre + " " + apellido1 + " " + apellido2 + '"');
		System.out.printf("%cHola %s %s %s%c%n",'"', nombre, apellido1, apellido2, '"' );

	}
}
