package tema2boletin2;

import java.util.Scanner;

public class Tema2Boletin2Ejercicio4 {
/*Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que haría el usuario. 
 * El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”).
Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario también dará esa información en formato cadena.
Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.
*/
	public static void main(String[] args) {
		//declaramos las variables
		String tirada1, tirada2;
		int num, num2;
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos el numero de la primera y la segunda tirada
		
		System.out.println("El resultado de las tiradas debe introducirlo en letras!");
		System.out.println("Por favor introduzca el resultado de la primera tirada:");
		tirada1 = lee.next();
		System.out.println("Por favor introduzca el resultado de la segunda tirada:");
		tirada2 = lee.next();
		
		
		switch (tirada1) {
		case "uno" :
			num = 1;
		break;
		
		case "dos" :
			num = 2;
		break;
		
		case "tres" :
			num = 3;
		break;
		
		case "cuatro" :
			num = 4;
		break;
		
		case "cinco" :
			num = 5;
		break;
		
		case "seis" :
			num = 6;
		break;
		}
		
		switch (tirada2) {
		
		case "uno" :
			num2 =1;
		break;
		
		case "dos" :
			num2 = 2;
		break;
		
		case "tres" :
			num2 = 3;
		break;
		
		case "cuatro" :
			num2 = 4;
		break;
		
		case "cinco" :
			num2 = 5;
		break;
		
		case "seis" :
			num2 = 6;
		break;
		default: 
			System.out.println(num + num2);
			}
	
	}
}
