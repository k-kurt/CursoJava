package excepciones;

import javax.swing.JOptionPane;

public class video148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//		division();}
//		catch(Exception e) {
//			System.out.println("ha ocurrido un error");
		// esto no es buena practica por que no nos indica nada, falta informacion

		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("No puedes dividir por 0");
			
		}catch(NumberFormatException e) {
			System.out.println("No has introducido un numero entero");
			System.out.println(e.getMessage());//muestra el error que introducimos
			System.out.println("se ha generado un error del siguiente tipo: "+ e.getClass().getName());//nombre de clase que genera el error
		}
	}

	static void division() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		// el imputdialog teasforma todo a string entonces hay que usar el
		// integer.ParseInt para transformarlo a entero
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		System.out.println("la divisio da: " + num1 / num2);
	}

}

//varias exceptions
//no es buena practica capturar la exception con el objeto try catch a exceptions no controladas, se supone que son errores de 
//programacion y que debemos solventarlos de otra forma
//todas estas exceptions son heredadas de runtimeexception y son no controladas por lo tanto no es buena practica utilizarlos
