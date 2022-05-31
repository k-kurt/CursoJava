import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.AlignmentAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class video112ProcesadorDeTexto {

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
		setBounds(0, 0, 300, 800);
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

		ButtonGroup grupo = new ButtonGroup();

		JRadioButtonMenuItem t16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem t20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem t24 = new JRadioButtonMenuItem("24");
		JRadioButtonMenuItem t26 = new JRadioButtonMenuItem("26");

		t26.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));

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

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		/*
		 * JToolBar menubar=new JToolBar(); JButton cursivabar=new JButton(new
		 * ImageIcon("C:/Users/genesis/Desktop/Cursos/JAVA/PROCESADOR DE TEXTOS/src/iconos/boton-de-cursiva.gif"
		 * .../PROCESADOR DE TEXTOS/src/iconos/boton-de-cursiva.gif")); JButton
		 * subrabar=new JButton(new ImageIcon("src/subrayada.png")); JButton
		 * negritabar=new JButton(new
		 * ImageIcon("C:/Users/genesis/Desktop/Cursos/JAVA/PROCESADOR DE TEXTOS/src/iconos/texto-en-negrita.gif"
		 * .../PROCESADOR DE TEXTOS/src/iconos/boton-de-cursiva.gif")); JButton
		 * verde=new JButton(new ImageIcon("src/verde.png")); JButton rojo=new
		 * JButton(new ImageIcon("src/rojo.png")); JButton azul=new JButton(new
		 * ImageIcon("src/azul.png")); JButton centrado=new JButton(new
		 * ImageIcon("src/centrado.png")); JButton izquierda=new JButton(new
		 * ImageIcon("src/izquierda.png")); JButton derecha=new JButton(new
		 * ImageIcon("src/derecha.png")); JButton justificado=new JButton(new
		 * ImageIcon("src/justificar.png"));
		 * 
		 * cursivabar.addActionListener(new StyledEditorKit.BoldAction());
		 * negritabar.addActionListener(new StyledEditorKit.ItalicAction());
		 * subrabar.addActionListener(new StyledEditorKit.UnderlineAction());
		 * verde.addActionListener(new StyledEditorKit.ForegroundAction("verde",
		 * Color.GREEN)); rojo.addActionListener(new
		 * StyledEditorKit.ForegroundAction("rojo",Color.RED));
		 * azul.addActionListener(new
		 * StyledEditorKit.ForegroundAction("azul",Color.BLUE));
		 * centrado.addActionListener(new StyledEditorKit.AlignmentAction("centrado",
		 * 1)); izquierda.addActionListener(new
		 * StyledEditorKit.AlignmentAction("izquierda",0));
		 * derecha.addActionListener(new StyledEditorKit.AlignmentAction("derecha",2));
		 * justificado.addActionListener(new
		 * StyledEditorKit.AlignmentAction("justificar",3));
		 * 
		 * 
		 * menubar.add(negritabar); menubar.add(cursivabar); menubar.add(subrabar);
		 * menubar.add(verde); menubar.add(rojo); menubar.add(azul);
		 * menubar.add(centrado); menubar.add(izquierda); menubar.add(derecha);
		 * menubar.add(justificado);
		 */

		menubar=new JToolBar();
		
		
		//como devuelve un boton, podemos ponerlo a la escucha
		configura_barra("../PROCESADOR DE TEXTOS/src/iconos/boton-de-cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configura_barra("../PROCESADOR DE TEXTOS/src/iconos/texto-en-negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
		configura_barra("src/subrayada.png").addActionListener(new StyledEditorKit.UnderlineAction());
		menubar.addSeparator();
		configura_barra("src/verde.png").addActionListener(new StyledEditorKit.ForegroundAction("verde",Color.GREEN));
		configura_barra("src/rojo.png").addActionListener(new StyledEditorKit.ForegroundAction("rojo",Color.RED));
		configura_barra("src/azul.png").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));
		menubar.addSeparator();
		configura_barra("src/centrado.png").addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
		configura_barra("src/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
		configura_barra("src/derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
		configura_barra("src/justificar.png").addActionListener(new StyledEditorKit.AlignmentAction("justificada", 3));
		
		
		menubar.setOrientation(1);

		add(menubar, BorderLayout.WEST);

	}
	
	public JButton configura_barra(String ruta) {
		
		JButton boton=new JButton(new ImageIcon(ruta));
		menubar.add(boton);
		return boton;
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
				itemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				itemMenu.addActionListener(new StyledEditorKit.BoldAction());
			} else if (tipo_estilo == Font.ITALIC) {
				itemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
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
	JButton negitabarra, cusivabarra,subrayadabarra,amarillo,rojo,azul,izquierda,derecha,centrado,justificado;
	JToolBar menubar;
}
