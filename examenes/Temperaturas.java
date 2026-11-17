/*
 * Temperaturas.java
 */

import java.util.Scanner;
public class Temperaturas {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//constantes
		final int DIAS_SEMANA = 7;
		final double LIMITE_TEMPERATURA = 50.0;
		//Solicita al usuario un número entero de días que quiera analizar, entre 1 y 7, en caso contrario acaba el programa
		System.out.println("Introduce el nº de días a analizar (1-7)");
		int diasAnalizar = scanner.nextInt();
		if (diasAnalizar < 1 || diasAnalizar > 7) {
			System.out.printf("%d nº de días no  válidos%n", diasAnalizar);
			return; 
		}
		double acumuladorTemperaturaMaxima = 0;
		double maximoTemperatura = -10_000;
		//solicitando datos de temperaturas máximas
		for (int i = 1; i <= diasAnalizar; i++){
			System.out.printf("Introduce temperatura máxima del día %d: ", i);
			double temperaturaMaxima = scanner.nextDouble();
			if (temperaturaMaxima < -20 || temperaturaMaxima > LIMITE_TEMPERATURA)
				temperaturaMaxima = (-20 + LIMITE_TEMPERATURA) / 2;
			acumuladorTemperaturaMaxima += temperaturaMaxima;
			if (temperaturaMaxima > maximoTemperatura)
				maximoTemperatura = temperaturaMaxima;			
		}
		//mostrando el análisis de temperaturas
		System.out.printf("La temperatura media máxima en ese periodo ha sido %.2f%n", acumuladorTemperaturaMaxima / diasAnalizar);
		System.out.printf("La temperatura máxima en ese periodo ha sido %.2f%n", maximoTemperatura);
	}
}

