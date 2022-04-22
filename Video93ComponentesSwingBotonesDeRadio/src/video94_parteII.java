import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
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
		migrupo=new ButtonGroup();
		lamina2=new JPanel();
		add(lamina2,BorderLayout.SOUTH);
		colocarBotones("pequeña",false,12);
		colocarBotones("mediano",true,16);
		colocarBotones("grande",false,20);
		colocarBotones("muy grande",false,28);
		
	}
	
	public void colocarBotones(String nombre, boolean seleccionado,final int tamanio) {
		
		JRadioButton boton=new JRadioButton(nombre,seleccionado);
		
		migrupo.add(boton);
		lamina2.add(boton);
		ActionListener mievento=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif",Font.PLAIN,tamanio));
				
			}
			
		};
		boton.addActionListener(mievento);
	}
	private ButtonGroup migrupo;
	private JLabel texto;
	
	JPanel lamina2 =new JPanel();
}


