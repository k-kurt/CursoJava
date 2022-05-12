import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

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
		setLayout(new BorderLayout());
		JPanel laminaMenu=new JPanel();
		
		menu=new JMenuBar();
		fuente=new JMenu("Fuentes");
		menu.add(fuente);
		estilo=new JMenu("Estilos");
		menu.add(estilo);
		tamanio=new JMenu("Tamaños");
		menu.add(tamanio);
		
		//-----------------------------------------------------------------------------------------------------------
		creacion_items("fuente", "Arial", "Arial", 9, 12);
		creacion_items("fuente", "Courier", "Courier", 9, 12);
		creacion_items("fuente", "Verdana", "Verdana", 9, 12);
		
		
		creacion_items("estilo", "Negrita", "Bold", Font.BOLD, 12);
		creacion_items("estilo", "Cursiva", "", Font.ITALIC, 12);
		
		
		creacion_items("tamanio", "16", "Italic", 9, 12);
		creacion_items("tamanio", "20", "", 9, 20);
		creacion_items("tamanio", "24", "", 9, 24);
		creacion_items("tamanio", "26", "", 9, 26);
		
		laminaMenu.add(menu);
		add(laminaMenu,BorderLayout.NORTH);
		 laminaTexto=new JTextPane();
		add(laminaTexto,BorderLayout.CENTER);
	}
	public void creacion_items(String menu_pertenece,String nom_item,String tipo_fuente,int tipo_estilo,int tamanio_letra) {
		JMenuItem itemMenu=new JMenuItem(nom_item);
		if(menu_pertenece=="fuente") {
			fuente.add(itemMenu);
			if(tipo_fuente=="Arial") {
				itemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("event","Arial"));
			}else if(tipo_fuente=="Courier") {
				itemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("event", "Courier"));
			}else if(tipo_fuente=="Verdana") {
				itemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("event","Verdana"));
			}
		}else if(menu_pertenece=="estilo") {
			estilo.add(itemMenu);
		}else if(menu_pertenece=="tamanio") {
			tamanio.add(itemMenu);
		}
	}
	 
	JMenu fuente,estilo,tamanio;
	JMenuBar menu;
	Font letra;
	JTextPane laminaTexto;
}
