package graficos;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
	import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

public class pruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primerMarco marco1= new primerMarco();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}


class primerMarco extends JFrame{
	public primerMarco(){
		setTitle("Vamos a dibujar");
		setSize(1000, 800);
		setVisible(true);
		miPanel mipanel1= new miPanel();
		add(mipanel1);
		
		
	}
	
	
	
	}


class miPanel extends JPanel{


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
	  
	  Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);//los dos primero es posicion y los dos ultimos es medidas
	  
	  g2.draw(rectangulo); Ellipse2D elipse=new Ellipse2D.Double();
	  elipse.setFrame(rectangulo);//utilizamos el metodo que nos permite usar el rectangulo que ya habiamos creados g2.draw(elipse);//esto lo dibuja, lo hace visible
	  
	  g2.draw(new Line2D.Double(100, 100, 300, 250));
	  
	  double centroenX= rectangulo.getCenterX(); double centroenY=
	  rectangulo.getCenterY(); double radio= 150;
	  
	  Ellipse2D circulo =new Ellipse2D.Double();
	  circulo.setFrameFromCenter(centroenX, centroenY, centroenY+radio,
	  centroenX+radio); g2.draw(circulo);
	 
	
	/*try{
		imagen=ImageIO.read(new File("C:/Users/genesis/Desktop/kevin/Vídeo27CursoJava.POOI/src/graficos/pacman.jpg"));
	}catch(IOException e) {
		System.out.println("La imagen no se encontro");
	}
	
	g.drawImage(imagen,1,1,null);
	
	
}


private Image imagen;

*SI FUNCIONA LA IMAGEN ACA
*/

	
}

/*
 * QUEDAMOS EN EL VIDEO 61
 */
}
