package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VAMOS A HACER UN EJEMPLO DE UN OBJETO CON TODO EN UN SOLO FICHERO, ESTO NO ES
		// REOMENDABLE

		/*
		 * Empleado empleado1 = new Empleado ("paco Gomez",85000, 1990, 12, 17);
		 * 
		 * Empleado empleado2=new Empleado("ana lopez", 95000, 1995, 06, 02);
		 * 
		 * Empleado empleado3= new Empleado("maria martin",105000,2002,03,15);
		 * 
		 * 
		 * empleado1.configuraSubaSueldo(5); empleado2.configuraSubaSueldo(5);
		 * empleado3.configuraSubaSueldo(5);
		 * 
		 * 
		 * System.out.println("Nombre :"+ empleado1.dimeNombre()+" sueldo: "+
		 * empleado1.DimeSueldo() +"fecha de alta: "+empleado1.dimeAltaCOntrato());
		 * 
		 * System.out.println("Nombre :"+ empleado2.dimeNombre()+" sueldo: "+
		 * empleado2.DimeSueldo() +"fecha de alta: "+empleado2.dimeAltaCOntrato());
		 * 
		 * System.out.println("Nombre :"+ empleado3.dimeNombre()+" sueldo: "+
		 * empleado3.DimeSueldo() +"fecha de alta: "+empleado3.dimeAltaCOntrato());
		 */

		// vamos a guardar todo en un array para poder ahorrar tiempo escribiendo

		// en java no se puede guardar en un array datos de todo tipo, para hacerlo
		// tenemos que crear previamente,
		// una clase ej Empleado, y de ahi crear el array como lo hacemos a
		// continuacion.

		jefatura jefe_RRHH = new jefatura("kevin", 55000, 2006, 04, 10);

		jefe_RRHH.configurarIncentivo(2570);

		Empleado[] misempleados = new Empleado[6];

		misempleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);

		misempleados[1] = new Empleado("ana lopez", 95000, 1995, 06, 02);

		misempleados[2] = new Empleado("maria martin", 105000, 2002, 03, 15);

		misempleados[3] = new Empleado("jose maria");

		misempleados[4] = jefe_RRHH;

		misempleados[5] = new jefatura("maria", 95000, 2004, 4, 3);// se puede hacer de la 2 formas, pero el anterior
		// queriamos ponerle el acentivo entonces teniamos que declararlo como objeto de
		// jefatura.

		jefatura jefa_finanzas = (jefatura) misempleados[5];// hacemos casting de empleados a jefatura

		jefa_finanzas.configurarIncentivo(55000);

		Empleado Director_comercial = new jefatura("Sandra", 85000, 2012, 04, 12);

		Comparable ejemplo = new Empleado("Elisabeth", 65000, 2012, 32, 12);

		if (Director_comercial instanceof Empleado) {
			System.out.println("Es de tipo jefatura");
		}
		if (ejemplo instanceof Comparable) {
			System.out.println("implementa la interfaz comparable");
		}

		System.out.println(jefa_finanzas.tomar_decisiones("Dar mas dias de vacaciones"));

		System.out.println(jefa_finanzas.dimeNombre()+" tiene un bonus de: "+jefa_finanzas.establece_bonus(500));
		
		System.out.println(misempleados[2].dimeNombre()+" tiene un bono de: "+ misempleados[3].establece_bonus(200));
		
		
		/*
		 * for(int i=0; i<3; i++) { misempleados[i].configuraSubaSueldo(5); }
		 */
		// BUCLE FOR MEJORADO, otra forma de hacerlo
		for (Empleado e : misempleados) {
			e.configuraSubaSueldo(5);
		}

		/*
		 * for(int i=0;i<3;i++) {
		 * System.out.println("nombre: "+misempleados[i].dimeNombre()+" Sueldo: "
		 * +misempleados[i].DimeSueldo()
		 * +" fecha de alta: "+misempleados[i].dimeAltaCOntrato()); }
		 */

		Arrays.sort(misempleados);

		/* BUCLE FOR MEJORADO, otra forma de hacerlo */
		for (Empleado e : misempleados) {
			System.out.println("nombre: " + e.dimeNombre() + " Sueldo: " + e.DimeSueldo()// el polimorfismo hace que "e"
																							// se comporte segun el
																							// ambito, funciona de
																							// distintas formas
					+ " fecha de alta: " + e.dimeAltaCOntrato());
		}

	}

}

class Empleado implements Comparable, trabajadores {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();

	}

	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);/*
										 * llama al otro constructor con el this, y pasa los valores que pusimos, pero
										 * seguimos construyendo objetos con el este contructor solo que hace como una
										 * especio de puente con el otro
										 */ 
	}

	public String dimeNombre() {// getter
		return nombre;
	}

	public Double DimeSueldo() {// getter
		return sueldo;
	}

	public Date dimeAltaCOntrato() {// Getter
		return altaContrato;
	}

	public void configuraSubaSueldo(double porcentaje) {// setter

		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;

	}

	public int compareTo(Object miObject) {

		Empleado otroEmpleado = (Empleado) miObject;

		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}

		return 0;

	}
	
	
	public double establece_bonus(double gratificacion) {
		return trabajadores.bonus_base+gratificacion;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;

}

final class jefatura extends Empleado implements jefes {
	/*
															 * el final permite que ya no se hagan mas clases extends de
															 * esta, se puede hacer lo mismo con los metodos
															 */

	public jefatura(String nom, double sue, int anio, int mes, int dia) {

		super(nom, sue, anio, mes, dia);

	}

	public Double DimeSueldo() {
		double sueldojefe = super.DimeSueldo();// tamiben se pueden poner distinto nombre al getter y se llama sin poner
												// super
		// creamos el polimorfismo
		return sueldojefe + incentivo;
	}

	public void configurarIncentivo(double b) {
		incentivo = b;
	}

	public String tomar_decisiones(String decision) {
		return "un miembro de la direccion ah tomando una decision: " + decision;
	}

	public double establece_bonus(double gratificacion) {
			
		double prima= 2000;
	
		return trabajadores.bonus_base+prima+gratificacion;
	
	}
	
	
	private double incentivo;

}
