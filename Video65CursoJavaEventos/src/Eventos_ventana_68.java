import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Eventos_ventana_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana marco=new MarcoVentana();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Marco 1");
		MarcoVentana marco2=new MarcoVentana();
		marco2.setTitle("Marco 2");
		marco2.setBounds(0, 0, 500, 500);
		marco.setBounds(600,0,500,500);
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}


class MarcoVentana extends JFrame{
	public MarcoVentana() {
		//setTitle("Video 68");
		setVisible(true);
		//setBounds(50, 50, 1500, 800);
		M_Ventana ventana_oyente=new M_Ventana();
		addWindowListener(ventana_oyente);
		
	}
}

class M_Ventana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("cerrando ventana");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana se ha cerrado");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana restaurada");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana activa");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana desactiva");
	}

	
	
}