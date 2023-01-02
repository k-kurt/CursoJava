import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;

public class pruebaTemporaizador {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dameLaHora oyente= new dameLaHora();
		//ActionListener oyente = new DameLaHora();
		
		
		Timer mitemporizador=new Timer(5000, oyente);
					
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "dele aceptar para cerrar ventana");
		
		System.exit(0);
		
	}

}


class dameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora =new Date();
		System.out.println("te digo la hora cada 5 segundos: "+ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}


	
	
	
}


