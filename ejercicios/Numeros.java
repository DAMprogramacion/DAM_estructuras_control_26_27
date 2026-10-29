/*
 * Numeros.java
 * 
 */

import java.util.Random;
public class Numeros {
	
	public static void main (String[] args) {
		Random random = new Random();
		//Muestra en consola los números del 1 al 10, usando un bucle do while
		int contador = 1;
		do {
			System.out.printf("%-3d", contador);
			contador++;
		} while (contador <= 10);
		System.out.println("\n=========================================");
		//Muestra en consola la siguiente serie: 20 25 30 35 . . . 70 75 80, usando un bucle while
		contador = 20;
		while( contador <= 80) {
			System.out.printf("%-3d", contador);
			contador += 5;
		}
		System.out.println("\n=========================================");
		//Muestra en consola la siguiente serie: 100 98 96 94 . . . 56 54 52 50, usa un bucle for
		for (int i = 100; i >= 50; i -=2) {
			System.out.printf("%-4d", i);
		}
		System.out.println("\n=========================================");
		//Muestra el factorial de N, siendo N un aleatorio entre 1 y 10 inclusive
		int aleatorio = random.nextInt(1, 11);
		contador = 1;
		int acumulador = 1;
		do {
			
			acumulador = acumulador * contador;
			contador++;
		} while(contador <= aleatorio);
		System.out.printf("%d! = %d", aleatorio, acumulador);
		System.out.println("\n=========================================");
		//Muestra la suma de los cuadrados de los N primeros números naturales, N el aleatorio anterior
		contador = 1;
		acumulador = 0;
		while (contador <= aleatorio){
			acumulador += contador * contador; //acumulador = acumulador + contador * contador
			contador++;
		}
		System.out.printf("La suma de los cuadrados desde 1 hasta %d vale %d\n", aleatorio, acumulador);
		System.out.println("\n=========================================");
		int acumuladorPares = 0; //int acumuladorPares = 0, acumuladorImpares = 0;
		int acumuladorImpares = 0;
		for (int i = 1; i <= aleatorio; i++) {
			if ( i % 2 == 1) //i es impar
				acumuladorImpares += i;
			else
				acumuladorPares  += i;
		}
		//Muestre suma de pares de 1 a N inclusive, N el aleatorio anterior
		System.out.printf("La suma de los nº impares desde 1 hasta %d vale %d\n", aleatorio, acumuladorImpares);
		System.out.printf("La suma de los nº pares desde 1 hasta %d vale %d\n", aleatorio, acumuladorPares);
		System.out.println("\n=========================================");

	}
}






