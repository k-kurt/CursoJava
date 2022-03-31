import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class video82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco marco=new Marco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marco extends JFrame{
	public Marco() {
		setTitle("video 82");
		setBounds(100,100,800,500);
		Panel lamina=new Panel();
		/* lamina.setLayout(new FlowLayout(FlowLayout.CENTER,100,300)); */
		add(lamina);
	}
}


class Panel extends JPanel{
	public Panel() {
		
		//setLayout(new FlowLayout(FlowLayout.CENTER,80,150));
		setLayout(new BorderLayout(10,10));
		add(new JButton("negro"), BorderLayout.NORTH);
		add(new JButton("naranja"), BorderLayout.SOUTH);
		add(new JButton("marron"),BorderLayout.WEST);
		add(new JButton("azul"), BorderLayout.EAST);
		add(new JButton("gris"),BorderLayout.CENTER);
		
		
	}
}