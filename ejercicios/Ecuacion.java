/*
 * Ecuacion.java
 * Clase que tiene tres  métodos:
 * 1) Nos dice si un sistema de dos ecuaciones y dos incógnitas se puede resolver o no
 * 2) Nos devuelve el cálculo de X
 * 3) Nos devuelve el cálculo de Y
 */


public class Ecuacion {
	
	public static boolean esResoluble(int a, int b, int c, int d){
		return a * d - b * c != 0;
	}
	public static double calcularX(int a, int b, int c, int d, int e, int f) {
		return 1.0 * (e * d - b * f) / (a * d - b * c);
	}
	public static double calcularY(int a, int b, int c, int d, int e, int f) {
		return 1.0 * (a * f - e * c) / (a * d - b * c);
	}
	
}

