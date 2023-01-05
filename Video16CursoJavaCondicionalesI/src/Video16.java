import java.util.Scanner;

public class Video16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ingrese su edad");
		
		int edad = sc.nextInt();
		/*
		 * if(edad >= 18) { System.out.println("ya eres mayor"); }else {
		 * System.out.println("no eres mayor"); }
		 */
		
		if (edad <18) {
			System.out.println("eres un adolecente");
		}else if(edad<40) {
			System.out.println("eres joven");
		}else if(edad < 65) {
			System.out.println("eres maduro");
		}else {
			System.out.println("cuidate");
		}
		
		
		
		
		
	}

}
