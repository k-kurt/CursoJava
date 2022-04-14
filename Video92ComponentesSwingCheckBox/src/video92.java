import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class video92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoPrincipal marco=new marcoPrincipal();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marcoPrincipal extends JFrame{
	public marcoPrincipal() {
		setTitle("video 92");
		setBounds(100, 100, 800, 500);
		panelPrincipal lamina=new panelPrincipal();
		add(lamina);
	}
}

class panelPrincipal extends JPanel{
	public panelPrincipal() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("texto al que voy a modificar",JLabel.CENTER);//JLabel.CENTER permite poner el JLabel en el centro
		//si no lo ponemos queda a la izquierda 

		add(texto,BorderLayout.NORTH);
	
		
		JPanel lamina2=new JPanel();
		//lamina2.setLayout(new GridLayout(1,2));
		
		check1 =new JCheckBox("Activar Negrita");
		check2=new JCheckBox("Activar Cursiva");
		
		lamina2.add(check1);
		lamina2.add(check2);
		
		add(lamina2,BorderLayout.SOUTH);
	}
	
	private JLabel texto;
	private JCheckBox check1, check2;
	
	
}