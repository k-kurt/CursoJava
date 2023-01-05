import javax.swing.JOptionPane;

public class Vídeo15CursoJavaEntradaSalidadatosII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		
		System.out.println("tu nombre es: "+ nombre);
	
		String edad = JOptionPane.showInputDialog("Ingrese tu edad");
		
		int edad_usuario = Integer.parseInt(edad);//hay que pasar a entero el string edad para eso usamos parseInt, integer es la clase
		
		System.out.println("tu edad dentro de un anio es: "+(edad_usuario+1));
		
		
		
		//minuto 9:10
		
		
		
	}

}
