/*
 * Menu.java
 */

import java.util.Scanner;
public class Menu {
	
	public static void main (String[] args) {
		
		//solicitando números
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nº comprendido entre 1 y 10, inclusives");
		int numero1 = scanner.nextInt();
		System.out.println("Introduce otro nº comprendido entre 1 y 10, inclusives");
		int numero2 = scanner.nextInt();
		//System.out.printf("Valores introducidos: %d y %d\n", numero1, numero2); para comprobación
		//comprobando que lo nº están en el rango correspondiente
		if (numero1 < 1 || numero1 > 10 || numero2 < 1 || numero2 > 10) {
			System.out.printf("Los valores %d y %d no pueden ser procesados\n", numero1, numero2);
			return; //se escapa del main, por tanto acaba el programa, no hace falta else
		}
		//vamos a mostrar el menú:
		String menu = """
		
			1) Sumar los dos valores
			2) Restar los dos valores
			3) Multiplicar los dos valores
			4) Didivir los dos valores
			5) Salir
			Elige opción [1-5]  """;
		int opcion = -1;	
		do {
			System.out.println(menu);
			opcion = scanner.nextInt();
			switch (opcion) {
				case 1 -> System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);
				case 2 -> System.out.printf("%d - %d = %d\n", numero1, numero2, numero1 - numero2);
				case 3 -> System.out.printf("%d x %d = %d\n", numero1, numero2, numero1 * numero2);
				case 4 -> System.out.printf("%d / %d = %d\n", numero1, numero2, numero1 / numero2);
				case 5 -> System.out.println("Fin de programa");
				default -> System.out.println("Opcíon incorrecta");
			}
		} while(opcion !=5);
				
	}
}

