import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class pruebatemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reloj mireloj = new reloj(/* 3000, true */);

		mireloj.enMarcha(3000, true /* ahora se lo pasamos a este */);

		JOptionPane.showInternalMessageDialog(null, "pulsa aceptar para terminar");

		System.exit(0);

	}

}

class reloj {
	/*
	 * public reloj( int intervalo,boolean sonido ) {
	 * 
	 * 
	 * this.intervalo=intervalo; this.sonido=sonido;
	 * 
	 * estos ya no son necesarios por que no se pueden acceder a ellos
	 * 
	 * 
	 * }
	 */

	public void enMarcha( int intervalo, final boolean sonido /* tiene que ir con el final por que estan accediendo a ella */) {

		/* private */ class Damehora2 implements ActionListener {
			/*
			 * el private no va cuando es una clase interna local, esta antes estaba afuera
			 * del metodo, entonces era una clase interna solamente
			 */

			public void actionPerformed(ActionEvent evento) {

				Date ahora = new Date();

				System.out.println("te pongo la hora cada 3 segundos: " + ahora);

				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}

			}
		}

		ActionListener oyente = new Damehora2();

		Timer mitemporizador = new Timer(intervalo, oyente);

		mitemporizador.start();

	}

	private int intervalo;
	private boolean sonido;

}


/*
 * se simplifica mucho el codigo haciendo clases internas locales, pero solo se
 * pueden usar cuando son llamadas una sola vez, al igual que la clases internas
 
 *las clases internas locales van dentro de los metodos sin modificadores de acceso, 
 */
