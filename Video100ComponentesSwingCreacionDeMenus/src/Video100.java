import javax.swing.JFrame;
import javax.swing.JPanel;

public class Video100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcomenu marco=new marcomenu();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class marcomenu extends JFrame{
	public marcomenu() {
		setTitle("Video 100");
		setBounds(200, 100, 1000, 500);
		panelmenu lamina=new panelmenu();
		add(lamina);
	}
}

class panelmenu extends JPanel{
	public panelmenu() {
	
	}
}