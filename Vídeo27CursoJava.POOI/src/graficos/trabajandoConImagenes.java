package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class trabajandoConImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen marco1=new MarcoImagen();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoImagen extends JFrame{
	public MarcoImagen() {
		setTitle("IMAGENES");
		setSize(1000, 800);
		setVisible(true);
		laminaConImagen milamina1= new laminaConImagen();
		add(milamina1);
		//setExtendedState(MAXIMIZED_BOTH);
		//setBounds(100, 100, 500, 600);
	}
}

class laminaConImagen extends JPanel{

public void paintComponent(Graphics g){	
		super.paintComponent(g);

		//File miimagen=new File("C:\\Users\\genesis\\Desktop\\kevin\\Vídeo27CursoJava.POOI\\src\\graficos\\pelotaTenis");
		
		
		
		  try{ imagen=ImageIO.read(new File(
		  "C:/Users/genesis/Desktop/kevin/Vídeo27CursoJava.POOI/src/graficos/pacman.jpg"
		  )); }catch(IOException e) { System.out.println("La imagen no se encontro"); }
		 
		  
		  g.drawImage(imagen,1,1,null);
		 
		//AHORA SI FUNCIONAAAAAAAAAAAA
		
	}
	
	private Image imagen;

	
}
