import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class video108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoMenu menu=new marcoMenu();
		menu.setVisible(true);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoMenu extends JFrame{
	
	public marcoMenu() {
		setTitle("Video 108, añadiendo checkboxs y radioButtons al editor de texto");
		setBounds(200, 100, 1000, 500);
		panelMenu lamina=new panelMenu();
		add(lamina);
		
	}
}
class panelMenu extends JPanel{
	public panelMenu() {
		JPanel laminaMenu=new JPanel();
		laminaMenu.setLayout(new BorderLayout());
		menu=new JMenuBar();
		fuente=new JMenu("Fuentes");
		menu.add(fuente);
		estilo=new JMenu("Estilos");
		menu.add(estilo);
		tamanio=new JMenu("Tamaños");
		menu.add(tamanio);
		
		laminaMenu.add(menu);
		add(laminaMenu,BorderLayout.NORTH);
	}
	public void creacion_items() {
		
	}
	 
	JMenu fuente,estilo,tamanio;
	JMenuBar menu;
	Font letra;
	
}
