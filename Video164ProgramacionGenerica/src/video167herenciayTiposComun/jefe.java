package video167herenciayTiposComun;

public class jefe extends empleado {

	public jefe(String nombre,int edad,double salario) {
		super(nombre,edad,salario);
	}
	
	double incentivo(double inc) {
		return salario+=inc;
	}

}
