/*
 * MainEcuacion.java
  */

import java.util.Scanner;

public class MainEcuacion {
	
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
		boolean resoluble = Ecuacion.esResoluble(a, b, c, d);
		if (!resoluble) {
			System.out.println("No se puede resolver el sistema de ecuaciones");
			return;
		}
		System.out.println("Resolviendo el sistema de ecuaciones...");
		double x = Ecuacion.calcularX(a, b, c, d, e, f);
		double y = Ecuacion.calcularY(a, b, c, d, e, f);
		System.out.printf("El valor de x en la ecuación es %.2f%n", x);
		System.out.printf("El valor de y en la ecuación es %.2f%n", y);
	}
}

