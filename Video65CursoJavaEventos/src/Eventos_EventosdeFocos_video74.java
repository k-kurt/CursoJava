import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Eventos_EventosdeFocos_video74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco marco1 = new MarcoFoco();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame {
	public MarcoFoco() {
		setBounds(100, 100, 800, 500);
		setTitle("video 74");
		
		setVisible(true);
		add(new PanelFoco());
	}
}

class PanelFoco extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		cuadro1.setBounds(50, 50, 180, 40);
		cuadro2.setBounds(50, 100, 180, 40);
		add(cuadro1);
		add(cuadro2);
		FocusActivo foco=new FocusActivo();
		cuadro1.addFocusListener(foco);
	}

	JTextField cuadro1;
	JTextField cuadro2;

private	class FocusActivo implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("has perdido el foco");
			String correo = cuadro1.getText();
			boolean comprobacion=false;
			for(int i=0;i<correo.length();i++) {
				if(correo.charAt(i)=='@') {
					comprobacion=true;
				}
			}
			if(comprobacion==true) {
				System.out.println("Correcto");
			}else {
				System.out.println("Incorrecto");
			}
		}

	}
}