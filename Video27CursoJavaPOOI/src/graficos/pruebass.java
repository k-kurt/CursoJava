package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class pruebass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuente= JOptionPane.showInputDialog("introduce la fuente que quieres buscar");
		Boolean siEsta= false;
		
		String[] lasFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String fuentes: lasFuentes) {
			System.out.println(fuentes);
			if(fuentes.equals(fuente)) {
			siEsta=true;
		}
		}
		
		if(siEsta) {
			System.out.println("Si esta instalada");
		}else {
			System.out.println("No esta instalada");
		}
		
		
		
	}

}




