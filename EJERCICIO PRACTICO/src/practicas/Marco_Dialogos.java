package practicas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
		lamina_tipo_mensaje=new Botones_dialogos("Tipo de Mensaje",new String[] {"ERROR_MENSSAGE","INFORMATION_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"});
		lamina_mensaje=new Botones_dialogos("Mensaje",new String[] {"Cadena","Icono","Componente","Otros","Object[]"});
		lamina_confirmar=new Botones_dialogos("Confirmar", new String[] {"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"});
		lamina_opcion=new Botones_dialogos("Opcion", new String[] {"String[]","Icon[]","Object[]"});
		lamina_entrada=new Botones_dialogos("Entrada", new String[] {"Campo de texto","Combo"});
		
		setLayout(new BorderLayout());
		
		lamina.add(lamina_tipo);
		lamina.add(lamina_tipo_mensaje);
		lamina.add(lamina_mensaje);
		lamina.add(lamina_confirmar);
		lamina.add(lamina_opcion);
		lamina.add(lamina_entrada);
		
		//Contruimos la lamina inferior
		JPanel lamina_inferior=new JPanel();
		JButton btnMostrar=new JButton("Mostrar");
		btnMostrar.addActionListener(new AccionMostrar());
		lamina_inferior.add(btnMostrar);
		add(lamina,BorderLayout.CENTER);
		add(lamina_inferior,BorderLayout.SOUTH);
		
		
		
		
		// Botones_dialogos lamina2=new Botones_dialogos("Tipo",new String[]{"Mensaje","Confirmar","Opcion","Entrada"});
		// se puede instanciar directamente el array

		//lamina.add(lamina2);
		//add(lamina);
	}
	
	
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//System.out.println("FUNCIONA");
			System.out.println(lamina_tipo.dameSeleccion());
		}
		
	}
	
	private Botones_dialogos lamina_tipo, lamina_tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;

}
