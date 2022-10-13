package tema2boletin2;

import java.util.Scanner;

public class Tema2Boletin2Ejercicio1 {
/*Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
 *  suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).*/
	public static void main(String[] args) {
		//declaracion de variables
		int notaUser;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//imprimimos la solicitud y la guardamos en la variable notaUser
		System.out.println("Por favor introduzca una nota entera: ");
		notaUser = lee.nextInt();
		
		//iniciamos el switch donde guardaremos lo que debe imprimir segun cada resultado
		
		switch (notaUser) {
		case 0, 1, 2, 3, 4 :
			System.out.println("Insuficiente");
		break;
		case 5 :
			System.out.println("Suficiente");
			break;
		case 6 :
			System.out.println("Bien");
			break;
		case 7,8 :
			System.out.println("Notable");
			break;
		case 9, 10 :
			System.out.println("Sobresaliente");
			break;
			default:
				System.out.println("??");
		}
		
		//cerramos el scanner
		 lee.close();
		
	}

}
