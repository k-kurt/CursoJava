import java.util.*;
public class video20_bucleDoWhile {

	public static void main(String[] args) {
		
		
		//juego de acertar el numero pero con el Do While
		
		int aleatorio = (int)(Math.random()*100);//aca generamos el numero ramdon,moviendo la coma dos lugares
		// y acortamos el numero haciendo refundicion
		
		Scanner cr = new Scanner(System.in);
		
		int numero_ingresado = 0;
		
		int intentos = 0;
		
		System.out.println("**************************************\n"+"BIENVENIDO AL JUEGO DE AZAR\n"+"**************************************\n"+"Acierte al numero generado aleatoriamente desde 0 al 100\n");
		
		do {
				
		intentos++;
		
		System.out.println("INGRESE UN NUMERO DESDE EL 0 AL 100\n");
		
		numero_ingresado = cr.nextInt();
		
		if(numero_ingresado<aleatorio) {
			
			System.out.println("el numero buscado es mas alto");
		}else if(numero_ingresado > aleatorio) {
			System.out.println("el numero buscado es mas chico");
		}
		
		}while(numero_ingresado!=aleatorio);
		
		System.out.println("Correcto! acertaste en el intento numero: "+intentos);
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
