package video167herenciayTiposComun;

public class empleado {

	public empleado(String nombre,int edad,double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		
	}
	
	public String toString() {
		return "nombre: "+nombre+" edad: "+edad+" el salario es: "+salario;
	}
	
	public String nombre;
	public int edad;
	public double salario;
	
}
