package excepciones;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class Video146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String el_mail = JOptionPane.showInputDialog("Introduce mail: ");
		
		try {
		examina_mail(el_mail);
		}catch(EOFException e) {
			System.out.println("EL email ingresado es incorrecto");
		}
		}
		
	
	
	/*Lanzamiento de excepciones de forma manual, con la clausula throw
	 * no confundir con la clausula throws, esta ultima se utiliza para usar en un metodo, lo que 
	 * indica que es metodo podria lanzar una exception
	 * con la clausula throw se inidica manualmente que se lanzara una exception en cualquier 
	 * parte del codigo*/
	

	static void examina_mail(String mail) throws EOFException{//esta exception nos obliga a crear un try catch
		//esta exception no es la indicada para el codigo que estamos haciendo ya que es para recorrer un archivo
	
	
	//static void examina_mail(String mail) throws ArrayIndexOutOfBoundsException{//no nos pide el try catch por que no es controlada, indicamos al metodo 
		//con esto que va a haber una exception
		int arroba = 0;
		boolean punto = false;
		
		
		
		if(mail.length()<=3) {
		
			//ArrayIndexOutOfBoundsException mi_exception=new ArrayIndexOutOfBoundsException();
			//throw mi_exception;
			
			throw new EOFException();
			
			
			//throw new ArrayIndexOutOfBoundsException();//esta exception no nos obliga a crear el try catch por que es no controlada
		
		}else {
			
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
