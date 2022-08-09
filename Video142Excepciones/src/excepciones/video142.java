package excepciones;

import javax.swing.JOptionPane;

public class video142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] matriz= new int[5];
		matriz[0]=1;
		matriz[1]=2;
		matriz[2]=3;
		matriz[3]=4;
		matriz[4]=5;
		
		for(int i=0;i<matriz.length;i++) {
			System.out.println("el numero de la posicion "+i+ " es: "+matriz[i]);
		}
		
		
		//peticion de datos
		String nombre=JOptionPane.showInputDialog("ingrese su nombre");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("ingresa tu edad"));
		System.out.println("hola "+nombre+" tienes "+ edad+" años de edad."+" El programa finalizo");
		
	}

}
