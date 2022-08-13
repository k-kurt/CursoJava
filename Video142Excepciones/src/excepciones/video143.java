package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class video143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rc=new Scanner(System.in);
		int decision;
		
		
		System.out.println("Que quiere hacer?");
		System.out.println("Ingrese 1 para ingresas los datos o 2 para salir");
		decision=rc.nextInt();
		if(decision==1) {
			pedirDatos();
		}else {
			System.out.println("hemos terminado");
			rc.close();
		}
		
		
	}

	public static void pedirDatos() throws InputMismatchException{
		// TODO Auto-generated method stub
		try{
		System.out.println("Ingrese su nombre");
		Scanner rc=new Scanner(System.in);
		String nombre=rc.nextLine();
		System.out.println("ingrese su edad");
		int edad=rc.nextInt();
		System.out.println("Gracias por ingresar sus datos. Su nombre es: "+nombre+" y su edad es: "+edad+" y en un año tendra: "+(edad+1)+" años");
		rc.close();
		}catch(InputMismatchException e) {
		System.out.println("QUE DEMONIOS HAS INTRODUCIDO EN EDAD");
	}
		System.out.println("Hemos terminado");
	}

}
