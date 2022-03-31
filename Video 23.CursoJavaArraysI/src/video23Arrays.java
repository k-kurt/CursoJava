
public class video23Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	int[] mi_array=new int[5];
		
		mi_array[0]=5;
		mi_array[1]=38;
		mi_array[2]=-15;
		mi_array[3]=92;
		mi_array[4]=71;
		
	
	*/
		
	
		//otra forma de declararlo
		
		int[] mi_array = {5,38,-15,92,71,5,4,34,34,43,34,343,434,3,45,54,6,546,45235,6,56,4};
		
		
		
		System.out.println(mi_array[0]);
		System.out.println(mi_array[1]);
		System.out.println(mi_array[2]);
		System.out.println(mi_array[3]);
		System.out.println(mi_array[4]);
		
		for(int i=0;i<5;i++) {
			System.out.println("el valor del indice: "+i+" es: "+mi_array[i]);
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		for(int j=0;j<mi_array.length;j++) {
			System.out.println("el valor delindice: "+j+" es: "+mi_array[j]);
		}
		
	}

}