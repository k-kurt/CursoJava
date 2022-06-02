import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class video115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marco marco=new marco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marco extends JFrame{
	public marco() {
		setTitle("Video 115");
		setBounds(200, 200, 800, 500);
		JLabel labNombre= new JLabel("Nombre: ");
		JTextField txtnombre=new JTextField(10);
		txtnombre.setMaximumSize(txtnombre.getPreferredSize());
		
		Box caja1=Box.createHorizontalBox();
		caja1.add(labNombre);
		caja1.add(Box.createHorizontalStrut(30));
		caja1.add(txtnombre);
		
		
		
	}
}
