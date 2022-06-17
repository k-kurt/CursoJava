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
		setBounds(100, 100, 800, 500);
		Panellamina lamina=new Panellamina();
		add(lamina);
	}
}

class Panellamina extends JPanel{
	public Panellamina() {
		setLayout(new BorderLayout());
		
		JPanel laminaArriba=new JPanel(new GridLayout(2,3));
		
	
		
		
		
		caja1 =Box.createVerticalBox();
		caja2 =Box.createVerticalBox();
		caja3 =Box.createVerticalBox();
		caja4 =Box.createVerticalBox();
		caja5 =Box.createVerticalBox();
		caja6 =Box.createVerticalBox();
		grupo1=new ButtonGroup();
		grupo2=new ButtonGroup();
		grupo3=new ButtonGroup();
		grupo4=new ButtonGroup();
		grupo5=new ButtonGroup();
		grupo6=new ButtonGroup();
		
		
		CrearOpciones("caja1","Mensaje");
		CrearOpciones("caja1","Confirmar");
		CrearOpciones("caja1","Opcion");
		CrearOpciones("caja1","Entrada");
		CrearOpciones("caja2","ERROR_MESSAGE");
		CrearOpciones("caja2","INFORMATION_MESSAGE");
		CrearOpciones("caja2","WARNING_MESSAGE");
		CrearOpciones("caja2","QUESTION_MESSAGE");
		CrearOpciones("caja2","PLAIN_MESSAGE");
		CrearOpciones("caja3","Cadena");
		CrearOpciones("caja3","Icono");
		CrearOpciones("caja3","Componente");
		CrearOpciones("caja3","Otros");
		CrearOpciones("caja3","Object[]");
		CrearOpciones("caja4","DEFAULT_OPTION");
		CrearOpciones("caja4","YES_NO_OPTION");
		CrearOpciones("caja4","YES_NO_CANCEL_OPTION");
		CrearOpciones("caja4","OK_CANCEL_OPTION");
		CrearOpciones("caja5","String[]");
		CrearOpciones("caja5","Icono[]");
		CrearOpciones("caja5","Object[]");
		CrearOpciones("caja6","Campo de texto");
		CrearOpciones("caja6","Combo");
		
		laminaArriba.add(caja1);
		laminaArriba.add(caja2);
		laminaArriba.add(caja3);
		laminaArriba.add(caja4);
		laminaArriba.add(caja5);
		laminaArriba.add(caja6);
		
		add(laminaArriba,BorderLayout.CENTER);
		
	
		
		JPanel laminaAbajo=new JPanel();
		JButton mostrar=new JButton("Mostrar");
		laminaAbajo.add(mostrar);
		add(laminaAbajo,BorderLayout.SOUTH);
		
		
	
	}
	
	//puedo hacer una clase interna que permita agregar los botones a un buttongroup con un metodo que retorne el boton
	

	public void CrearOpciones(String nombCaja, String MensItem) {
		JRadioButton nombItem  = new JRadioButton(MensItem);
		if(nombCaja=="caja1") {
			caja1.add(nombItem);
		grupo1.add(nombItem);
		}else if(nombCaja=="caja2") {
			caja2.add(nombItem);
			grupo2.add(nombItem);
		}else if(nombCaja=="caja3") {
			caja3.add(nombItem);
			grupo3.add(nombItem);
		}else if(nombCaja=="caja4") {
			caja4.add(nombItem);
			grupo4.add(nombItem);
		}else if(nombCaja=="caja5") {
			caja5.add(nombItem);
			grupo5.add(nombItem);
		}else if(nombCaja=="caja6") {
			caja6.add(nombItem);
			grupo6.add(nombItem);
		}
			
		
	}
	
	ButtonGroup grupo1,grupo2,grupo3,grupo4,grupo5, grupo6;
	Box caja1,caja2,caja3,caja4,caja5,caja6;
}