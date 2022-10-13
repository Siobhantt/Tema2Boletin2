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
		int num = 0, num2= 0;
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos el numero de la primera y la segunda tirada
		
		System.out.println("El resultado de las tiradas debe introducirlo en letras!");
		
		System.out.println("Por favor introduzca el resultado de la primera tirada:");
		tirada1 = lee.next();
		
		System.out.println("Por favor introduzca el resultado de la segunda tirada:");
		tirada2 = lee.next();
		
		//iniciamos el switch donde comprobamos que en cada tirada se alamcenara el resultado en letra e igualamos la variable num de ese resultado pero en numero
		//ejemplo: "uno" se guarda en la variable tirada1 y en la variable num guardamos el equivalente el numero que seria 1, hacemos eso con todos los casos
		
		switch (tirada1) {
		case "uno", "UNO" :
			num = 1;
		break;
		
		case "dos", "DOS" :
			num = 2;
		break;
		
		case "tres", "TRES" :
			num = 3;
		break;
		
		case "cuatro", "CUATRO" :
			num = 4;
		break;
		
		case "cinco", "CINCO" :
			num = 5;
		break;
		
		case "seis", "SEIS" :
			num = 6;
		break;
		
		default :
		System.out.println("Introduzca el dato correctamente.");
		}
		
		//luego hacemos lo mismo pero en otra variable llamada tirada dos
		//se deben hacer 2 switchs porque son dos tiradas
		
		switch (tirada2) {
		
		case "uno", "UNO":
			num2 =1;
		break;
		
		case "dos", "DOS":
			num2 = 2;
		break;
		
		case "tres", "TRES":
			num2 = 3;
		break;
		
		case "cuatro", "CUATRO":
			num2 = 4;
		break;
		
		case "cinco", "CINCO" :
			num2 = 5;
		break;
		
		case "seis", "SEIS" :
			num2 = 6;
			break;
		
		default:
			System.out.println("Introduzca el dato correctamente.");
			}
		
		//imprimimos el resultado guardando entre parentesis para que se sumen correctamente.
	
		/*Iniciamos un if y establecemos que num y num2 sea mayor a 0 y solo en 
		ese caso imprima el resultado de ambas tiradas por si el usuario es *** y pone 
		otra cosa en la entrada del programa que no sea lo que se le ha soicitado*/
		
		
		if (num>0 && num2>0) {
			System.out.println("el resultado de la tirada es: " + (num + num2));
		}
		
		//cerramos el scanner
		lee.close();
	}
}
