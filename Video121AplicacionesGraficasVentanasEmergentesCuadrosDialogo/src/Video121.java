import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		setTitle("Cuadro de diálogos");
		setBounds(500, 300, 400, 250);

		add(new Lamina_Cuadros_Dialogos());

	}
}

class Lamina_Cuadros_Dialogos extends JPanel {

	public Lamina_Cuadros_Dialogos() {

		boton1 = new JButton("Botón 1");
		boton2 = new JButton("Botón 2");
		boton3 = new JButton("Botón 3");
		boton4 = new JButton("Botón 4");

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
				//System.out.println("Has pulsado el botón 1");
				//JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Haz presionado el boton 1");
				JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "prueba 2", "Error", 2);

			} else if (e.getSource() == boton2) {
				//System.out.println("Has pulsado el botón 2");
				JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Ingrese un valor");
				//usando la sobrecarga de constructores podemos cambiar seguramente el aspecto de esta ventana emergente

			} else if (e.getSource() == boton3) {

				System.out.println("Has pulsado el botón 3");
			} else {

				System.out.println("Has pulsado el botón 4");
			}
		}

	} // FIN CLASE Accion_botones

	private JButton boton1, boton2, boton3, boton4;

// FIN clase Lamina_Cuadros_Dialogos

}
