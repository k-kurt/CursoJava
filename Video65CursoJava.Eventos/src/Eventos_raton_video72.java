import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Eventos_raton_video72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_raton marco_1=new Marco_raton();
		marco_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_raton extends JFrame{
	public Marco_raton() {
		setVisible(true);
		setBounds(100,100,800,500);
		setTitle("video 72");
		/*
		 * EventosdeRaton raton=new EventosdeRaton(); addMouseListener(raton);
		 */
		addMouseListener(new Mouse_action());
		
	}
}

/*
 * class EventosdeRaton implements MouseListener{
 * 
 * @Override public void mouseClicked(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("haz hecho click"); }
 * 
 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("acabas de presionar"); }
 * 
 * @Override public void mouseReleased(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("acabas de levantar"); }
 * 
 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("acabas de entrar"); }
 * 
 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
 * method stub System.out.println("acabas de salir"); }
 * 
 * }
 */

class Mouse_action extends MouseAdapter{
	public void mouseClicked(MouseEvent e) {
		System.out.println("haz hecho click");
	}
}