import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosCuadrosTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTexto marco=new MarcoCuadroTexto();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}

class MarcoCuadroTexto extends JFrame{
	public MarcoCuadroTexto() {
		setTitle("video 88");
		setBounds(100, 100, 800, 500);
		PanelCuadroTextos lamina=new PanelCuadroTextos();
		
		add(lamina);
	}
}

class PanelCuadroTextos extends JPanel{
	public PanelCuadroTextos() {
		JTextField cuadro=new JTextField(30);//instanciamos el cuadro de texto
		document documento=new document();//instanciamos la clase interna document para pasar el evento
		Document miDocumento=cuadro.getDocument();//instanciamos la clase Document para obtener el texto dentro del TextField
		miDocumento.addDocumentListener(documento);//ponemos en oyente el texto obtenido del textField
		add(cuadro);
	}
	
	private class document implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("has escrito");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("has eliminado");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}