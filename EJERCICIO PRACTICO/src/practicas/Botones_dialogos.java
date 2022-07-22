package practicas;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Botones_dialogos	extends JPanel {

	public Botones_dialogos(String titulo, String[] opciones) {

		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		 grupo=new ButtonGroup();
		for(int i=0;i<opciones.length;i++) {
			JRadioButton boton=new JRadioButton(opciones[i]);
			boton.setActionCommand(opciones[i]);
			add(boton);
			grupo.add(boton);
			boton.setSelected(i==0);
		}
	}

	public String dameSeleccion() {
		//nos fijamos en la API en la clase ButtonGroup
//		ButtonModel objBoton=grupo.getSelection();
//		String s=objBoton.getActionCommand();//devuelve el string del boton seleccionado 
//		return s;
		
		
		return grupo.getSelection().getActionCommand();//lo resumimos en una linea
	}
	
	private ButtonGroup grupo;
	
}
