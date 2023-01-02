package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class marcosConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoGeneral marco1=new MarcoGeneral();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoGeneral extends JFrame{
	public MarcoGeneral() {
		setSize(300, 500);
		setVisible(true);
		setTitle("Probando Fuentes");
		LaLamina miLamina= new LaLamina();
		add(miLamina);
		/*
		 * Toolkit miPantalla= Toolkit.getDefaultToolkit(); Dimension DimensionPantalla=
		 * miPantalla.getScreenSize(); setMaximumSize(DimensionPantalla);
		 */
		setExtendedState(Frame.MAXIMIZED_BOTH);//este hace maximizar la pantalla.
		miLamina.setForeground(Color.GREEN);

	}
	
}

class LaLamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		Font miFuente=new Font("Arial",Font.ITALIC,26);
		g2.setFont(miFuente);
		//g2.setColor(Color.BLUE);
		g2.drawString("hola soy kevin,lpm", 100, 100);
		g2.setFont(new Font("Courier",Font.CENTER_BASELINE,30));
		//g2.setColor(Color.magenta);
		g2.drawString("Curso de Java",180,200);
	}
	
}