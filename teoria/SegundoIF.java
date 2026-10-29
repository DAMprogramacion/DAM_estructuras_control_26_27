/*
 * PrimerIF.java
 * Programa que nos dice si un número es mayor o menor que otro
 * 
 */

import java.util.Random;

public class SegundoIF {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		boolean valorAleatorio = random.nextBoolean();
		System.out.println("VALOR DE LA VARIABLE: " + valorAleatorio);
		//System.out.println("Valor para el administrador: " + valorAleatorio);
		//si sale true que se escriba un mensaje diciendo que ha salido cierto
		if (valorAleatorio){ //valor true
			System.out.println("Te ha tocado");
		} else { //valor false
			System.out.println("No te ha tocado");
		}
		System.out.println("FIN DE PROGRAMA");
		
	}
}

