import java.util.ArrayList;

public class Video162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
	
		ArrayList<empleado2> listaEmpleados=new ArrayList<empleado2>();
	
		
		listaEmpleados.add(new empleado2("Kevin",24,25000));
		listaEmpleados.add(new empleado2("Kurt",25,30000));
		listaEmpleados.add(new empleado2("sboboda", 26, 40000));
		listaEmpleados.add(new empleado2("sboboda", 26, 40000));
		listaEmpleados.add(new empleado2("sboboda", 26, 40000));
		listaEmpleados.add(new empleado2("Kevin",24,25000));
		listaEmpleados.add(new empleado2("Kurt",25,30000));
		listaEmpleados.add(new empleado2("sboboda", 26, 40000));
		listaEmpleados.add(new empleado2("sboboda", 26, 40000));
		listaEmpleados.add(new empleado2("sboboda", 26, 40000));
		//listaEmpleados.add(new empleado2("SOBODA", 20, 50));
		
		
		//////////////////////////////////////////////////////////////
		listaEmpleados.set(1,new empleado2("SOBODA", 20, 50));//para posicionar o agregar un elemento al arraylist
		
		System.out.println(listaEmpleados.get(1).dameDatos());//trae el elemento
		//////////////////////////////////////////////////////////////
		
		
		
		System.out.println(listaEmpleados.size());
		
		/* FORMA DE RECORRER UN ARRAYLIST YA QUE NO TIENE INDICE */
		
		  for(int i=0;i<listaEmpleados.size();i++) {
		  
		  empleado2 e=listaEmpleados.get(i); System.out.println(e.dameDatos());
		  
		  }
		 
		
		
		
		//LA FORMA DE HACERLO CON EL FOR CONVENCIONAL	
		empleado2 arrayEmpleados2[]=new empleado2[listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleados2);
		for(int i=0;i<arrayEmpleados2.length;i++) {
			System.out.println(arrayEmpleados2[i].dameDatos());
		}
		
		
	}

}


class empleado2{
	public empleado2(String nombre, int edad, double salario) {
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