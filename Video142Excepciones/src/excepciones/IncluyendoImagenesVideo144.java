package excepciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IncluyendoImagenesVideo144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrincipal144 marco1 = new MarcoPrincipal144();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
	}

}

class MarcoPrincipal144 extends JFrame {
	public MarcoPrincipal144() {
		setTitle("video Numero 144");

		// setExtendedState(MAXIMIZED_BOTH);
		setSize(300, 200);
		PrimeraLamina144 lamina = new PrimeraLamina144();
		add(lamina);
	}
}

class PrimeraLamina144 extends JPanel {
	public PrimeraLamina144() {

		try {
			imagen2 = ImageIO.read(new File("../MULTIMEDIA/pelotaTenis1.png"));//borrar el 1
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}
	}

	
	//NO ESTA CONSIDERADO BUENA PRACTICA HACER ESTO, ES MEJOR FORMA HACERLO DE LA FORMA ANTERIOR
	

	public void paintComponent(Graphics g) throws NullPointerException{
		super.paintComponent(g);

		try {
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
		}catch(NullPointerException e) {
			g.drawString("No se pudo cargar la imagen", 10, 10);
		}
		
	}

	public Image imagen2;
}
