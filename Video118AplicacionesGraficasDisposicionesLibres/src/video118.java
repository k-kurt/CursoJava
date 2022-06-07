import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class video118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPrincipal marco=new MarcoPrincipal();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrincipal extends JFrame{
	public MarcoPrincipal() {
		setTitle("Video 118 DIsposiciones Lbres I");
		setBounds(200, 200, 800, 500);
		PanelPrincipal lamina=new PanelPrincipal();
		add(lamina);
		
	}
}

class PanelPrincipal extends JPanel{
	public PanelPrincipal() {
		
		setLayout(null);
		
		Label labNombre =new Label("Nombre:");
		Label labApellido =new Label("Apellido:");
		JTextField txtnombre=new JTextField();
		JTextField txtapellido=new JTextField();
		
		labNombre.setBounds(50, 50, 100, 50);
		labApellido.setBounds(50, 100, 100, 50);
		txtnombre.setBounds(150, 60, 150, 30);
		txtapellido.setBounds(150, 110,150, 30);
		
		add(labNombre);
		add(labApellido);
		add(txtnombre);
		add(txtapellido);
		
		/*
		 * setLayout(null);//para una disposicion libre JButton boton1=new
		 * JButton("Boton 1"); JButton boton2 =new JButton("boton 2");
		 * boton1.setBounds(600, 400, 150, 50);//solo funciona el setBound en el
		 * layout(null) boton2.setBounds(600, 20, 150, 50); add(boton1); add(boton2);
		 */
	}
}
