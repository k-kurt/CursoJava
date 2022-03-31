import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class video83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora marco= new MarcoCalculadora();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}


class MarcoCalculadora extends JFrame{
	public MarcoCalculadora() {
		setTitle("CALCULADORA");
		setBounds(400,200,800,600);
		LaminaSuperior lamina=new LaminaSuperior();
		add(lamina);
		//pack();//ajusta el contenedor al tamanio de los componentes
	}
}

class LaminaSuperior extends JPanel{
	public LaminaSuperior() {
		principio=true;//la instanciamos en true para que cuando cargue el sistema se ponga en true y nunca mas lo haga despues
		setLayout(new BorderLayout());
		 pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		
		 LaminaInferior=new JPanel();
		LaminaInferior.setLayout(new GridLayout(4,4));
		
		/*
		 * JButton boton1=new JButton("1"); LaminaInferior.add(boton1); JButton
		 * boton2=new JButton("2"); LaminaInferior.add(boton2); JButton boton3=new
		 * JButton("3"); LaminaInferior.add(boton3); JButton boton4=new JButton("4");
		 * LaminaInferior.add(boton4);
		 */
		ActionListener numero=new insertaNumero();
		ActionListener orden=new accionOrden();
		
		ponerBotones("7", numero);//pasamos 2 parametros, el cual es el string rotulo y el parametro numero de tipo ActionListener
		ponerBotones("8",numero);
		ponerBotones("9",numero);
		ponerBotones("/",orden);
		ponerBotones("4",numero);
		ponerBotones("5",numero);
		ponerBotones("6",numero);
		ponerBotones("*",orden);
		ponerBotones("1",numero);
		ponerBotones("2",numero);
		ponerBotones("3",numero);
		ponerBotones("-",orden);
		ponerBotones("0",numero);
		ponerBotones(".",numero);
		ponerBotones("+",orden);
		ponerBotones("=",orden);
		
		
		
		add(LaminaInferior, BorderLayout.CENTER);
		ultimaOperacion="=";
		
	}
	
	private void ponerBotones(String rotulo, ActionListener oyente) {//recibe por parametros el rotulo y el evento oyente
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);//aca pone al boton en modo escucha/oyente
		LaminaInferior.add(boton);
	}
	
	
	
	private class insertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {//el evento decencadenado lo recibe en el evento e 
			// TODO Auto-generated method stub
			String entrada=e.getActionCommand();//e recibe el texto que hay en el boton presionado y lo agrega a la entrada
			if(principio) {//condicion si es verdadera
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText()+entrada);//en el boton pantalla agregamos el texto extraido del boton numero y esta en la variable entrada
			
		}
		
	}
	
	private class accionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion=e.getActionCommand();
			//System.out.println(operacion);
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion;
			principio=true;//hace que se resetee la pantalla, por que el parametro orden llama al evento e
		}
		
		
		public void calcular(Double x) {
			if(ultimaOperacion.equals("+")) {
				resultado+=x;
			}
			else if(ultimaOperacion.equals("-")) {
				resultado-=x;
			}
			else if(ultimaOperacion.equals("/")) {
				resultado/=x;
				
			}
			else if(ultimaOperacion.equals("*")) {
				resultado*=x;
			}
			else if(ultimaOperacion.equals("=")) {
				resultado=x;
			}
			
			pantalla.setText(""+resultado);//el string  vacio es para transformar el double en un string y poder mostrarlo en la pantalla
		}
		
	}
	
	
	private JPanel LaminaInferior;
	private JButton pantalla;
	private boolean principio;//aca esta instanciada en false
	private Double resultado;
	private String ultimaOperacion;
}

