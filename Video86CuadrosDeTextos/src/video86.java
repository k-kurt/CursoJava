import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class video86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoCuadroTexto marco=new marcoCuadroTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class marcoCuadroTexto extends JFrame{
	public marcoCuadroTexto() {
		setTitle("video 86");
		setBounds(50, 50, 800, 500);
		LaminaCuadroTextoII lamina=new LaminaCuadroTextoII();
		add(lamina);
		
	}
}

class LaminaCuadroTexto extends JPanel{
	public LaminaCuadroTexto() {
		mensaje=new JLabel("el email es...");
		JLabel text=new JLabel("Ingrese el email");
		add(text);
		cuadro=new JTextField(25);
		add(cuadro);
		//System.out.println(cuadro.getText().trim());//quita espacio innecesarios
		add(mensaje);
		boton=new JButton("comprobar");
		add(boton);
		validadEmail email=new validadEmail();
		boton.addActionListener(email);//ponemos al boton a la escucha del evento click
		
		
		
	}
	private JLabel mensaje;
	private JTextField cuadro;
	private JButton boton;

	private class validadEmail implements ActionListener{
		public validadEmail() {
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			
			int correcto=0;
			String email=cuadro.getText().trim();
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					correcto++;
				}
			}
			
			if(correcto!=1) {
				
			mensaje.setText("email Incorrecto");
			
				
			}else { 
				mensaje.setText("email Correcto");
			}
			
			//System.out.println(cuadro.getText().trim());//toma lo que hay en cuadro de texto
			
			
		}
		
	}
	

	
	
}