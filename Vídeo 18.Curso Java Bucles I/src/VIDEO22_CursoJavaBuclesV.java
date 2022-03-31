import javax.swing.JOptionPane;

public class VIDEO22_CursoJavaBuclesV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean punto = false;
		int arroba = 0;
		
		String email = JOptionPane.showInputDialog("Ingrese su email");
		
		for(int i=0; i<email.length();i++) {
			if(email.charAt(i)=='@') {
				arroba++;
			}
			if(email.charAt(i)=='.') {
				punto = true;
			}
		}
		
		if(arroba==1&&punto==true) {
			System.out.println("EL email es correcto");
		}
		else{System.out.println("el email es incorrecto");}
		
	}

}
