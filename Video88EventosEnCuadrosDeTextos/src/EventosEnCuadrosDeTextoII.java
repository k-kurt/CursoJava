import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosEnCuadrosDeTextoII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEventosII marco2=new MarcoEventosII();
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setVisible(true);
		
	}

}

 class MarcoEventosII extends JFrame{
	 public MarcoEventosII() {
		 setTitle("video 89");
		 setBounds(100, 100, 800, 500);
		 PanelEventosII lamina2= new PanelEventosII();
		
		 //lamina2.setLayout(new BorderLayout());
		 add(lamina2);
		 
	 }
 }
 
 class PanelEventosII extends JPanel{
	 public PanelEventosII() {
		 setLayout(new BorderLayout());
		 
		 JPanel lamina2=new JPanel();
		 lamina2.setLayout(new GridLayout(2,2));
		 
		 panelInterno Guardar=new panelInterno();
		 
		 
		 usuario=new JLabel("Usuario: ");
		 CuadroUsuario=new JTextField(50);
		 contraseña=new JLabel("Contraseña: ");
		 CadroContraseña=new JPasswordField(50);
		 Document contra=CadroContraseña.getDocument();
		 contra.addDocumentListener(Guardar);
		 
		 lamina2.add(usuario);
		 lamina2.add(CuadroUsuario);
		 lamina2.add(contraseña);
		 lamina2.add(CadroContraseña);
		 
		 
		 
		 botonEnviar=new JButton("ENVIAR");
		 add(botonEnviar, BorderLayout.SOUTH);
		 
		 
		 
		 add(lamina2, BorderLayout.NORTH);
	 }
	 
	 
	 
	 private class panelInterno implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] contrasenia;
			contrasenia= CadroContraseña.getPassword();
			
			if(contrasenia.length<8 || contrasenia.length> 12) {
				CadroContraseña.setBackground(Color.RED);
			}else {
				CadroContraseña.setBackground(Color.WHITE);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] contrasenia;
			contrasenia= CadroContraseña.getPassword();
			
			if(contrasenia.length<8 || contrasenia.length> 12) {
				CadroContraseña.setBackground(Color.RED);
			}else {
				CadroContraseña.setBackground(Color.WHITE);
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		 
	 }
		 
	 private JLabel usuario;
	 private JLabel contraseña;
	 private JTextField CuadroUsuario;
	 private JPasswordField CadroContraseña;
	 private JButton botonEnviar;
	 
 }
 
 
 
 
 