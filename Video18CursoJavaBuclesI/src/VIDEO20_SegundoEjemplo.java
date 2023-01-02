import java.util.Scanner;

import javax.swing.*;
public class VIDEO20_SegundoEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String genero = "";
		
		int peso_ideal = 0;
		
		do {

			genero=JOptionPane.showInputDialog("Ingrese su genero(H/M)");
			
			
		}
		while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm"));//el parseint lo cambia a entero por que el imput dialog guarda un string
		
		if(genero.equalsIgnoreCase("H")) {
			peso_ideal= altura-110;
			 
		}
		
		else if(genero.equalsIgnoreCase("M")) {
			peso_ideal= altura-120;
		}
		
		System.out.println("tu peso ideal es: "+ peso_ideal);
		
	}

}
