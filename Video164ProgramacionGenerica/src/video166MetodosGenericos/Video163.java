package video166MetodosGenericos;
import java.util.ArrayList;
import java.util.Iterator;

public class Video163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<empleado3> listaEmpleados = new ArrayList<empleado3>();

		listaEmpleados.add(new empleado3("Kevin", 24, 25000));
		listaEmpleados.add(new empleado3("Kurt", 25, 30000));
		listaEmpleados.add(new empleado3("sboboda", 26, 40000));
		listaEmpleados.add(new empleado3("sboboda", 26, 40000));
		listaEmpleados.add(new empleado3("sboboda", 26, 40000));
		listaEmpleados.add(new empleado3("Kevin", 24, 25000));
		listaEmpleados.add(new empleado3("Kurt", 25, 30000));
		listaEmpleados.add(new empleado3("sboboda", 26, 40000));
		listaEmpleados.add(new empleado3("sboboda", 26, 40000));
		listaEmpleados.add(new empleado3("sboboda", 26, 40000));
		

		System.out.println(listaEmpleados.size());

		

		
			//ITERADOR
		
		Iterator<empleado3> mi_iterator= listaEmpleados.iterator();
		
		
		//El hastNext() se utiliza para saber si hay mas elementos en el objeto
		while(mi_iterator.hasNext()) {
			System.out.println(mi_iterator.next().dameDatos());
			//el next() se utiliza para mostrar el siguiente elemento
		}


	}

}

class empleado3 {
	public empleado3(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;

	}

	public String dameDatos() {
		return "El empleado se llama " + nombre + " ,su edad es " + edad + " y el salario es " + salario;
	}

	private String nombre;
	private int edad;
	private double salario;

}