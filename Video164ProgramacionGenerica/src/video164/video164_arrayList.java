package video164;



public class video164_arrayList {

	public video164_arrayList(int z) {
		datosElmentos=new Object[z];
		
	}
	
	public Object get(int i) {
		return datosElmentos[i];
	}
	
	public void add (Object o) {
		datosElmentos[i]=o;
		i++;
	}
	
	
	private int i;
	private Object[] datosElmentos;
}
