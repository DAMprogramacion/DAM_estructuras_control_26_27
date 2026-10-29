/*
 *  Mostrando menú con String multilínea
 *  Mostrando opción usando switch y -> 
 *  El menú se repite hasta que salga la opción de salir
 *  cambiar a bucle for
 */

import java.util.Random;
public class SeptimoSwitch {
	
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
		
		
		for (int opcion = -1; opcion != 5; opcion = random.nextInt(1, 11) ) { //dfsdf
			
			System.out.println("\nOpción elegida: " + opcion);
			switch (opcion) { 
				case 1 -> System.out.println("Has elegido la opción 1");
				case 2 -> System.out.println("Has elegido la opción 2");
				case 3 -> System.out.println("Has elegido la opción 3");
				case 4 -> System.out.println("Has elegido la opción 4");
			//	case 5 -> System.out.println("Saliendo del programa"); nunca se ejecuta, pues al valora opcion != 5 false, no entra en el menú
				default -> System.out.println("Opción incorrecta");
			}
			
		}
		System.out.println("Saliendo del programa");
	}
}






