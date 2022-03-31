import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Eventos_Ventanas_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrincipal marco= new MarcoPrincipal();
		marco.setBounds(0, 0, 500, 400);
		marco.setTitle("marco1");
		MarcoPrincipal marco2= new MarcoPrincipal();
		marco2.setBounds(520, 0, 500, 400);
		marco2.setTitle("marco2");
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoPrincipal extends JFrame{
	public MarcoPrincipal() {
		//setTitle("video 69");
		setVisible(true);
		addWindowListener(new Lamina());
	}
}

class Lamina extends WindowAdapter{
	public void windowIconified(WindowEvent e) {
		System.out.println("la ventana se minimizo");
	}
}