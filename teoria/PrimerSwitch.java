/*
 * PrimerSwitch.java
 * Programa que muestra en consola el día de 
 * la semana de un día futuro, ejemplo
 * "Dentro de 700 días será viernes"
 */

import java.util.Random;

public class PrimerSwitch {
	
	public static void main (String[] args) {
		Random random = new Random();
		int diasFuturos = random.nextInt(1, 1001); 
		int diaActual = 4;
		int diaFuturo = (diasFuturos + diaActual) % 7;
		switch (diaFuturo) {
			case 0:
				System.out.println("Dentro de " + diasFuturos + " será LUNES");
				break;
			case 1:
				System.out.println("Dentro de " + diasFuturos + " será MARTES");
				break;
			case 2:
				System.out.println("Dentro de " + diasFuturos + " será MIÉRCOLES");
				break;
			case 3:
				System.out.println("Dentro de " + diasFuturos + " será JUEVES");
				break;
			case 4:
				System.out.println("Dentro de " + diasFuturos + " será VIERNES");
				break;
			case 5:
				System.out.println("Dentro de " + diasFuturos + " será SÁBADO");
				break;
			default:
				System.out.println("Dentro de " + diasFuturos + " será DOMINGO");
		}
	}
}

