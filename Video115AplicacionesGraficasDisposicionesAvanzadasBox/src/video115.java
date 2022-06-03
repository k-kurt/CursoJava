import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
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
		
		Box caja2=Box.createHorizontalBox();
		JLabel labcontras=new JLabel("Contrasenia: ");
		JTextField txtcontras=new JTextField(10);
		txtcontras.setMaximumSize(txtcontras.getPreferredSize());//establecemos que sea siempre el mismo tamanio
		caja2.add(labcontras);
		caja2.add(Box.createHorizontalStrut(30));
		caja2.add(txtcontras);
		
		Box caja3=Box.createHorizontalBox();
		JButton ok=new JButton("OK");
		JButton cancelar=new JButton("CANCELAR");
		caja3.add(ok);
		caja3.add(Box.createGlue());
		caja3.add(cancelar);
		
		Box cajaContenedor=Box.createVerticalBox();
		cajaContenedor.add(caja1);
		cajaContenedor.add(caja2);
		cajaContenedor.add(caja3);
		
		add(cajaContenedor,BorderLayout.CENTER);
		
		
		
		
	}
}
