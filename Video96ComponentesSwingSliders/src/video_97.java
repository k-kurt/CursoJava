import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class video_97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco97 marco=new marco97();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class marco97 extends JFrame{
	
	public marco97() {
		setTitle("video 97");
		setBounds(200, 100, 800, 500);
		panel97 lamina=new panel97();
		add(lamina);
	}
	
}
class panel97 extends JPanel{
	
	public panel97() {
		setLayout(new BorderLayout());
		slider=new JSlider(5,50,14);
		slider.setFont(new Font("serif",Font.BOLD,14));
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		
		slider.setPaintTicks(true);
		add(slider, BorderLayout.NORTH);
		
		 JPanel lamina2=new JPanel();
		 sliderevento evento=new sliderevento();
		 
		 slider.addChangeListener(evento);
		lamina2.setLayout(new BorderLayout());
		texto= new JLabel("Texto a modificar",JLabel.CENTER);
		lamina2.add(texto);
		
		add(lamina2,BorderLayout.CENTER);
		
	}
	
	private class sliderevento implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			/*
			 * contador++; System.out.println("se ha  ovido"+contador);
			 */
			
			texto.setFont(new Font("Serif",Font.BOLD,slider.getValue()));
			
		}
		
	}
	
	private JSlider slider;
	private JLabel texto;
//	private static int contador;
}

