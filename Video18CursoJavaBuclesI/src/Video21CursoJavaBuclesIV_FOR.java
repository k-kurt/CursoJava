import javax.swing.*;

public class Video21CursoJavaBuclesIV_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=0; i<10; i++) {
//			System.out.println("kevin"+i);
//		}
		
		
		//ejercicio de ver si un email tiene mas de un @
		
		boolean arroba=false;
		
		String email = JOptionPane.showInputDialog("introduce el email");
		
		for(int i=0; i<email.length();i++) {
			
			if(email.charAt(i)=='@') {
				arroba=true;
			}
		}
		
		if(arroba==true) {
			System.out.println("el email es correcto");
		}else
		{
			System.out.println("el email es incorrecto");
		}
		
		
	}

}
