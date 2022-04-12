import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class video90 {

	public static void main(String[] args) {

		marcoAreaText marco=new marcoAreaText();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}


class marcoAreaText extends JFrame{
	
	public marcoAreaText() {
		setTitle("video 90");
		setBounds(100, 100, 800, 600);
		panelI lamina=new panelI();
		add(lamina);
	}
	
}



class panelI extends JPanel{
	public panelI() {
		 cuadro=new JTextArea(8,15);
		JScrollPane laminaSc=new JScrollPane(cuadro);//sale barra de scroll a lo ancho y largo en el elemento que pasamos como parametro
		
		cuadro.setLineWrap(true);
		boton=new JButton("Guardar");
		add(laminaSc);
		add(boton);
		
		boton.addActionListener(new laminainterna());
		
	}
	
	private class laminainterna implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(cuadro.getText());
		}
		
	}
	
	

	
	private JTextArea cuadro;
	private JButton boton;
}

