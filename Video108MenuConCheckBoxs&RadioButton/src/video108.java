import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class video108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoMenu menu = new marcoMenu();
		menu.setVisible(true);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoMenu extends JFrame {

	public marcoMenu() {
		setTitle("Video 108, añadiendo checkboxs y radioButtons al editor de texto");
		setBounds(200, 100, 1000, 500);
		panelMenu lamina = new panelMenu();
		add(lamina);

	}
}

class panelMenu extends JPanel {
	public panelMenu() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();

		menu = new JMenuBar();
		fuente = new JMenu("Fuentes");
		menu.add(fuente);
		estilo = new JMenu("Estilos");
		menu.add(estilo);
		tamanio = new JMenu("Tamaños");
		menu.add(tamanio);

		// -----------------------------------------------------------------------------------------------------------
		creacion_items("fuente", "Arial", "Arial", 9, 12);
		creacion_items("fuente", "Courier", "Courier", 9, 12);
		creacion_items("fuente", "Verdana", "Verdana", 9, 12);

		// -----------------------------------------------------------------------------------------------------------

		creacion_items("estilo", "Negrita", "Bold", Font.BOLD, 12);
		creacion_items("estilo", "Cursiva", "", Font.ITALIC, 12);
		/*
		 * JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita",new
		 * ImageIcon("D:/Cursos Udemy/Java/CursoJava/PROCESADOR DE TEXTOS/src/iconos/texto-en-negrita.gif"
		 * )); JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva",new
		 * ImageIcon("D:/Cursos Udemy/Java/CursoJava/PROCESADOR DE TEXTOS/src/iconos/boton-de-cursiva.gif"
		 * ));
		 * 
		 * negrita.addActionListener(new StyledEditorKit.BoldAction());
		 * cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		 * 
		 * estilo.add(negrita); estilo.add(cursiva);
		 */

		// -----------------------------------------------------------------------------------------------------------

		/*
		 * creacion_items("tamanio", "16", "Italic", 9, 12); creacion_items("tamanio",
		 * "20", "", 9, 20); creacion_items("tamanio", "24", "", 9, 24);
		 * creacion_items("tamanio", "26", "", 9, 26);
		 */

		ButtonGroup grupo = new ButtonGroup();

		JRadioButtonMenuItem t16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem t20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem t24 = new JRadioButtonMenuItem("24");
		JRadioButtonMenuItem t26 = new JRadioButtonMenuItem("26");

		grupo.add(t16);
		grupo.add(t20);
		grupo.add(t24);
		grupo.add(t26);

		t16.addActionListener(new StyledEditorKit.FontSizeAction("event", 16));
		t20.addActionListener(new StyledEditorKit.FontSizeAction("event", 20));
		t24.addActionListener(new StyledEditorKit.FontSizeAction("event", 24));
		t26.addActionListener(new StyledEditorKit.FontSizeAction("event", 26));

		tamanio.add(t16);
		tamanio.add(t20);
		tamanio.add(t24);
		tamanio.add(t26);

		// -----------------------------------------------------------------------------------------------------------

		laminaMenu.add(menu);
		add(laminaMenu, BorderLayout.NORTH);
		laminaTexto = new JTextPane();
		add(laminaTexto, BorderLayout.CENTER);

		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");

		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		emergente.add(negritaE);
		emergente.add(cursivaE);

		laminaTexto.setComponentPopupMenu(emergente);

	}

	public void creacion_items(String menu_pertenece, String nom_item, String tipo_fuente, int tipo_estilo,
			int tamanio_letra) {
		JMenuItem itemMenu = new JMenuItem(nom_item);
		if (menu_pertenece == "fuente") {
			fuente.add(itemMenu);
			if (tipo_fuente == "Arial") {
				itemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("event", "Arial"));
			} else if (tipo_fuente == "Courier") {
				itemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("event", "Courier"));
			} else if (tipo_fuente == "Verdana") {
				itemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("event", "Verdana"));
			}
		} else if (menu_pertenece == "estilo") {
			estilo.add(itemMenu);
			if (tipo_estilo == Font.BOLD) {
				itemMenu.addActionListener(new StyledEditorKit.BoldAction());
			} else if (tipo_estilo == Font.ITALIC) {
				itemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		} else if (menu_pertenece == "tamanio") {
			tamanio.add(itemMenu);
			itemMenu.addActionListener(new StyledEditorKit.FontSizeAction("event", tamanio_letra));
		}
	}

	JMenu fuente, estilo, tamanio;
	JMenuBar menu;
	Font letra;
	JTextPane laminaTexto;
}
