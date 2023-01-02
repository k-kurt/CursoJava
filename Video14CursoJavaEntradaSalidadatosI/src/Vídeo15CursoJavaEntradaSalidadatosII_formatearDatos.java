import javax.swing.JOptionPane;

public class Vídeo15CursoJavaEntradaSalidadatosII_formatearDatos {

	public static void main(String[] args) {

		
		/*
		 * double x=10000.0;
		 * 
		 * System.out.printf("%1.2f",x/3); *///el 2 despues de la coma indica la cantidad de 
		
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		
		double num2=Double.parseDouble(num1);
		
		System.out.println("La raiz de " + num2 + " es ");
		
		System.out.printf("%1.4f", Math.sqrt(num2));
		
		
		
	}

}
