import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class video122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panelmarco marco=new Panelmarco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Panelmarco extends JFrame{
	public Panelmarco() {
		setTitle("EJERCICIO PRACTICO");
		setBounds(300, 100, 1200, 800);
		Panellamina lamina=new Panellamina();
		add(lamina);
	}
}

class Panellamina extends JPanel{
	public Panellamina() {
		setLayout(new BorderLayout());
		
		JPanel laminaArriba=new JPanel(new GridLayout());
		
		Box caja1 =Box.createVerticalBox();
		ButtonGroup grupo1=new ButtonGroup();
		JRadioButton mensaje=new JRadioButton("Mensaje");
		caja1.add(mensaje);
		
		laminaArriba.add(caja1);
		add(laminaArriba,BorderLayout.CENTER);
		
		
		
		
		
		JPanel laminaAbajo=new JPanel();
		JButton mostrar=new JButton("Mostrar");
		laminaAbajo.add(mostrar);
		add(laminaAbajo,BorderLayout.SOUTH);
	}
}