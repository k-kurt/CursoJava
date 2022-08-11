package excepciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IncluyendoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrincipal marco1 = new MarcoPrincipal();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
	}

}

class MarcoPrincipal extends JFrame {
	public MarcoPrincipal() {
		setTitle("video Numero 62");

		// setExtendedState(MAXIMIZED_BOTH);
		setSize(300, 200);
		PrimeraLamina lamina = new PrimeraLamina();
		add(lamina);
	}
}

class PrimeraLamina extends JPanel {
	public PrimeraLamina() {

		try {
			imagen2 = ImageIO.read(new File("../MULTIMEDIA/pelotaTenis1.png"));
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}
	}

	/*
	 * 
	 * 
	 * public PrimeraLamina() { try { imagen2 = ImageIO.read(new
	 * File("src\\	\\pelotaTenis.png")); } catch (IOException e) { // TODO: handle
	 * exception System.out.println("Imagen no encontrada"); }
	 */

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (imagen2 == null) {
			g.drawString("No se pudo cargar la imagen", 10, 10);
		} else {
			int alturaImagen = imagen2.getHeight(this);
			int anchuraImagen = imagen2.getWidth(this);

			g.drawImage(imagen2, 0, 0, null);

			for (int i = 0; i < 300; i++) {
				for (int j = 0; j < 200; j++) {

					if (i + j > 0) {
						g.copyArea(0, 0, 360, 360, anchuraImagen * i, alturaImagen * j);
					}
				}
			}

		}
	}

	public Image imagen2;
}
