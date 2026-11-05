/*
 * ResolucionSistemaDosEcuacionsDosIncognitas.java
 * El programa hace todo, no usamos métodos
 */

import java.util.Scanner;
public class ResolucionSistemaDosEcuacionsDosIncognitas {
	
	public static void main (String[] args) {
		//solicitamos los datos
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el valor de a:");
		int a = scanner.nextInt();
		System.out.println("Introduce el valor de b:");
		int b = scanner.nextInt();
		System.out.println("Introduce el valor de c:");
		int c = scanner.nextInt();
		System.out.println("Introduce el valor de d:");
		int d = scanner.nextInt();
		System.out.println("Introduce el valor de e:");
		int e = scanner.nextInt();
		System.out.println("Introduce el valor de f:");
		int f = scanner.nextInt();
		scanner.close();
		//comprobamos si se puede resolver
		boolean resoluble = a * d - b * c != 0;
		String mensaje = resoluble ? "Se puede resolver" : "No se puede resolver";
		System.out.println(mensaje);
		//resolvemos la ecuación
		//if (resoluble == false)
		if (!resoluble)
			return; //abandona el método main, y por tanto la ejecución del programa
		System.out.println("Resolviendo el sistema de ecuaciones...");
		double x = 1.0 * (e * d - b * f) / (a * d - b * c); 
		double y = 1.0 * (a * f - e * c) / (a * d - b * c);
		System.out.printf("El valor de x en la ecuación es %.2f%n", x);
		System.out.printf("El valor de y en la ecuación es %.2f%n", y);

		
		
		
	}
}

