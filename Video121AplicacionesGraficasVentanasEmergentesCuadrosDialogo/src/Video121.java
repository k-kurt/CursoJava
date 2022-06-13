import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Video121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadros_Dialogos mimarco = new Cuadros_Dialogos();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class Cuadros_Dialogos extends JFrame {

	public Cuadros_Dialogos() {
		setTitle("Cuadro de di�logos");
		setBounds(500, 300, 400, 250);

		add(new Lamina_Cuadros_Dialogos());

	}
}

class Lamina_Cuadros_Dialogos extends JPanel {

	public Lamina_Cuadros_Dialogos() {

		boton1 = new JButton("Bot�n 1");
		boton2 = new JButton("Bot�n 2");
		boton3 = new JButton("Bot�n 3");
		boton4 = new JButton("Bot�n 4");

		boton1.addActionListener(new Accion_botones());
		boton2.addActionListener(new Accion_botones());
		boton3.addActionListener(new Accion_botones());
		boton4.addActionListener(new Accion_botones());

		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);

	} // Fin constructor

	private class Accion_botones implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == boton1) {
				System.out.println("Has pulsado el bot�n 1");

			} else if (e.getSource() == boton2) {
				System.out.println("Has pulsado el bot�n 2");

			} else if (e.getSource() == boton3) {

				System.out.println("Has pulsado el bot�n 3");
			} else {

				System.out.println("Has pulsado el bot�n 4");
			}
		}

	} // FIN CLASE Accion_botones

	private JButton boton1, boton2, boton3, boton4;

// FIN clase Lamina_Cuadros_Dialogos

}
