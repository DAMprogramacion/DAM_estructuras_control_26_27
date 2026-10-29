/*
 * SegundoSwitch.java
 * Programa que muestra en consola en que 
 * parte de la semana está
 * Dentro de 701 días será fin de semana"
 */

import java.util.Random;

public class SegundoSwitch {
	
	public static void main (String[] args) {
		Random random = new Random();
		int diasFuturos = random.nextInt(1, 1001); 
		int diaActual = 4;
		int diaFuturo = (diasFuturos + diaActual) % 7;
		switch (diaFuturo) {
			case 0, 1:
				System.out.println("Dentro de " + diasFuturos + " será PRINCIPIO DE SEMANA");
				break;
			case 2, 3, 4:
				System.out.println("Dentro de " + diasFuturos + " será EN MEDIO DE LA SEMANA");
				break;
			default:
				System.out.println("Dentro de " + diasFuturos + " será FIN DE SEMANA");
		}
	}
}

