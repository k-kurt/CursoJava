import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Video100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcomenu marco=new marcomenu();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class marcomenu extends JFrame{
	public marcomenu() {
		setTitle("Video 100");
		setBounds(200, 100, 1000, 500);
		panelmenu lamina=new panelmenu();
		add(lamina);
	}
}

class panelmenu extends JPanel{
	public panelmenu() {
		JMenuBar barra=new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		JMenu edicion=new JMenu("Edicion");
		JMenu herramientas=new JMenu("Herramientas");
		JMenu opciones=new JMenu("Opciones");
		
		
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem guardar_como=new JMenuItem("Guardar Como...");
		JMenuItem cortar=new JMenuItem("Cortar",new ImageIcon("src/imagenes/cortar-con-tijeras.gif"));
		JMenuItem editar=new JMenuItem("Copiar", new ImageIcon("src/imagenes/copia.gif"));
		//editar.setHorizontalTextPosition(SwingConstants.LEFT);//ES PARA PONER EL ICONO A LA DERECHA YA
		//QUE PONEMOS EL TEXTO A LA IZQUIERDA.
		
		JMenuItem pegar=new JMenuItem("Pegar", new ImageIcon("src/imagenes/pegar.gif"));
		JMenuItem general=new JMenuItem("Generales");
		JMenuItem opcion1=new JMenuItem("Opcion 1");
		JMenuItem opcion2=new JMenuItem("Opccion 2");
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		archivo.add(guardar);
		archivo.add(guardar_como);
		edicion.add(cortar);
		edicion.add(editar);
		edicion.add(pegar);
		edicion.addSeparator();//separador
		edicion.add(opciones);
		herramientas.add(general);
		
		
		barra.add(archivo);
		barra.add(edicion);
		barra.add(herramientas);
		
		add(barra);
		
	}
}