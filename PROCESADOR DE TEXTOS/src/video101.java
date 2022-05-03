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
		eventos loseventos=new eventos();
		//-------------------------------------------------------------
		menu=new JMenuBar();
		fuente=new JMenu("Fuentes");
		estilo=new JMenu("Estilos");
		tamanio=new JMenu("Tamaño");
		//-------------------------------------------------------------
		fuente.add(arial=new JMenuItem("Arial"));
		fuente.add(courier=new JMenuItem("Courier"));
		courier.addActionListener(loseventos);
		fuente.add(verdana=new JMenuItem("Verdana"));
		//-------------------------------------------------------------
		estilo.add(negrita=new JMenuItem("Negrita"));
		estilo.add(cursiva=new JMenuItem("Cursiva"));
		//-------------------------------------------------------------
		tamanio.add(t12 =new JMenuItem("12"));
		tamanio.add(t16=new JMenuItem("16"));
		tamanio.add(t20=new JMenuItem("20"));
		tamanio.add(t24=new JMenuItem("24"));
		//-------------------------------------------------------------
		menu.add(fuente);
		menu.add(estilo);
		menu.add(tamanio);
		lamina2.add(menu);
		add(lamina2,BorderLayout.NORTH);
		laminaTexto=new JTextPane();
		add(laminaTexto,BorderLayout.CENTER);
	}
	
	private class eventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			laminaTexto.setFont(new Font("Courier",Font.PLAIN,12));
		}
		
	}
	
	private JTextPane laminaTexto;
	private JMenuBar menu;
	private JMenuItem arial,courier,verdana,negrita,cursiva,t12,t16,t20,t24;
	private JMenu fuente,estilo,tamanio;
	
}