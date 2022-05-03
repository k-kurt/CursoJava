import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class video101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoGeneral marco=new marcoGeneral();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoGeneral extends JFrame{
	public marcoGeneral() {
		setTitle("Procesador de textos rudimentario");
		setBounds(200, 100, 1000, 500);
		panelPrincipal lamina=new panelPrincipal();
		add(lamina);
	}
}

class panelPrincipal extends JPanel{
	public panelPrincipal() {
		setLayout(new BorderLayout());
		
		
		
		JPanel lamina2=new JPanel();
		//-------------------------------------------------------------
		menu=new JMenuBar();
		fuente=new JMenuItem("Fuentes");
		estilo=new JMenuItem("Estilos");
		tamanio=new JMenuItem("Tamaño");
		//-------------------------------------------------------------
		
		
		menu.add(fuente);
		menu.add(estilo);
		menu.add(tamanio);
		lamina2.add(menu);
		add(lamina2,BorderLayout.NORTH);
		
	}
	
	private JMenuBar menu;
	private JMenuItem fuente,estilo,tamanio,arial,courier,verdana;
	
}