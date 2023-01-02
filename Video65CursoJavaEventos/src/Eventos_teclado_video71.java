import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Eventos_teclado_video71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco marco=new Marco();
		marco.setBounds(100,100,800,500);
		marco.setTitle("video71");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco extends JFrame{
	public Marco() {
		setVisible(true);
		addKeyListener(new EventodelTeclado());
	}
}


class EventodelTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra=e.getKeyChar();
		System.out.println(letra);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int codigo=e.getKeyCode();
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}