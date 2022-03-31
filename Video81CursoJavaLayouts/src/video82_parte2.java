import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class video82_parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout nuevoMarco=new MarcoLayout();
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nuevoMarco.setVisible(true);
		
	}

}

class MarcoLayout extends JFrame{
	public MarcoLayout() {
		setTitle("video 82 parte 2");
		setBounds(100,100,800,500);
		LaminaLayout lamina=new LaminaLayout();
		add(lamina,BorderLayout.NORTH);
		Lamina2 lamina2= new Lamina2();
		add(lamina2,BorderLayout.SOUTH);
	}
}

class LaminaLayout extends JPanel{
	public LaminaLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("negro"));
		add(new JButton("amarillo"));
	}
}


class Lamina2 extends JPanel{
	public Lamina2() {
		setLayout(new BorderLayout(10,10));
		add(new JButton("rojo"),BorderLayout.WEST);
		add(new JButton("violeta"),BorderLayout.CENTER);
		add(new JButton("gris"), BorderLayout.EAST);
	}
}
