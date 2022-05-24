import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Eventos_multiplesFuentes_video76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElmarcoPrincipal marcos=new ElmarcoPrincipal();
		marcos.setVisible(true);
		marcos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class ElmarcoPrincipal extends JFrame{
	public ElmarcoPrincipal() {
		setTitle("video 76");
		setBounds(100, 100, 800, 400);
		Laminaprincipal lamina=new Laminaprincipal();
		add(lamina);
	}
	
}

class Laminaprincipal extends JPanel{
	
	public Laminaprincipal() {
		AccionBotones accionAmarilla= new AccionBotones("amarilla",new ImageIcon("src/bola_amarilla.jpg"), Color.YELLOW);
		AccionBotones accionRojo= new AccionBotones("rojo",new ImageIcon("src/bola_roja.jpg"), Color.RED);
		AccionBotones accionVerde= new AccionBotones("verde",new ImageIcon("src/bola_verde.jpg"), Color.GREEN);


		/*
		 * JButton botonamarillo=new JButton(accionAmarilla); add(botonamarillo);
		 */
		add(new JButton(accionAmarilla));
		add(new JButton(accionRojo));
		add(new JButton(accionVerde));
		
		
		
		/*
		 * JButton verde = new JButton("verde"); JButton rojo=new JButton("rojo");
		 * JButton amarillo=new JButton("amarillo"); add(verde); add(rojo);
		 * add(amarillo);
		 */
		
		
		InputMap  mapa_entrada= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);//cuales van a ser los objetos que tengas el foco para esa combinacion de teclas
		//cuando la lamina tena el foco, los componentes en ella van a recibir la combinacion de teclas
		KeyStroke tecla_amarillo=KeyStroke.getKeyStroke("ctrl A");
		mapa_entrada.put(tecla_amarillo, "fondoAmarillo");//asignar combinacion de teclas a un objeto
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondoAmarillo",accionAmarilla);//asignar objetos a acciones
		
		mapa_entrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondoverde");
		mapaAccion.put("fondoverde", accionVerde);
		
		mapa_entrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");
		mapaAccion.put("fondoRojo", accionRojo);
		
		/*
		 * KeyStroke tecla_rojo=KeyStroke.getKeyStroke("ctrl S"); KeyStroke
		 * tecla_verde=KeyStroke.getKeyStroke("ctrl D");
		 */
		
		
		
		
	}
	
	private class AccionBotones extends AbstractAction{
		public AccionBotones(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color: "+ nombre);
			putValue("color_de_fondo", color_boton);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color)getValue("color_de_fondo");//casting(Color)
			setBackground(c);
			System.out.println("Nombre: "+ getValue(Action.NAME)+ " La descripcion: "+ getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
	
	/*
	 * setEnabled se utiliza para que un boton(por ejemplo: copiar,pegar,cortar) esten
	 * desactivados cuando no se pueden utilizar. con isEnabled vemos si esta activado ese boton del ejemplo. 
	 * el metodo putValue permite almacenar la informacion que deseamos de la fuente en un formato clave: valor, se almacena automaticamente
	 * en el parametro event del metodo actionPefomed el cual se invoca automaticamente cuando ejecutamos la accion
	 * El getValue toma la informacion guardada en ese objeto event 
	 */ 
	
}


