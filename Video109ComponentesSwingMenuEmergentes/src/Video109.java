import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class Video109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoMenu marco=new marcoMenu();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoMenu extends JFrame{
	public marcoMenu() {
		setTitle("Video 109, Menus Emergentes");
		setBounds(200,100,800,500);
		panelMenu lamina=new panelMenu();
		add(lamina);
	}
}

class panelMenu extends JPanel{
	public panelMenu() {
		setLayout(new BorderLayout());
		JPanel lamina2=new JPanel();
		
		JMenuBar menubar=new JMenuBar();
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamanio=new JMenu("Tamaño");
		menubar.add(fuente);
		menubar.add(estilo);
		menubar.add(tamanio);
		
		
		lamina2.add(menubar);
		add(lamina2,BorderLayout.NORTH);
		
		JTextPane texto=new JTextPane();
		add(texto,BorderLayout.CENTER);
		
		
		JPopupMenu emergente=new JPopupMenu();
		JMenuItem menu=new JMenuItem("opcion 1");
		JMenuItem menu2=new JMenuItem("opcion 2");
		JMenuItem menu3=new JMenuItem("opcion 3");
		
		emergente.add(menu);
		emergente.add(menu2);
		emergente.add(menu3);
		texto.setComponentPopupMenu(emergente);//elegimos la lamina como objeto sobre cual actua el menu emergente
		
	}
}