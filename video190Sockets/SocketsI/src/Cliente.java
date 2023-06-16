
import java.awt.event.*;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("CLIENTE");
		
		add(texto);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");

		//importante, esto va antes de agregar el boton
		EnviaTexto enviarTexto=new EnviaTexto();

		miboton.addActionListener(enviarTexto);
		
		add(miboton);	
		
	}
	
	
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(campo1.getText());
				try {Socket miSoclet= new Socket("192.168.1.3",9999);
			
		} catch (UnknownHostException e1) {

			// TODO: handle exception
			e1.getStackTrace();
			
		
		} catch (IOException e1) {
			// TODO: handle exception
			System.out.println(e1.getMessage());
		}


		}
		
	
		


	}
		
		
	private JTextField campo1;
	
	private JButton miboton;
	
}