package Video165Parejas;

public class Uso_parejas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		parejas<String> una=new parejas<String>();
		una.setPrimero("kevin");
		System.out.println(una.getPrimero());
		
		Persona pers1=new Persona("ana");
		parejas<Persona> otra=new parejas<Persona>();
		otra.setPrimero(pers1);
		System.out.println(otra.getPrimero());
	}

}


class Persona{
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public String toString() {
		return nombre;
	}
	
	private String nombre;
}