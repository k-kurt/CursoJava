package poo;

import javax.swing.JOptionPane;

public class uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//nuevo codigo del video 41
		
		coche micoche1= new coche();
		
		micoche1.poner_color("azul");
		
		furgoneta mifurgoneta1= new furgoneta(580,7);
		
		mifurgoneta1.poner_color("rojo");
		
		mifurgoneta1.configuracion_climatizador("si");
		
		mifurgoneta1.configurar_asientos("si");
		
		
		System.out.println(micoche1.dime_datos_generales()+" "+micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales()+mifurgoneta1.dameDAtosFurgoneta());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * coche renualt = new coche(); //INSTANCIA UNA CLASE. EJEMPLAR de clase
		 * 
		 * //System.out.println("Este auto tiene "+ renualt.rueda+ " ruedas");
		 * 
		 * System.out.println(renualt.dime_largo());
		 */
		 
		/*
		 * ESTO ES CODIGO VIEJO DE UN VIDEO ANTERIOR
		 * coche mi_coche=new coche();
		 * 
		 * mi_coche.poner_color(JOptionPane.showInputDialog("Intoduzca el color"));
		 * 
		 * System.out.println(mi_coche.dime_datos_generales());
		 * 
		 * System.out.println("el color del coche es "+mi_coche.dime_color());
		 * 
		 * mi_coche.configurar_asientos(JOptionPane.
		 * showInputDialog("tiene asientos de cuero?"));
		 * 
		 * System.out.println(mi_coche.dime_asientos());
		 * 
		 * mi_coche.configuracion_climatizador(JOptionPane.
		 * showInputDialog("tiene climatizador"));
		 * 
		 * System.out.println(mi_coche.dime_si_tiene_climatizador());
		 * 
		 * System.out.println(mi_coche.dime_peso_coche());//es el getter y setter no
		 * hace falta inicializarlo
		 * 
		 * System.out.println("el precio final del coche es: "+mi_coche.precio_coche());
		 */
	}

}
