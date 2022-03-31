import javax.swing.JOptionPane;

public class VIDEO22_elFactorialDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ejercicio de factorial de un numero
		
		int resultado = 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("INgrese numero a factorizar"));
		
		for(int i = numero; i>0;i--) {
			
			resultado=resultado*i;
		}
		
		System.out.println("el factorial del numero: "+numero+ " es igual a "+resultado);
		
		
	}

}
