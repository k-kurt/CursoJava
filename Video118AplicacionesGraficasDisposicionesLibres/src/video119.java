
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class video119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco marco1 = new marco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marco extends JFrame {
	public marco() {
		setTitle("Video 119 disposiciones libres II");
		setBounds(200, 200, 1200, 500);
		panel lamina = new panel();
		add(lamina);
	}
}

class panel extends JPanel {
	public panel() {

		setLayout(new columnaContenerdor());
		Label labnombre = new Label("NOMBRE: ");
		Label labapellido = new Label("APELLIDO: ");
		JTextField txtnombre = new JTextField();
		JTextField txtapellido = new JTextField();
		Label labTelefono=new Label("Telefono: ");
		JTextField txttelefono=new JTextField();

		add(labnombre);
		add(txtnombre);
		add(labapellido);
		add(txtapellido);
		add(labTelefono);
		add(txttelefono);
	}
}

class columnaContenerdor implements LayoutManager {

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub
		int d=parent.getWidth();
		int x=d/2;
		int contador = 0;
		

		int n = parent.getComponentCount();// para utilizar en el for
		for (int i = 0; i < n; i++) {
			contador++;
			Component c = parent.getComponent(i);// devuelve un objeto de tipo componente y almacena ese componente que
													// devuelve este metodo parent

			c.setBounds(x-100, y, 100, 20);
			x += 100;
			if (contador % 2 == 0) {
				x = d/2;
				y += 40;

			}
		}

	}

	int x;
	int y = 20;
}