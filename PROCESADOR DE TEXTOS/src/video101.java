import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class video101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoGeneral marco = new marcoGeneral();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoGeneral extends JFrame {
	public marcoGeneral() {
		setTitle("Procesador de textos rudimentario");
		setBounds(200, 100, 1000, 500);
		panelPrincipal lamina = new panelPrincipal();
		add(lamina);
	}
}

class panelPrincipal extends JPanel {
	public panelPrincipal() {
		setLayout(new BorderLayout());
		JPanel lamina2 = new JPanel();
		// eventos loseventos=new eventos();
		// -------------------------------------------------------------
		menu = new JMenuBar();
		fuente = new JMenu("Fuentes");
		estilo = new JMenu("Estilos");
		tamanio = new JMenu("Tamaño");
		// -------------------------------------------------------------

		configura_menu("Arial", "fuente", "Arial", 9, 10);
		configura_menu("Courier", "fuente", "Courier", 9, 10);
		configura_menu("Verdana", "fuente", "Verdana",9, 10);
		// -------------------------------------------------------------

		configura_menu("Negrita", "estilo", "", Font.BOLD, 1);
		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);

		// -------------------------------------------------------------
		configura_menu("16", "tamanio", "", 9, 16);
		configura_menu("20", "tamanio", "", 9, 20);
		configura_menu("24", "tamanio", "", 9, 24);
		configura_menu("26", "tamanio", "", 9, 26);

		menu.add(fuente);
		menu.add(estilo);
		menu.add(tamanio);
		lamina2.add(menu);
		add(lamina2, BorderLayout.NORTH);
		laminaTexto = new JTextPane();
		add(laminaTexto, BorderLayout.CENTER);
	}

	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {

		JMenuItem elemMenu = new JMenuItem(rotulo);
		if (menu == "fuente") {
			fuente.add(elemMenu);
		} else if (menu == "estilo") {
			estilo.add(elemMenu);
		} else if (menu == "tamanio") {
			tamanio.add(elemMenu);
		}

		elemMenu.addActionListener(new gestionaEventos(rotulo, tipo_letra, estilos, tam));
		
	}

	private class gestionaEventos implements ActionListener {

		String tipo_texto, menu;
		int estilo_letra, tamanio_letra;

		gestionaEventos(String elemento, String texto2, int estilo2, int tam_letra) {
			tipo_texto = texto2;
			menu = elemento;
			estilo_letra = estilo2;
			tamanio_letra = tam_letra;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			laminaTexto.setFont(new Font(tipo_texto,estilo_letra,tamanio_letra));
			
		}

	}

	JTextPane laminaTexto;
	JMenuBar menu;
	// JMenuItem arial,courier,verdana,negrita,cursiva,t12,t16,t20,t24;
	JMenu fuente, estilo, tamanio;
	Font letras;
}

/*
 * 
 * fuente.add(arial=new JMenuItem("Arial")); arial.addActionListener(new
 * ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
 * method stub laminaTexto.setFont(new Font("Arial",Font.PLAIN,12)); } });
 * fuente.add(courier=new JMenuItem("Courier"));
 * //courier.addActionListener(losevento); //USANDO CLASES ANONIMAS
 * 
 * courier.addActionListener(new ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) {
 * laminaTexto.setFont(new Font("Courier",Font.PLAIN,12)); } });
 * 
 * fuente.add(verdana=new JMenuItem("Verdana")); verdana.addActionListener(new
 * ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
 * method stub laminaTexto.setFont(new Font("Verdana",Font.PLAIN,12)); } });
 * //-------------------------------------------------------------
 * estilo.add(negrita=new JMenuItem("Negrita")); estilo.add(cursiva=new
 * JMenuItem("Cursiva"));
 * //-------------------------------------------------------------
 * tamanio.add(t12 =new JMenuItem("12")); tamanio.add(t16=new JMenuItem("16"));
 * tamanio.add(t20=new JMenuItem("20")); tamanio.add(t24=new JMenuItem("24"));
 * //-------------------------------------------------------------
 * menu.add(fuente); menu.add(estilo); menu.add(tamanio); lamina2.add(menu);
 * add(lamina2,BorderLayout.NORTH); laminaTexto=new JTextPane();
 * add(laminaTexto,BorderLayout.CENTER); }
 * 
 * 
 * 
 * JTextPane laminaTexto; JMenuBar menu; JMenuItem
 * arial,courier,verdana,negrita,cursiva,t12,t16,t20,t24; JMenu
 * fuente,estilo,tamanio;
 * 
 * }
 * 
 */
