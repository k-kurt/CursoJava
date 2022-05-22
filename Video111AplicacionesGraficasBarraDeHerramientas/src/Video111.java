import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Video111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElmarcoPrincipal marcos=new ElmarcoPrincipal();
		marcos.setVisible(true);
		marcos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class ElmarcoPrincipal extends JFrame{
	public ElmarcoPrincipal() {
		setTitle("video 111");
		setBounds(100, 100, 800, 400);
		 lamina=new JPanel();
		add(lamina);

		Action accionAmarilla= new AccionColor("amarilla",new ImageIcon("../Video65CursoJava.Eventos/src/bola_amarilla.jpg"), Color.YELLOW);
		Action accionRojo= new AccionColor("rojo",new ImageIcon("../Video65CursoJava.Eventos/src/bola_roja.jpg"), Color.RED);
		Action accionVerde= new AccionColor("verde",new ImageIcon("../Video65CursoJava.Eventos/src/bola_verde.jpg"), Color.GREEN);
		Action accionSalir=new AbstractAction("Salir",new ImageIcon("src/cerrar-sesion.png")) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		};
		JMenu menu=new JMenu("Color");
		menu.add(accionVerde);
		menu.add(accionRojo);
		menu.add(accionAmarilla);
		JMenuBar barra=new JMenuBar();
		barra.add(menu);
		setJMenuBar(barra);
		//construccion de la barra de herramientas 
		JToolBar mi_barra=new JToolBar();
		mi_barra.add(accionVerde);
		mi_barra.add(accionRojo);
		mi_barra.add(accionAmarilla);
		mi_barra.addSeparator();
		mi_barra.add(accionSalir);
		add(mi_barra,BorderLayout.NORTH);
		
	}
	
	private class AccionColor extends AbstractAction{
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color: "+ nombre);
			putValue("color_de_fondo", color_boton);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color)getValue("color_de_fondo");
			lamina.setBackground(c);
		}
		
	}
	
	JPanel lamina;
	
}


