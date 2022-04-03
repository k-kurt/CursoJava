import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class video86ParteII {
	public static void main(String[] args) {
		MarcoDeCuadroDeText marco2 = new MarcoDeCuadroDeText();
		marco2.setVisible(true);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoDeCuadroDeText extends JFrame {
	public MarcoDeCuadroDeText() {
		setTitle("parte 2 del video 87");
		setBounds(100, 100, 800, 500);
		LaminaDeCuadroDeText lamina2 = new LaminaDeCuadroDeText();
		add(lamina2);

	}
}

class LaminaDeCuadroDeText extends JPanel {

	public LaminaDeCuadroDeText() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina2Layout=new JPanel();
		lamina2Layout.setLayout(new FlowLayout());
		
		
		
		LaminaListener laminaAction=new LaminaListener();
		
		
		
		ingrese=new JLabel("ingrese el email: ");
		lamina2Layout.add(ingrese);
		cuadro2=new JTextField(25);
		lamina2Layout.add(cuadro2);
		
		
		
		boton2=new JButton("Verificar");
		lamina2Layout.add(boton2);
		boton2.addActionListener(laminaAction);
		
		
		resultado=new JLabel("",JLabel.CENTER);
		add(resultado,BorderLayout.CENTER);

		
		add(lamina2Layout,BorderLayout.NORTH);//tenemos que indicar dentro de la lamina que parte ocupara cada una
		
		
	}
	
	
	
	
	
	private class LaminaListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			 int correcto=0;
			 String correo=cuadro2.getText().trim();
			 for(int i=0;i<correo.length();i++) {
				 if(correo.charAt(i)=='@') {
					 correcto++;
				 }
			 }
			 
			 if(correcto!=1) {
				 resultado.setText("Email Incorrecto");
			 }else {
				 resultado.setText("Email Correcto!");
			 }

		}

	}

	private JButton boton2;
	private JTextField cuadro2;
	private JLabel ingrese;
	private JLabel resultado;

}