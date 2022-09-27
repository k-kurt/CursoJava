import java.util.ArrayList;

public class Video161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		empleado[] listaEmpleados=new empleado[3];
		listaEmpleados[0]=new empleado("Kevin",24,25000);
		listaEmpleados[1]=new empleado("kurt",25,30000);
		listaEmpleados[2]=new empleado("sboboda", 26, 40000);
		*/
		
		
		
		//ARRAYLIST es como un array pero dinamico, el tamaño varia por si solo, para mas detalles ver la API
		ArrayList<empleado> listaEmpleados=new ArrayList<empleado>();
		
		listaEmpleados.ensureCapacity(11);//estre metodo se utiliza para indicar al array cual es el tamaño y que estemos seguros del tamaño
		//evita internamente el uso mayor de recursos, ya que el arraylist crea en memoria un espacio de 10 elementos
		
		listaEmpleados.add(new empleado("Kevin",24,25000));
		listaEmpleados.add(new empleado("Kurt",25,30000));
		listaEmpleados.add(new empleado("sboboda", 26, 40000));
		listaEmpleados.add(new empleado("sboboda", 26, 40000));
		listaEmpleados.add(new empleado("sboboda", 26, 40000));
		listaEmpleados.add(new empleado("Kevin",24,25000));
		listaEmpleados.add(new empleado("Kurt",25,30000));
		listaEmpleados.add(new empleado("sboboda", 26, 40000));
		listaEmpleados.add(new empleado("sboboda", 26, 40000));
		listaEmpleados.add(new empleado("sboboda", 26, 40000));
		listaEmpleados.add(new empleado("SOBODA", 20, 50));
		
		
		listaEmpleados.trimToSize();//una vez seguros de que no habra mas elementos, este metodo optimiza recursos y elimina el esapcio vacio
		//que queda del bloque guardado por el arryList en memoria
		
		System.out.println(listaEmpleados.size());
		
		//int i=0;i<listaEmpleados.length;i++
		//listaEmpleados[i].dameDatos()
		//for(empleado e:listaEmpleados) 
		for(empleado e:listaEmpleados) {
			System.out.println(e.dameDatos());
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