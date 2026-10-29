/*
 * BibliotecaMatematica.java
 * Clase que tiene varios método matemáticos
 * que vamos a usar en otra clase
 */


public class BibliotecaMatematica {
	
	public static int obtenerMinimoDeTres (int a, int b, int c) {
		return Math.min(Math.min(a, b), c);  
	}
	
	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		else if ( numero == 2 || numero == 3) {
			return true;
		}
		else { //sobre el else
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					return false;
				}
			}
		}
		return true; //si llegas aquí porque eres un nº primo distinto a 2 ó 3
	}
}

