package practicas;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco_Dialogos extends JFrame {

	public Marco_Dialogos() {
		setTitle("Prueba de Diálogos");
		setBounds(200, 100, 800, 500);

		JPanel lamina = new JPanel();
		lamina.setLayout(new GridLayout(2, 3));

		String opcion1[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };
		
		
		lamina_tipo=new Botones_dialogos("Tipo",opcion1);
		
		lamina.add(lamina_tipo);
		add(lamina);
		
		
		
		
		// Botones_dialogos lamina2=new Botones_dialogos("Tipo",new String[]{"Mensaje","Confirmar","Opcion","Entrada"});
		// se puede instanciar directamente el array

		//lamina.add(lamina2);
		//add(lamina);
	}
	
	private Botones_dialogos lamina_tipo;

}
