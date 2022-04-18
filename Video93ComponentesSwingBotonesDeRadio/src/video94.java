import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class video94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoVideo94 marco=new marcoVideo94();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marcoVideo94 extends JFrame{
	public marcoVideo94() {
		setTitle("Video 94");
		setBounds(100, 100, 800, 500);
		Panel94 lamina94=new Panel94();
		add(lamina94);
		
	}
	
}

class Panel94 extends JPanel{
	public Panel94() {
		setLayout(new BorderLayout());
		
		JPanel lamina1=new JPanel();
		lamina1.setLayout(new BorderLayout());
		texto1=new JLabel("Este texto va a ser modificado",JLabel.CENTER);
		lamina1.add(texto1);
		
		add(lamina1,BorderLayout.CENTER);
		
		JPanel lamina2=new JPanel();
		lamina2.setLayout(new BorderLayout());
		
		
		
	}
	
	private JLabel texto1;
	private JRadioButton boton1,boton2,boton3,boton4;
	
}