package tema2boletin2;

import java.util.Scanner;

public class Tema2Boletin2Ejercicio5 {
/*Queremos saber, una vez introducido un carnet de conducir, a qué corresponde. Sabiendo:
    a) E: remolques.
    b) D: autobuses.
    c) C1-C5: camiones.
    d) A: motocicletas.
    e) B1-B2: automóviles.
    f) En caso de introducir uno distinto: “Categoría no contemplada”.*/

	public static void main(String[] args) {
		//declaramos la variable donde guardaremos la opcion del usuario
		
		String carnetUser;
		
		//iniciamos el Scanner
		
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos la solicitud y guardamos lo que introduzca el usuario en la variable carnetUser
		
		System.out.println("Por favor introduzca el carnet que desea verificar: ");
		carnetUser = lee.next();
		
		//iniciamos el switch donde comprobaremos que tipo de carnet introducirá el usuario
		switch (carnetUser) {
		
		//comprobamos cada uno de los carnets 
		
		case "E" -> { 
		System.out.println("El carnet clase E corresponde a Remolques");
		}
		
		case "D" -> { 
			System.out.println("El carnet clase E corresponde a Autobuses");
		}
		
		case "C1", "C2" ,"C3", "C4" ,"C5" -> { 
			System.out.println("El carnet clase E corresponde a Camiones");
			}
		
		case "A" -> { 
			System.out.println("El carnet clase E corresponde a Motocicletas");
			}
		
		case "B1", "B2" -> { 
			System.out.println("El carnet clase E corresponde a Automoviles");
			}
		default ->{
			System.out.println("Categoria no contemplada.");
		}
		}
		
		//cerramos el scanner
	lee.close();
	}
		
		

	}


