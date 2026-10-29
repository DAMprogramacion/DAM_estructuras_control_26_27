/*
 * MetodosDos.java
 * 
 * Clase que tiene tres métodos:
 * Uno que calcula el valor máximo de tres valores 
 * Otro que calcula la raíz cúbica de un valor double
 */

import java.util.Random;
public class MetodosDos {
	
	public static void main (String[] args) {
		Random random = new Random();
		////////////////////////////////////////////////////////////////////////////////////////
		int entero1 = random.nextInt(1,101);	
		int entero2 = random.nextInt(1,101);
		int entero3 = random.nextInt(1,101);
	 	int maximo = obtenerMaximoTresEnteros(entero1, entero2, entero3);
	//  souf El valor máximo de entero1, entero2 y entero 3 es maximo
		System.out.printf("El valor máximo de %d, %d y %d es %d\n\n", entero1, entero2, entero3, maximo);
		entero1 = 11;
		entero2 = 12;
		entero3 = 13;
		maximo = obtenerMaximoTresEnteros(entero1, entero2, entero3);
		System.out.printf("El valor máximo de %d, %d y %d es %d\n\n", entero1, entero2, entero3, maximo);
		/////////////////////////////////////////////////////////////////////////////////////////
		double numero = Math.random() * 100;
		double raizCubica = calcularRaizCubica(numero);
		//souf La raíz cúbica del numero vale raizCubica
		System.out.printf("La raíz cúbica del %.2f vale %.2f\n\n", numero, raizCubica);
		/////////////////////////////////////////////////////////////////////////////////////////
		float x = (float) Math.random() * 25;
		float y = (float) Math.random() * 5;
		float elevado = elevarDosNumeros(x, y);
		//souf x elevado a y vale elevado
		System.out.printf("%.2f elevado a %.2f vale %.2f\n", x, y, elevado);
	}
	
	private static float elevarDosNumeros(float x, float y) { //operación x^y 
			return (float) Math.pow(x,y);
	}
	
	private static double calcularRaizCubica (double numero) {
		return Math.cbrt(numero);
	}
	
	
	private static int obtenerMaximoTresEnteros (int entero1, int entero2, int entero3) {
		return Math.max(Math.max(entero1, entero2), entero3);
	}
}

