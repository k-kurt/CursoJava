import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos_multiplesOyentes_video80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcodeLamina marco=new MarcodeLamina();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}



class MarcodeLamina extends JFrame{
	public MarcodeLamina() {
		setTitle("video 80");
		setBounds(100,100,800,500);
		add(new LaminadeEventos());
		
	}
}

class LaminadeEventos extends JPanel{
	public LaminadeEventos() {
		JButton boton_nuevo= new JButton("Nuevo");
	
	 boton_cerrar= new JButton("Cerrar");
	add(boton_nuevo);
	add(boton_cerrar);
	
	OyenteNuevo miOyente= new OyenteNuevo();
	boton_nuevo.addActionListener(miOyente);
	

	}
	
	JButton boton_cerrar;
	
	
	class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MarcoEmergente marco1= new MarcoEmergente(boton_cerrar);
			marco1.setVisible(true);
			
		}
		
		
		
	}
	
		
	}

class MarcoEmergente extends JFrame{

	public MarcoEmergente(JButton boton_de_principal) {
	
		contador++;
		setTitle("Ventana "+ contador);
		setBounds(40*contador, 40*contador, 300, 150);
		OyenteCerrar oeyentecerrar= new OyenteCerrar();
		boton_de_principal.addActionListener(oeyentecerrar);
		
	
	
	}
	
	private class OyenteCerrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}
		
	}
	
	
	private static int contador=0;
}

