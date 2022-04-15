import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class video93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoPrincipal marco=new marcoPrincipal();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoPrincipal extends JFrame{
	public marcoPrincipal() {
		setTitle("Video 93");
		setBounds(100, 100, 800, 500);
		laminaPrincipal lamina=new laminaPrincipal();
		add(lamina);
	}
	
}

class laminaPrincipal extends JPanel{
	public laminaPrincipal() {
		ButtonGroup grupo=new ButtonGroup();
		ButtonGroup grupo2=new ButtonGroup();
		
		
		JRadioButton boton1=new JRadioButton("Azul", false);
		JRadioButton boton2=new JRadioButton("Rojo", false);
		JRadioButton boton3=new JRadioButton("Verde", false);
		
		JRadioButton boton4=new JRadioButton("Masculino",false);
		JRadioButton boton5=new JRadioButton("Femenino",false);
		
		
		grupo.add(boton1);
		grupo.add(boton2);
		grupo.add(boton3);
		
		grupo2.add(boton4);
		grupo2.add(boton5);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		add(boton4);
		add(boton5); 
		
	}
}