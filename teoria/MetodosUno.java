/*
 * MetodosUno.java
 * 
 * Ejemplo de uso de métodos estáticos
 * 
 */

import java.util.Random;
public class MetodosUno {
	
	static Random random = new Random();
	public static void main (String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int aleatorio = obtenerAleatorioEntreRango(15, 110);
			if (aleatorio == -1){
				System.out.println("Con ese rango no se pueden crear aleatorios");
				break;
			}
			//System.out.println("Valor aleatorio: " + i + ": " + aleatorio);
			System.out.printf("Valor aleatorio: %3d ->  %3d\n", i, aleatorio);
		}
		
	}


	private static int obtenerAleatorioEntreRango (int min, int max) { //min inclusive, max exclusive
		//Random random = new Random();
		if (min < max)
			return random.nextInt(min, max);
		else
			return -1;
	}
}

