import java.util.*;
import javax.swing.*;


public class video17_conidcionalesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * calcular el area de un cuadrado, rectangulo, circulo, triangulo
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("elige una opcion: \nn1: Cuadrado \nn2: Rectangulo \nn3: Triangulo \nn4: Circulo");
	
		int figura = entrada.nextInt();
		
		switch(figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("introdusca el lado"));
		
			System.out.println("El area del cuadrado es: "+Math.pow(lado, 2));
			
			break;
			
			
		case 2:
			
			
			int base_rectangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
			
			int altura_rectangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectangulo"));
			
			System.out.println("el area del rectangulo es: "+ base_rectangulo*altura_rectangulo);
			
			break;
			
		case 3:
			
			int base_triangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
			
			int altura_triangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
			
			System.out.println("el area del triangulo: "+ (base_triangulo * altura_triangulo)/2);
			
			break;
			
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
			
			System.out.println("el area del circulo es ");
			
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
		
			
			break;
			
		default:
			System.out.println("la opcion no es correcta");
		}
		
		
	
	}

}
