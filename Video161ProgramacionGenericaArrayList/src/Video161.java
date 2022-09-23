
public class Video161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		empleado[] listaEmpleados=new empleado[3];
		listaEmpleados[0]=new empleado("Kevin",24,25000);
		listaEmpleados[1]=new empleado("kurt",25,30000);
		listaEmpleados[2]=new empleado("sboboda", 26, 40000);
		
		
		//for(empleado e:listaEmpleados) 
		for(int i=0;i<listaEmpleados.length;i++) {
			System.out.println(listaEmpleados[i].dameDatos());
		}
		
		
	}

}


class empleado{
	public empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		
	}
	
	public String dameDatos() {
		return "El empleado se llama "+ nombre+" ,su edad es "+edad+" y el salario es "+salario;
	}
	
	private String nombre;
	private int edad;
	private double salario;
	
}