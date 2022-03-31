package poo;

public class prueba_constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos los objetos
		nuevoEmpleado empleado1= new nuevoEmpleado("kevin");
		
		nuevoEmpleado empleado2=new nuevoEmpleado("kurt");
		
		
		//cambiamos el el dato de seccion de un objeto con el setter 
		
		empleado1.cambiarseccion("produccion");//cambiando el estado inicial
		
		
		
		
		//mostramos los objetos con los metodos 
		
		System.out.println(empleado1.dameDatos());
		System.out.println(empleado2.dameDatos());
		
		//mostramos el metodo statico del id siguiente
		
		System.out.println(nuevoEmpleado.dameIdSiguiente());
		
		
	}

}


class nuevoEmpleado{
	
	public nuevoEmpleado(String nom) {
		
		nombre= nom;
		
		seccion="administracion";//inicializamos el estado de una variable, le damos un estado inicial a la variable, la podremos cambiar con un setter
		
		
		id=idSiguiente;
		
		idSiguiente++;
		
	}
	
	
	
	public void cambiarseccion(String seccion) {
		this.seccion= seccion;
	}
	
	
	public String dameDatos() {
		return "el nombre es: "+nombre+" y la seccion es: "+seccion+" el id es: "+id;
	}
	
	
	public static String  dameIdSiguiente() {
		return "el id siguiente es: "+idSiguiente;//el metodo statico accede a la variable idSiguiente por que esa variable tambien es statica
	}
	
	
	private final String nombre;//CREAMOS UNA CONSTANTE, NADA NI NADIE PODRA CAMBIAR EL VALOR DE ESA VARIABLE
	
	private String seccion;
	
	
	private int id;
	
	private static int idSiguiente=1;
	
	
}
