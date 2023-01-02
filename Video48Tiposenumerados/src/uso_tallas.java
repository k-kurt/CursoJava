import java.util.Scanner;

public class uso_tallas {

	// enum talla {mini,mediano,grande,muy_grande};//se debe declarar fuera del main
	// para que funcione

	// VAMOS A HACER EJEMPLO DE CONSTRUCTORES

	enum talla {

		mini("s"), mediano("m"), grande("l"), muy_grande("xl");

		private talla(String abreviatura) {

			this.abreviatura = abreviatura;
		}

		public String dameAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * talla s= talla.mini;
		 * 
		 * talla m=talla.mediano; talla l=talla.grande; talla xl=talla.muy_grande;
		 */
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese una talla. las tallas son MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos= entrada.next().toLowerCase();
		
		talla la_talla= Enum.valueOf(talla.class, entrada_datos);
		
		System.out.println();
		
		
		System.out.println("la talla es: "+la_talla);
		
		System.out.println("la abreviatura es: "+la_talla.dameAbreviatura());
		
		
		
	}

}
