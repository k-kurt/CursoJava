import javax.swing.*;
public class video18_buclewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear acceso a la aplicacion
		
		String clave = "kevin";
		String contraseņa = "";
		
		while (clave.equals(contraseņa)==false) {
			contraseņa = JOptionPane.showInputDialog("Ingresa la contraseņa");
			
			if(clave.equals(contraseņa)==false) {
				System.out.println("la contraseņa es incorrecta");
			}
			
			
		}
		
		System.out.println("la contraseņa es correcta, ya puedes ingresar");
		
	}

}
