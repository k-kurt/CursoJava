
public class ClaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*METODOS MAS USADOS EN STRING
		 * length()
		 * devuelve la longitud de la cadena de caracteres
		 * 
		 * 
		 * charAt(n)
		 * devuelve la posicion de un caracter dentro de una cadena.(Las posiciones empiezan a contar de 0)
		 * 
		 * substring(x,y)
		 * devuelve una subcadena dentro de una cadena, siendo X el caracter a partir del cual se extrae e y  el nº de caracteres  que  se quieren extraer
		 * 
		 * 
		 * equals(cadena)
		 * devuelve true si dos cadenas que se comparan son iguales y false si no lo son. Distingue mayusculas y minisculas 
		 * 
		 * 
		 * equalsignoreCase(Cadena)
		 * igual que el anterior pero sin tener en cuanta la mayusculas y minisculas
		 * 
		 * 
		 * */
		
		
		String nombre = "juan";
		System.out.println("mi nombre es: "+ nombre);
		System.out.println("mi nombre tiene: " + nombre.length()+ " letras");
		System.out.println("la primera letra de mi nombre es la: "+ nombre.charAt(0));
		/* ver la ultima letra de un nombre */
		int ultimaLetra;
		ultimaLetra = nombre.length();
		System.out.println("la ultima letra d emi nombre es: "+ nombre.charAt(ultimaLetra-1));
		
	}

}
