package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		creandoMarco mimarco1=new creandoMarco();
		
		mimarco1.setVisible(true);
		
		mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}


class creandoMarco extends JFrame{
	
	public creandoMarco() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamaniopantalla= mipantalla.getScreenSize();
		
		int alturaPantalla = tamaniopantalla.height;
		int anchoPantalla= tamaniopantalla.width;
		
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("micuadrito");
		
		
		/*
		 * se cambia el icono de la ventana con estos dos, hay que tener cuidado con la extension
		 */		
		Image miicono= mipantalla.getImage("src/graficos/icono.gif");
		
		setIconImage(miicono);
		
	}
	
}
