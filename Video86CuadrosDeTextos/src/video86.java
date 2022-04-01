import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class video86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoCuadroTexto marco=new marcoCuadroTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class marcoCuadroTexto extends JFrame{
	public marcoCuadroTexto() {
		setTitle("video 86");
		setBounds(50, 50, 800, 500);
		LaminaCuadroTexto lamina=new LaminaCuadroTexto();
		add(lamina);
		
	}
}

class LaminaCuadroTexto extends JPanel{
	public LaminaCuadroTexto() {
		JButton boton=new JButton("boton");
		add(boton);
		
	}
}