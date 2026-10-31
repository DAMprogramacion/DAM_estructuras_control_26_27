/*
 * Columnas.java
 * 
 */

import java.util.Scanner;
public class Columnas {
	
	public static void main (String[] args) {
		//solicitamos los datos
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce nº de columnas");
		int columnas = scanner.nextInt();
		System.out.println("Introduce un nº");
		int numero = scanner.nextInt();
		//mostramos las columnas
		for (int i = 1; i <= numero; i++) {
			System.out.printf("%5d", i);
			if (i % columnas == 0)
				System.out.println();
		}
	}
}

