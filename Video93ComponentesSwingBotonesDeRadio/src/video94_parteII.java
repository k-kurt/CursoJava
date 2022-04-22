import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class video94_parteII {

 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoParte2 marco=new marcoParte2();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}

class marcoParte2 extends JFrame{
	
	public marcoParte2() {
		setTitle("Video 94 Parte 2");
		setBounds(100, 100, 800, 500);
		panelParte2 lamina=new panelParte2();
		add(lamina);
	}
	
}



class panelParte2 extends JPanel{
	public panelParte2() {
				
		setLayout(new BorderLayout());
		texto=new JLabel("Texto que quiero modificar",JLabel.CENTER);
		texto.setFont(new Font("Serif",Font.PLAIN,14));
		add(texto,BorderLayout.CENTER);
		
		
	}
	
	public void colocarBotones(String nombre, boolean seleccionado,int tamanio) {
		
		
	}
	
	private JLabel texto;
	private JRadioButton boton1,boton2,boton3,boton4;
}

