import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class video92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoPrincipal marco=new marcoPrincipal();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marcoPrincipal extends JFrame{
	public marcoPrincipal() {
		setTitle("video 92");
		setBounds(100, 100, 800, 500);
		panelPrincipal lamina=new panelPrincipal();
		add(lamina);
	}
}

class panelPrincipal extends JPanel{
	public panelPrincipal() {
		
		setLayout(new BorderLayout());
		
		
		Font miletra=new Font("Serif",Font.PLAIN,24);
		
		checkListener loschecks =new checkListener();
		
		
		texto=new JLabel("texto al que voy a modificar",JLabel.CENTER);//JLabel.CENTER permite poner el JLabel en el centro
		//si no lo ponemos queda a la izquierda 

		texto.setFont(miletra);
		add(texto,BorderLayout.NORTH);
	
		
		JPanel lamina2=new JPanel();
		//lamina2.setLayout(new GridLayout(1,2));
		
		check1 =new JCheckBox("Activar Negrita");
		check1.addActionListener(loschecks);
		//check1.addActionListener(new checkListener());
		check2=new JCheckBox("Activar Cursiva");
		check2.addActionListener(loschecks);
		//check2.addActionListener(new checkListener());
		
		lamina2.add(check1);
		lamina2.add(check2);
		
		add(lamina2,BorderLayout.SOUTH);
	}
	
	
	private class checkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD;
			if(check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif",tipo,24));
			
		}
		
	}
	
	
	private JLabel texto;
	private JCheckBox check1, check2;
	
	
}