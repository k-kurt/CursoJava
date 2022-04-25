import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class video95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcovideo95 marco=new marcovideo95();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class marcovideo95 extends JFrame{
	public marcovideo95() {
		setTitle("Video 95");
		setBounds(200, 100, 800, 500);
		panelvideo95 lamina=new panelvideo95();
		add(lamina);
	}
}

class panelvideo95 extends JPanel{
	public panelvideo95() {
		setLayout(new BorderLayout());
		texto=new JLabel("texto a modificar...",JLabel.CENTER);
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		add(texto,BorderLayout.CENTER);
		
		JPanel lamina2=new JPanel();
		//lamina2.setLayout(new BorderLayout());
		opciones =new JComboBox();
		//opciones.setEditable(true);
		lamina2.add(opciones,BorderLayout.NORTH);
		
		opciones.addItem("serif");
		opciones.addItem("sans_serif");
		opciones.addItem("monospaced");
		opciones.addItem("dialog");
		
		eventoscombobox eventos=new eventoscombobox();
		opciones.addActionListener(eventos);
		add(lamina2,BorderLayout.NORTH);
		
	}
	private class eventoscombobox implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String)opciones.getSelectedItem(),Font.PLAIN,18));
			
		}
		
	}
	
	private JLabel texto;
	private JComboBox opciones;
	
}