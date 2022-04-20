import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class video94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoVideo94 marco=new marcoVideo94();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marcoVideo94 extends JFrame{
	public marcoVideo94() {
		setTitle("Video 94");
		setBounds(100, 100, 800, 500);
		Panel94 lamina94=new Panel94();
		add(lamina94);
		
	}
	
}

class Panel94 extends JPanel{
	public Panel94() {
		setLayout(new BorderLayout());
		
		
		eventosRadioButton eventos=new eventosRadioButton();
		JPanel lamina1=new JPanel();
		lamina1.setLayout(new BorderLayout());
		texto1=new JLabel("Este texto va a ser modificado",JLabel.CENTER);
		texto1.setFont(new Font("Serif",Font.PLAIN,18));
		lamina1.add(texto1);
		
		add(lamina1,BorderLayout.CENTER);
		
		JPanel lamina2=new JPanel();
		//lamina2.setLayout(new BorderLayout());
		
		ButtonGroup grupo1=new ButtonGroup();
		
		boton1=new JRadioButton("Chiquita",false);
		grupo1.add(boton1);
		boton1.addActionListener(eventos);
		boton2=new JRadioButton("Mediana",false);
		grupo1.add(boton2);
		boton2.addActionListener(eventos);
		boton3=new JRadioButton("Grande",true);
		grupo1.add(boton3);
		boton3.addActionListener(eventos);
		boton4=new JRadioButton("Muy Grande",false);
		grupo1.add(boton4);
		boton4.addActionListener(eventos);
		
		
		lamina2.add(boton1);
		lamina2.add(boton2);
		lamina2.add(boton3);
		lamina2.add(boton4);
		
		add(lamina2,BorderLayout.SOUTH);
		
	}
	
	private JLabel texto1;
	private JRadioButton boton1,boton2,boton3,boton4;
	
	private class eventosRadioButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==boton1) {
			
				texto1.setFont(new Font("Serif",Font.PLAIN,10));
				
			}else if(e.getSource()==boton2) {
			
				texto1.setFont(new Font("Serif",Font.PLAIN,12));
				
			}else if(e.getSource()==boton3) {
			
				texto1.setFont(new Font("Serif",Font.PLAIN,18));
				
			}else if(e.getSource()==boton4) {
			
				texto1.setFont(new Font("Serif",Font.PLAIN,25));
				
			}		
			
//				Lo primero que hacemos, es instanciar un objeto de la Clase "Font", la cual nos 
			//permite manejar la fuente y sus características, y que se verá reflejada y/o representada en 
//			el texto de un elemento. A la hora de instanciar dicho objeto que llamaremos en este caso "fuente", 
//			deberemos pasarle 3 parámetros; el primero de ellos (tipo String) hará referencia al nombre del 
//			tipo de fuente y/o letra que usaremos, en esta ocasión "Calibri"; el segundo (tipo int) indica 
//			que estilo queremos aplicarle al texto; es decir, para que se vea tipo "Cursiva" escogemos el valor 
//			"1", para "Negrita" digitamos "2", si queremos combinar los estilos anteriores "Negrita Cursiva" estableceremos 
//			el valor "3", pero si lo que deseamos es dejar nuestro texto sin ninguno de estos estilos, procederemos a asignar 
//			el valor "0" (cero); por último, el tercer parámetro (tipo int) nos va a permitir establecer un tamaño para el texto.
//				Teniendo en cuenta cada parte del código, esta línea quedaría de la siguiente forma:
//				Font fuente = new Font("Calibri", 3, 19);
				
				
				//System.out.println("haz pulsado el boton1");
			
			
		}
		
	}
}