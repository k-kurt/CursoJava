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
