import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class Eventos_eventosdeFocos_video75 extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eventos_eventosdeFocos_video75 vent=new Eventos_eventosdeFocos_video75();
		vent.iniciar();
	
	}

	
	public void iniciar() {
		 marco1 = new Eventos_eventosdeFocos_video75();
		 marco2 = new Eventos_eventosdeFocos_video75();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(100, 100, 800, 400);
		marco2.setBounds(1000, 100, 800, 400);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
		

	}


		@Override
		public void windowGainedFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==marco1) {
				marco1.setTitle("Tenemos el foco");
			}else {
				marco2.setTitle("Tenemos el foco");
			}
			
		}

		@Override
		public void windowLostFocus(WindowEvent e) {
			// TODO Auto-generated method stub

			if(e.getSource()==marco1) {
				marco1.setTitle("");
			}else {
				marco2.setTitle("");
			}
		}

		
		
		
		
		
		
	

	
	  Eventos_eventosdeFocos_video75 marco1; 
	  Eventos_eventosdeFocos_video75 marco2;
	 
	  }
