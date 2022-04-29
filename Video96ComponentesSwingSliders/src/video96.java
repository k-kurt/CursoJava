import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class video96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoSlider marco=new marcoSlider();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class marcoSlider extends JFrame{
	public marcoSlider() {
		setTitle("video 96");
		setBounds(200, 100, 800, 500);
		panelSlider lamina=new panelSlider();
		add(lamina);
	}
}

class panelSlider extends JPanel{
	public  panelSlider() {
		setLayout(new BorderLayout());
		
		
		slider=new JSlider(SwingConstants.VERTICAL,0,100,70);
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setFont(new Font("MONOSPACED",Font.ITALIC,24));
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);//hace que la perilla se mueva al item mas cercano
		
		add(slider,BorderLayout.WEST);
		
		
	}
	private JSlider slider;
}