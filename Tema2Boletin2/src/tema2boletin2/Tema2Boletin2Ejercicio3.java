package tema2boletin2;

import java.util.Scanner;

public class Tema2Boletin2Ejercicio3 {
/*Escribe un algoritmo que le pida al usuario dos números. A continuación debe mostrar el siguiente menú por pantalla:
SUMAR LOS NÚMEROS
RESTAR LOS NÚMEROS
MULTIPLICAR LOS NÚMEROS
DIVIDIR LOS NÚMEROS
	Después, el algoritmo debe pedirle al usuario que selecciona una opción y que haga la operación que marca esa opción, 
	mostrando por último el resultado de la operación elegida por el usuario. 
	Si el usuario elige una opción incorrecta, el algoritmo se lo hace saber al usuario	y no haría nada.*/
	public static void main(String[] args) {
		//declaramos las variables
		int primerNumero, segundoNumero;
		String opcionUser;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos al usuario los dos numeros
		System.out.println("Por favor introduzca 2 numeros: ");
		primerNumero = lee.nextInt();
		segundoNumero = lee.nextInt();
		
		System.out.println("Que operacion necesita usar? ");
		System.out.println("(a)SUMAR LOS NÚMEROS");
		System.out.println("(b)RESTAR LOS NÚMEROS");
		System.out.println("(c)MULTIPLICAR LOS NÚMEROS");
		System.out.println("(d)DIVIDIR LOS NÚMEROS");
		
		//leemos la opcion del usuario
		System.out.println("Introduzca su eleccion: ");
		opcionUser = lee.next();
		
		
		switch (opcionUser) {
		
		case "a" :
			System.out.println(primerNumero + segundoNumero);
		break;
		
		case "b" :
			System.out.println(primerNumero - segundoNumero);
		break;
		
		case "c" :
			System.out.println(primerNumero * segundoNumero);
		break;
		
		case "d" :
			System.out.println(primerNumero / segundoNumero);
		break;
		
		default :
		System.out.println("Error, elija una de las opciones disponibles.");
		}
		//cerramos el scanner
		lee.close();
	}

}
