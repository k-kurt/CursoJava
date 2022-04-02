import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class video86ParteII {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			marcoCuadroTextoII marco2=new marcoCuadroTextoII();
			marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			marco2.setVisible(true);
		}

	}

	class marcoCuadroTextoII extends JFrame{
		public marcoCuadroTextoII() {
			setTitle("video 86");
			setBounds(50, 50, 800, 500);
			LaminaCuadroTextoII lamina2=new LaminaCuadroTextoII();
			add(lamina2);
			
		}
	}

	class LaminaCuadroTextoII extends JPanel{
		public LaminaCuadroTextoII() {
			setLayout(new BorderLayout());
			JPanel laminaII=new JPanel();
			laminaII.setLayout(new FlowLayout());
			cuadro=new JTextField(25);
			laminaII.add(cuadro);
			//System.out.println(cuadro.getText().trim());//quita espacio innecesarios
			add(mensaje,BorderLayout.CENTER);
			boton=new JButton("comprobar");
			laminaII.add(boton);
			validadEmail email=new validadEmail();
			boton.addActionListener(email);//ponemos al boton a la escucha del evento click
			
			
			mensaje=new JLabel("el email es...");
			JLabel text=new JLabel("Ingrese el email");
			laminaII.add(text);
			add(laminaII,BorderLayout.NORTH);
			
			
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