
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebasEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones marco = new MarcoBotones();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones lamina = new LaminaBotones();
		add(lamina);
	}
}

class LaminaBotones extends JPanel implements ActionListener {

	JButton BotonAzul = new JButton("azul");
	JButton BotonAmarillo = new JButton("amarillo");
	JButton BotonRojo = new JButton("rojo");

	public LaminaBotones() {
		add(BotonAzul);
		add(BotonAmarillo);
		add(BotonRojo);
		BotonAzul.addActionListener(this);
		BotonAmarillo.addActionListener(this);
		BotonRojo.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object BotonPulsado = e.getSource();
		if (BotonPulsado == BotonAzul) {
			setBackground(Color.BLUE);
		} else if (BotonPulsado == BotonAmarillo) {
			setBackground(Color.YELLOW);
		} else {
			setBackground(Color.RED);
		}
	}
}