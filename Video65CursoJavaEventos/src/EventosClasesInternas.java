import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosClasesInternas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConBotones marco=new MarcoConBotones();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}


class MarcoConBotones extends JFrame{
	public MarcoConBotones() {
		setTitle("segunda forma de hacerlo");
		setVisible(true);
		setBounds(50, 50, 800, 500);
		LaminaConBotones lamina=new LaminaConBotones();
		add(lamina);
	}
}

class LaminaConBotones extends JPanel{

	JButton botonAzul =new JButton("azul");
	JButton botonVerde =new JButton("verde");
	JButton botonRojo =new JButton("rojo");
	
	public LaminaConBotones() {
		add(botonAzul);
		add(botonVerde);
		add(botonRojo);
		
		colorFondo azul=new colorFondo(Color.BLUE);
		colorFondo verde=new colorFondo(Color.GREEN);
		colorFondo rojo=new colorFondo(Color.RED);
		
		
		botonAzul.addActionListener(azul);
		botonVerde.addActionListener(verde);
		botonRojo.addActionListener(rojo);
		
	}

private class colorFondo implements ActionListener{

	public colorFondo(Color c) {
		colordeFondo = c;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		setBackground(colordeFondo);
		
	}
	
	private Color colordeFondo;
}

}




