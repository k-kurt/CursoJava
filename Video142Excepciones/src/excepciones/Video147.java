package excepciones;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class Video147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String el_mail = JOptionPane.showInputDialog("Introduce mail: ");
		try {
			examina_mail(el_mail);

		} catch (Exception e) {
			System.out.println("El email es incorrecto");
			e.printStackTrace();//me muestra en mas detalle la exception, que clase lanzo la exception
		}
	}

	static void examina_mail(String mail) throws longitud_mail_erronea {
		int arroba = 0;
		boolean punto = false;

		if (mail.length() <= 3) {

			throw new longitud_mail_erronea("El mail no puede tener menos de tres carecteres");

		} else {

			for (int i = 0, n = mail.length(); i < n; i++) {
				if (mail.charAt(i) == '@') {
					arroba++;
				}

				if (mail.charAt(i) == '.') {
					punto = true;
				}
			}

			if (arroba == 1 && punto == true) {
				System.out.println("Es correcto.");
			} else {
				System.out.println("No es correcto.");
			}
		}
	}

}

//class longitud_mail_erronea extends RuntimeException{

class longitud_mail_erronea extends Exception {// cuando creas una clase de exception propia debes crear dos
												// constructores, uno vacio
	// y otro con un mensaje
	public longitud_mail_erronea() {

	}

	public longitud_mail_erronea(String msj_error) {
		super(msj_error);// con el super estamos pasando la variable msj_error al contructor de la clase
							// padre(Exception)
	}

}

//la exception RunTimeException es no controlada por lo tanto no necesita el try catch
//Exception es mas general que sigue pidiendo el try catch 
