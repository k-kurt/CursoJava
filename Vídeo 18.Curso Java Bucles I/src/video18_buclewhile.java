import javax.swing.*;
public class video18_buclewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear acceso a la aplicacion
		
		String clave = "kevin";
		String contraseña = "";
		
		while (clave.equals(contraseña)==false) {
			contraseña = JOptionPane.showInputDialog("Ingresa la contraseña");
			
			if(clave.equals(contraseña)==false) {
				System.out.println("la contraseña es incorrecta");
			}
			
			
		}
		
		System.out.println("la contraseña es correcta, ya puedes ingresar");
		
	}

}
