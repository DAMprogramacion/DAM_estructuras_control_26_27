/*
 *  Mostrando menú con String multilínea
 *  Mostrando opción usando switch y -> 
 */

import java.util.Random;
public class TercerSwitch {
	
	public static void main (String[] args) {
		Random random = new Random();
		String menu = """ 
						1. Opción 1
						2. Opción 2
						3. Opción 3
						4. Opción 4
						5. Salir
						""";
		System.out.println("Mostrando menú");
		System.out.println("==============\n");
		System.out.println(menu);
		
		int opcion = random.nextInt(1, 11); //la opción va desde 1 al 10 inclusives
		System.out.println("\nOpcíon elegida: " + opcion);
		switch (opcion) {
			case 1 -> System.out.println("Has elegido la opción 1");
			case 2 -> System.out.println("Has elegido la opción 2");
			case 3 -> System.out.println("Has elegido la opción 3");
			case 4 -> System.out.println("Has elegido la opción 4");
			case 5 -> System.out.println("Saliendo del programa");
			default -> System.out.println("Opción incorrecta");
		}
		
	}
}






