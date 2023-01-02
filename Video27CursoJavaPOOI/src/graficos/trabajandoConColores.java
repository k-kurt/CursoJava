package graficos;
import javax.swing.*;
import java.awt.*;
	import java.awt.geom.*;

public class trabajandoConColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoConColor elmarco= new marcoConColor();
		
		elmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		elmarco.setVisible(true);
		
	}

}


class marcoConColor extends JFrame{
	public marcoConColor() {
		setTitle("prueba de colores");
		setSize(1000, 800);
		PanelConColor lamina1= new PanelConColor();
		add(lamina1);
		lamina1.setBackground(Color.PINK);
		lamina1.setBackground(SystemColor.window);
	}
	
	
	
	}


class PanelConColor extends JPanel{


protected void paintComponent(Graphics g) {
	
	super.paintComponents(g);
	
	/*
	 * g.drawString("HOLA SOY KEVIN", 50, 50);
	 * 
	 * g.drawRect(50, 100, 200, 200);
	 * 
	 * g.drawLine(50, 310, 250, 410);
	 * 
	 * g.drawArc(300, 50, 100, 250, 120, 160);
	 */
	
		
	Graphics2D g2 = (Graphics2D) g;
	//rectangulo
	Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);//los dos primero es posicion y los dos ultimos es medidas
	g2.setPaint(Color.RED);
	g2.fill(rectangulo);
	
	//elipse
	Ellipse2D elipse=new Ellipse2D.Double();
	elipse.setFrame(rectangulo);//utilizamos el metodo que nos permite usar el rectangulo que ya habiamos creados
	//g2.setPaint(Color.BLACK);
	//Color miColor=new Color(230,34,200);
	//g2.setPaint(miColor);
	g2.setPaint(new Color(0,230,24).brighter());//darkker());
	g2.fill(elipse);//esto lo dibuja, lo hace visible
	
	
	g2.draw(new Line2D.Double(100, 100, 300, 250));
	
	double centroenX= rectangulo.getCenterX();
	double centroenY= rectangulo.getCenterY();
	double radio= 150;
	

}


/*
 * QUEDAMOS EN EL VIDEO 61
 */
}
