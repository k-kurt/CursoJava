package video167herenciayTiposComun;

public class parejas<T> {

	public parejas(){
		primero=null;
	}
	
	
	public void setPrimero(T nuevoValor){
		primero=nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	
	public static void imprimirTrabajador(parejas<? extends empleado> p){//<? extends empleado> se llama comodin ya que permite que cualquier clase hereda de empleado pueda usarse
		
		empleado primero=p.getPrimero();
		System.out.println(primero);
		
	}
	
	private T primero;
	
	
}
