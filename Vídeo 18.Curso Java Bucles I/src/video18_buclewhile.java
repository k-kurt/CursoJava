import javax.swing.*;
public class video18_buclewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear acceso a la aplicacion
		
		String clave = "kevin";
		String contrase�a = "";
		
		while (clave.equals(contrase�a)==false) {
			contrase�a = JOptionPane.showInputDialog("Ingresa la contrase�a");
			
			if(clave.equals(contrase�a)==false) {
				System.out.println("la contrase�a es incorrecta");
			}
			
			
		}
		
		System.out.println("la contrase�a es correcta, ya puedes ingresar");
		
	}

}
