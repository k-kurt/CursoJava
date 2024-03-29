package practicas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Marco_Dialogos extends JFrame {

	public Marco_Dialogos() {
		setTitle("Prueba de Di�logos");
		setBounds(200, 100, 800, 500);

		JPanel lamina = new JPanel();
		lamina.setLayout(new GridLayout(2, 3));

		String opcion1[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };

		lamina_tipo = new Botones_dialogos("Tipo", opcion1);
		lamina_tipo_mensaje = new Botones_dialogos("Tipo de Mensaje",
				new String[] { "ERROR_MENSSAGE", "INFORMATION_MESSAGE","WARNNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE" });
		lamina_mensaje = new Botones_dialogos("Mensaje",
				new String[] { "Cadena", "Icono", "Componente", "Otros", "Object[]" });
		lamina_confirmar = new Botones_dialogos("Confirmar",
				new String[] { "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" });
		lamina_opcion = new Botones_dialogos("Opcion", new String[] { "String[]", "Icon[]", "Object[]" });
		lamina_entrada = new Botones_dialogos("Entrada", new String[] { "Campo de texto", "Combo" });

		setLayout(new BorderLayout());

		lamina.add(lamina_tipo);
		lamina.add(lamina_tipo_mensaje);
		lamina.add(lamina_mensaje);
		lamina.add(lamina_confirmar);
		lamina.add(lamina_opcion);
		lamina.add(lamina_entrada);

		// Contruimos la lamina inferior
		JPanel lamina_inferior = new JPanel();
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new AccionMostrar());
		lamina_inferior.add(btnMostrar);
		add(lamina, BorderLayout.CENTER);
		add(lamina_inferior, BorderLayout.SOUTH);

		// Botones_dialogos lamina2=new Botones_dialogos("Tipo",new
		// String[]{"Mensaje","Confirmar","Opcion","Entrada"});
		// se puede instanciar directamente el array

		// lamina.add(lamina2);
		// add(lamina);
	}

	// -------------------proporciona el mensaje

	public Object dameMensaje() {
		String s = lamina_mensaje.dameSeleccion();
		if (s.equals("Cadena")) {
			return sMsj;
		} else if (s.equals("Icono"))
			return iconoMensaje;
		else if (s.equals("Componente"))
			return componenteMensaje;
		else if (s.equals("Otros"))
			return objetoMensaje;
		else if (s.equals("Object[]")) {
			return new Object[] { sMsj, iconoMensaje, componenteMensaje, objetoMensaje };

		} else {
			return null;
		}
	}
	
	
	//-------------------DEVUELVE TIPO ICONO y tambien n� de botones en confirmar
	
	public int devuelvetipo(Botones_dialogos lamina){
		
		String s=lamina.dameSeleccion();
		
		if(s.equals("ERROR_MENSSAGE")||s.equals("YES_NO_OPTION"))return 0;
		else if(s.equals("INFORMATION_MESSAGE")||s.equals("YES_NO_CANCEL_OPTION"))return 1;
		else if(s.equals("WARNNING_MESSAGE")||s.equals("OK_CANCEL_OPTION"))return 2;
		else if(s.equals("QUESTION_MESSAGE"))return 3;
		else if(s.equals("PLAIN_MESSAGE")||s.equals("DEFAULT_OPTION"))return -1;
		else{return 0;
		
	}
	}
	
	//metodo que da opciones a la lamina opcion---------------------------------------------------
	
	public Object[] dameOpciones(Botones_dialogos lamina) {
		String s=lamina.dameSeleccion();
		if(s.equals("String[]"))return new String[] {"Amarillo","rojo","azul"};
		else if(s.equals("Icon[]"))return new Object[] {new ImageIcon("../MULTIMEDIA/bola_roja.jpg"),new ImageIcon("../MULTIMEDIA/bola_verde.jpg"),new ImageIcon("../MULTIMEDIA/bola_amarilla.jpg")};
		else if(s.equals("Object[]"))return new Object[] {sMsj,iconoMensaje,objetoMensaje,componenteMensaje};
		else {return null;}
	}
	
	
	
	
	
	
	
//------------------------------------------------------------------------------------------------------
	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			// System.out.println("FUNCIONA");
			// System.out.println(lamina_tipo.dameSeleccion());
			if (lamina_tipo.dameSeleccion().equals("Mensaje")) {
				JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", devuelvetipo(lamina_tipo_mensaje));
			} else if (lamina_tipo.dameSeleccion().equals("Confirmar")) {
				JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", devuelvetipo(lamina_confirmar),  devuelvetipo(lamina_tipo_mensaje));
			} else if (lamina_tipo.dameSeleccion().equals("Entrada")) {
				
				if(lamina_entrada.dameSeleccion().equals("Campo de texto")) {
				JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "titulo",  devuelvetipo(lamina_tipo_mensaje));
				}else {
					JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", devuelvetipo(lamina_tipo_mensaje), null, new String[] {"Azul","amarillo","rojo"}, "Azul");
				}
			
			} else if (lamina_tipo.dameSeleccion().equals("Opcion")) {
				JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0,  devuelvetipo(lamina_tipo_mensaje), null, dameOpciones(lamina_opcion), null);
			}

		}
	
	}

	private Botones_dialogos lamina_tipo, lamina_tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion,
			lamina_entrada;

	private String sMsj = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("../MULTIMEDIA/bola_roja.jpg");
	private Object objetoMensaje = new Date();
	private Component componenteMensaje = new lamina_objeto();

}
	
class lamina_objeto extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		g2.setPaint(Color.yellow);
		g2.fill(rectangulo);
	}

}
