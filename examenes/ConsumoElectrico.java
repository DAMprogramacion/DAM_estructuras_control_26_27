/*
 * ConsumeoElectrico.java
 */

import java.util.Scanner;
public class ConsumoElectrico {
	
	public static void main (String[] args) {
		//constantes
		final double PRECIO_KWH = 0.18;
		final int HORAS_DIA = 24;
		final int DIAS_MES = 30;
		
		Scanner scanner = new Scanner(System.in);
		
		//Potencia de los electrodomésticos
		System.out.println("Introduce la potencia de los electrodomésticos en vatios (W)");
		int potenciaElectrodomesticos = scanner.nextInt();
		//El valor introducido debe estar comprendido entre 350 y 2575, en caso que no esté en ese margen el programa finalizará.
		if (potenciaElectrodomesticos < 350 || potenciaElectrodomesticos > 2575){
			System.out.printf("%n%d W: Potencia no permitida%n", potenciaElectrodomesticos);
			return;
		}
		
		//Nº electrodomésticos a analizar (entre 1 y 3, sino el programa finaliza)
		System.out.println("Introduce el nº de los electrodomésticos a analizar (1-3)");
		int numeroElectrodomesticos = scanner.nextInt();
		if (numeroElectrodomesticos < 1 || numeroElectrodomesticos > 3){
			System.out.printf("Nº de electrodomésticos no permitodos%n", numeroElectrodomesticos);
			return;
		}

		//acumulador de horas
		double acumuladorconsumoMensual = 0;
		double acumuladorConsteMensual = 0;
		
		//solicitar nº horas encendido
		int horasEncendido = 0;
		for (int i = 1; i <= numeroElectrodomesticos; i++) {
			
			System.out.printf("%nIntroduce el nº horas encedido del electrodoméstico %d: ", i);
			horasEncendido = scanner.nextInt();
			if (horasEncendido < 0 || horasEncendido > 24)
				horasEncendido = 12;
				
			double consumoDiario = (double) potenciaElectrodomesticos / 1_000 * horasEncendido;
			System.out.printf("Consumo diario: %.2f kWh%n", consumoDiario);	
			
			double consumoMensual = consumoDiario * DIAS_MES;
			acumuladorconsumoMensual += consumoMensual;
			
			System.out.printf("Consumo mensual: %.2f kWh%n", consumoMensual);	
			double costeMensual = consumoMensual * PRECIO_KWH;
			
			acumuladorConsteMensual += costeMensual;
			System.out.printf("Coste mensual: %.2f €%n", costeMensual);	
			
		}
		scanner.close();
		//Datos mensuales:
		System.out.printf("%n%nConsumo mensual total: %.2f kWh%n", acumuladorconsumoMensual);
		System.out.printf("Coste mensual total: %.2f €%n", acumuladorConsteMensual);
		System.out.printf("Coste medio por electrodoméstico: %.2f €%n", acumuladorConsteMensual / numeroElectrodomesticos);
		
		
		
	}
}

