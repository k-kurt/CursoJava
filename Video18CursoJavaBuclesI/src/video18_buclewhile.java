import javax.swing.*;
public class video18_buclewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear acceso a la aplicacion
		
		String clave = "kevin";
		String contrasenia = "";
		
		while (clave.equals(contrasenia)==false) {
			contrasenia = JOptionPane.showInputDialog("Ingresa la contrasenia");
			
			if(clave.equals(contrasenia)==false) {
				System.out.println("la contrasenia es incorrecta");
			}
			
			
		}
		
		System.out.println("la contrasenia es correcta, ya puedes ingresar");
		
	}

}
