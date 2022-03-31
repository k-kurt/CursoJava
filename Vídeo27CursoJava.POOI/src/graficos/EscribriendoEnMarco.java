package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribriendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto marco1 = new MarcoConTexto();

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

		// setSize(500, 500);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanioPantalla = miPantalla.getScreenSize();

		int anchoPantalla = tamanioPantalla.width;

		int alturaPantalla = tamanioPantalla.height;

		setSize(anchoPantalla / 2, alturaPantalla / 2);

		setLocation(anchoPantalla / 4, alturaPantalla / 4);

		setTitle("Primer texto");

		setVisible(true);
		
		Panel mipanel= new Panel();
		
		add(mipanel);
		
		

	}

}



class Panel extends JPanel{
	
	protected void paintComponent(Graphics g) {
		
	super.paintComponent(g);//hay que invocar lo que metodo hace y ademas  sobreescribir para que muestre lo nuestro 	
	g.drawString("este es el mensaje", 100, 100);//toma como referencia el contenedor padre que en este caso es el primer cuadro que creamos
	
		
		
	}
	
	
	
}