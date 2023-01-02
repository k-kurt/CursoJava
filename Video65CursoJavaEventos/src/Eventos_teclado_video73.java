import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_teclado_video73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton marco1=new MarcoRaton();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(100, 100, 800, 500);
		setTitle("video 73");
		addMouseListener(new PanelRaton());
		addMouseMotionListener(new PanelRaton());
		
	}
}

class PanelRaton extends MouseAdapter{
	
	/*	public void mouseClicked(MouseEvent e) {
			//System.out.println("has hecho click");
			//System.out.println("coordendas x: " + e.getX()+" coordenadas y: "+ e.getY());
			System.out.println(e.getClickCount());
	}*/
	
	public void mousePressed(MouseEvent e) {
		//System.out.println(e.getModifiersEx());
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("has presionado el clik izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("has presionado la ruedita");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("has presionado el click derecho");
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando el mouse");
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println("estas moviendo el mouse");
	}
}