package practicas;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco_Dialogos extends JFrame{
	
	public Marco_Dialogos() {
		setTitle("Prueba de Diálogos");
		setBounds(200, 100, 800, 500);
		
		
		JPanel lamina=new JPanel();
		lamina.setLayout(new GridLayout(2,3));
		
	}
}
