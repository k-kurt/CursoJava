import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Eventos_Ventanas_Video70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Ventana marco1=new Marco_Ventana();
		marco1.setBounds(100, 100, 800, 500);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marco_Ventana extends JFrame{
	public Marco_Ventana(){
		setVisible(true);
		Cambio_estado nuevo_estado=new Cambio_estado();
		addWindowStateListener(nuevo_estado);
	}
}


class Cambio_estado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e) {
		//System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		if(e.getNewState()==6) {
			System.out.println("La pantalla ha sido maximizada");
		}else if(e.getNewState()==Frame.NORMAL) {
			System.out.println("La ventana ha esta normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La ventana ha sido minimizada");
		}
	}
}