import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class video116Muelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marco marco=new  marco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marco extends JFrame{
	public marco() {
		setTitle("Video 116 Disposicion en Muelle");
		setBounds(200, 200, 800, 500);
		lamina lamina=new lamina();
		add(lamina);
	}
}

class lamina extends JPanel{
	public lamina() {
		
		JButton boton1=new JButton("BOTON 1");
		JButton boton2=new JButton("BOTON 2");
		JButton boton3=new JButton("BOTON 3");
		
		add(boton1);
		
		add(boton2);
		add(boton3); 	
		
		SpringLayout miLayout=new SpringLayout();
		setLayout(miLayout);
		
		Spring mimuelle=Spring.constant(0, 10, 100);
		
		miLayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);//(del lado donde empieza del objeto 1, el objeto, el muelle, el lado donde empieza del objeto 2
		miLayout.putConstraint(SpringLayout.WEST, boton2, mimuelle, SpringLayout.EAST, boton1);
		miLayout.putConstraint(SpringLayout.WEST, boton3, mimuelle, SpringLayout.EAST, boton2);
		miLayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
	}
	
}