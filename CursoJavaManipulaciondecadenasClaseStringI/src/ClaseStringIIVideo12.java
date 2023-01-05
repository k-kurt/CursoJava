
public class ClaseStringIIVideo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//CLASE substring
		//crea un substring de un string
		
		String frase = "hoy es un estupendo dia para aprender a programar en java";
		
		String frase_resumen=frase.substring(0, 29)+ "irnos a la playa y olvidarnos de todo..."+ " y "+
		frase.substring(29, 57);//el primer parametro donde empiexa y el segundo hasta donde llega sin contar ese lugar
		
		System.out.println(frase_resumen);
		
		
		
	}

}
