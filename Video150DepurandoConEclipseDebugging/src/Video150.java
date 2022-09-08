import javax.swing.JOptionPane;

public class Video150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_matriz=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantadidad de elementos de la matriz"));
		int elem_aleat[]=new int[num_matriz];
		 for(int i=0;i<elem_aleat.length;i++) {
			 //elem_aleat[i]=(int)Math.random()*100; si hacemos el cambio a int antes solo tomara los enteros del decimal, con el 100 el numero queda mas grande
			 //entonces al tomar los enteros tomas numeros dintintos de 0
			 elem_aleat[i]=(int)(Math.random()*100);
		 }
		
		 for(int elementos : elem_aleat) {
			 
			 System.out.println(elementos);
		 }
		
	}

}



/*
 * En el video 151 vemos en la vista debug en el apartado de breakpoints que se
 * puede poner un condicional para hacer puntos de interrupcion
 * veos en las variables que se detuvo el array en el 5 por que eso le indicamos 
 * en el condicional que i==5
 * 
 * tambien tenemos el apartado expressions que esta junto a variables y brackpoints e la vista debug
 * sino esta entonces lo buscamos en las opciones de windows 
 * ponemos pj elem_aleat[7] y cuando el array llegue a ese numero veremos que valor tiene
 * tenemos que desactivar en este caso el condicional anterior
 * 
 *  
 *  el boton step into se utiliza para entrar en el archivo donde se esta ejecutando
 *  o retornando el valor que se esta ejecutando
 */