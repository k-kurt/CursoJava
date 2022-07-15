package practicas;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Botones_dialogos	extends JPanel {

	public Botones_dialogos(String titulo, String[] opciones) {

		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		ButtonGroup grupo=new ButtonGroup();
		for(int i=0;i<opciones.length;i++) {
			JRadioButton boton=new JRadioButton(opciones[i]);
			add(boton);
			grupo.add(boton);
			boton.setSelected(i==0);
		}
		
	}

}
