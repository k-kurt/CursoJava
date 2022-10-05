package Video165Parejas;

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
	
	
	private T primero;
	
	
}
