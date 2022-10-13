package tema2boletin2;

import java.util.Scanner;

public class Tema2Boletin2Ejercicio2 {
/*Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana. 
 * Se debe mostrar el nombre del día de la semana al que corresponde.
 *  Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.*/
	public static void main(String[] args) {
		//declaramos las variables
	int	diaIntroducidoUser;
	
	//iniciamos el scanner
	Scanner lee = new Scanner(System.in);
	
	//solicitamos al usuario el numero y lo guardamos en la variable diaIntroducidoUser
	System.out.println("Por favor introduzca un numero del 1 al 7 para saber a que dia de la semana corresponde: ");
	diaIntroducidoUser = lee.nextInt();
	
	switch (diaIntroducidoUser) {
	case 1 -> {
		System.out.println("Lunes");
	}
	case 2 ->{
		System.out.println("Martes");
	}
	case 3 ->{
		System.out.println("Miercoles");
	}
	case 4 ->{
		System.out.println("Jueves");
	}	
	case 5 ->{
		System.out.println("Viernes");
	}
	case 6 ->{
		System.out.println("Sabado");
	}
	case 7 ->{
		System.out.println("Domingo");
	}
		default-> {
			System.out.println("Es importante que el valor sea del 1 al 7");
	}
	}
	//cerramos el scanner
	lee.close();
	
	}

}
