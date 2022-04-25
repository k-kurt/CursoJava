import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
	}
}