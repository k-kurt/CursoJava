import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_video81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoDeLayouts marco = new MarcoDeLayouts();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoDeLayouts extends JFrame{
	public MarcoDeLayouts() {
		setTitle("Video 81");
		setBounds(100, 100, 800, 500);
		LaminaDeLayouts lamina=new LaminaDeLayouts();
		/*
		 * FlowLayout dispocision=new FlowLayout(FlowLayout.LEFT);
		 * lamina.setLayout(dispocision);
		 */
		lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(lamina);
		
	}
}

class LaminaDeLayouts extends JPanel{
	
	public LaminaDeLayouts() {
		add(new JButton("amarillo"));
		add(new JButton("rojo"));
		add(new JButton("violeta"));
		
	}
}