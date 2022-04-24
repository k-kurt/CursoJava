import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class video95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcovideo95 marco=new marcovideo95();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class marcovideo95 extends JFrame{
	public marcovideo95() {
		setTitle("Video 95");
		setBounds(200, 100, 800, 500);
		panelvideo95 lamina=new panelvideo95();
		add(lamina);
	}
}

class panelvideo95 extends JPanel{
	public panelvideo95() {
		setLayout(new BorderLayout());
		texto=new JLabel("texto a modificar...",JLabel.CENTER);
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		add(texto,BorderLayout.CENTER);
		JButton boton=new JButton("hola");
		add(boton,BorderLayout.SOUTH);
		
	}
	private JLabel texto;
	
	
}