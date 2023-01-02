package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		persona[] mispersonas= new persona[2];
		
		mispersonas[0]=new Empleado2("kevin",50000,2006,05,23);
		
		mispersonas[1]= new Alumno("kurt","desarrollador");
		
		for(persona p: mispersonas) {
			
			System.out.println(p.dameNombre()+ " "+p.dameDescripcion());
		}
		
		
		
		
		

	}

}


abstract class persona{
	public persona(String nom) {
		
		nombre=nom;
		
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	
	
	abstract String dameDescripcion();//solo se declara no se instancia nda, si hay un metodo abstracto la calse debe ser abstracta
	
	
	
	private String nombre;
}





class Empleado2 extends persona {
	
	public Empleado2( String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
				
		
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno, mes-1, dia);
		altaContrato= calendario.getTime();
		id_siguiente++;
		id=id_siguiente;
		
		
	}

	
	public String dameDescripcion() {
		return "este empleado tiene un id: "+ id+ "tiene un sueldo: "+ sueldo;
	}
	
	public Double DimeSueldo() {//getter
		return sueldo;
	}
	
	public Date dimeAltaCOntrato() {//Getter
		return altaContrato;
	}
	
	public void configuraSubaSueldo(double porcentaje){//setter
		
		double aumento=sueldo*porcentaje/100;
		sueldo+= aumento;
		
	}
	
	
	
	private double sueldo;
	private Date altaContrato;
	private static int id_siguiente;
	private int id;
	 
}



 class Alumno extends persona{
	public Alumno(String nom,String car) {
		super(nom);
		
		
		carrera=car;
		
		
		
	}
	
	public String dameDescripcion() {
		return  " la carrera del alumno es: "+carrera;
	}
	
	private String carrera;

	
	

}