import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class video98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco98 marco=new marco98();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marco98 extends JFrame{
	public marco98() {
		setTitle("Video 98");
		setBounds(200, 100, 1000, 500);
		panel98 lamina=new panel98();
		add(lamina);
	}
}

class panel98 extends JPanel{
	public panel98() {
		
		//String lista[]= {"enero","febrero","marzo","abril"};
		//String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//spiner=new JSpinner(new SpinnerListModel(lista));
		/*
		 * spiner=new JSpinner(new mispiner());//valor inicial, valor minimo,valor
		 * maximo,de cuanto en cuanto
		 */
		spiner=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			public Object getNextValue(){ 
				return super.getPreviousValue(); 
			} 
			public Object getPreviousValue() { 
				return super.getNextValue();
			}
			});
		Dimension d=new Dimension(200,50);
		spiner.setPreferredSize(d);
		
		add(spiner);
	}
	private JSpinner spiner;
	/*
	 * private class mispiner extends SpinnerNumberModel{ public mispiner() {
	 * 
	 * 
	 * super(5,0,10,1); } public Object getNextValue(){ return
	 * super.getPreviousValue(); } public Object getPreviousValue() { return
	 * super.getNextValue();//con el super lo que hacemos es llamar al metodo
	 * //getNextValue de la clase padre(SpinnerNUmberModel) a la que pertenece } }
	 */
}