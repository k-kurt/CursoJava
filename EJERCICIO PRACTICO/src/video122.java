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
		
		 caja1 =Box.createVerticalBox();
		grupo1=new ButtonGroup();
		grupo2=new ButtonGroup();
		grupo3=new ButtonGroup();
		grupo4=new ButtonGroup();
		grupo5=new ButtonGroup();
		grupo6=new ButtonGroup();
		
		
		laminaArriba.add(caja1);
		add(laminaArriba,BorderLayout.CENTER);
		
	
		
		JPanel laminaAbajo=new JPanel();
		JButton mostrar=new JButton("Mostrar");
		laminaAbajo.add(mostrar);
		add(laminaAbajo,BorderLayout.SOUTH);
	}
	
	//puedo hacer una clase interna que permita agregar los botones a un buttongroup con un metodo que retorne el boton
	

	public void CrearOpciones(String nombCaja, String MensItem, String nombGrupo) {
		JRadioButton nombItem  = new JRadioButton(MensItem);
		if(nombCaja=="caja1") {
			caja1.add(nombItem);
		grupo1.add(nombItem);
		}
	}
	
	ButtonGroup grupo1;
	ButtonGroup grupo2;
	ButtonGroup grupo3;
	ButtonGroup grupo4;
	ButtonGroup grupo5;
	ButtonGroup grupo6;
	Box caja1;
}