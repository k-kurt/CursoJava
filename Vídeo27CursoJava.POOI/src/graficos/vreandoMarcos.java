package graficos;

import java.awt.Frame;

import javax.swing.*;

public class vreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}

	class miMarco extends JFrame{
		public miMarco() {
			/*
			 * setSize(300,300);
			 * 
			 * setLocation(500, 300);
			 */ /* setLocation(x,y); y va para abajo y es positivo . a estos metodos de la clase
			 *JFrame lo podemos cambiar por otro metodo de la misma clase que hace en una las dos cosas*/
		
		
			
			
			setBounds(500, 300, 750, 250); //setBounds(x,y,whidth,height)
		
		
		/*
		 * setResizable(false);//PErmite o no redimencionar una ventana
		 */		
		
		
		/*
		 * setExtendedState(Frame.MAXIMIZED_BOTH);//Este campo de clase hace que la
		 * pantalla se maximice
		 */		
		
			
			
			setTitle("ventana");//pone nombre a la ventana que creamos
		
		
		}
		
		
	}
	
	




	
	

