package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Video145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rc = new Scanner(System.in);
		int decision;

		System.out.println("Que quiere hacer?");
		System.out.println("Ingrese 1 para ingresas los datos o 2 para salir");
		decision = rc.nextInt();
		if (decision == 1) {
			try {
				pedirDatos145();
			} catch (InputMismatchException e) {
				System.out.println("QUE DEMONIOS HAS INTRODUCIDO EN EDAD?");
			}
		} else {
			System.out.println("hemos terminado");
			System.exit(0);
		}
		rc.close();

	}

	// Este programa funciona sin embargo no es del todo correcto y lo vamos a
	// corregir, el motodo no puede tomar el try catch
	// si lanzas un metodo que capture una exception lo logico es que la exception
	// este fuera del metodo, el metodo lanza la exception y el pro
	// pio metodo captura la exception

	//LAS EXCEPCIONES COMPROBADAS SI NOS OBLIGAN A CREAR EL TRY CATCH
	static void pedirDatos145() throws InputMismatchException {
		// TODO Auto-generated method stub
		// try{
		System.out.println("Ingrese su nombre");
		Scanner rc = new Scanner(System.in);
		String nombre = rc.nextLine();
		System.out.println("ingrese su edad");
		int edad = rc.nextInt();
		System.out.println("Gracias por ingresar sus datos. Su nombre es: " + nombre + " y su edad es: " + edad
				+ " y en un año tendra: " + (edad + 1) + " años");
		rc.close();
		// }catch(InputMismatchException e) {
		// System.out.println("QUE DEMONIOS HAS INTRODUCIDO EN EDAD");

		System.out.println("Hemos terminado");
	}

}
