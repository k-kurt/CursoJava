import java.util.*;
public class video19_ejemploIIbucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//juego de adivinar el numero
		
		
		
		//aplicacmos refundicion cambiando el double en un entero
		
		
		
		
		
		
		int aleatorio=(int)(Math.random()*100);//aplicamos refundicion para convertir un tipo de dato en otro
		
		
		//System.out.println(aleatorio/*Math.random()*100*/);//el *100 es para que se corra la coma dos lugares a la derecha
		
		Scanner entrada = new Scanner(System.in);
		
		
		  int numero = 0;
		  
		  int intentos=0;
		  
		 
		  
		 while(numero!=aleatorio) {
			
//			 System.out.println(aleatorio);
			 intentos++;
			 System.out.println("elegi un numero");
			  
			 numero = entrada.nextInt();	
			 
			 if(aleatorio<numero) {
				 System.out.println("el aleatorio es menor");
			 }else if(aleatorio>numero) {
				 System.out.println("el aleatorio es mayor");
			 }
			 
		 }
		 
		System.out.println("perfecto! acertaste en el intento numero: "+intentos+".");
			
	}

}
