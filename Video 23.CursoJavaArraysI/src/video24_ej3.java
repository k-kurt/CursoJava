import java.math.*;
public class video24_ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] array3=new int[150];
		
		for(int i=0;i<array3.length;i++){

			array3[i]=(int) Math.round(Math.random()*100);
		}
		
		
		for(int aleatorio:array3) {
			System.out.print(aleatorio+" , ");
		}
		
		
	}

}
