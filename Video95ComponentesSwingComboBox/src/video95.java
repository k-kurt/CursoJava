import javax.swing.JFrame;
import javax.swing.JPanel;

public class video95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcovideo95 marco=new marcovideo95();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class marcovideo95 extends JFrame{
	public marcovideo95() {
		setTitle("Video 95");
		setBounds(200, 100, 800, 500);
		JPanel lamina=new JPanel();
		add(lamina);
	}
}

class panelvideo95 extends JPanel{
	public panelvideo95() {
		
	}
}