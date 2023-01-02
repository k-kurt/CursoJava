import javax.swing.JOptionPane;

public class video24_bucleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array3=new String[5];
		
		/*String[] array2={"argentina","suecia","uruguay","brasil","venezuela"};
			
		
			for(int i=0;i<array2.length;i++) {
				System.out.println("el indice "+i+"tiene el valor "+array2[i]);
			}
		
			//FOR EACH o FOR MEJORADO
			for(String segundo_for:array2) {
				System.out.println(segundo_for);
			}
			
		*/
		
		
		for(int i=0;i<array3.length;i++) {
			array3[i]=JOptionPane.showInputDialog("Introduce el pais "+(i+1));
		}
		
		for(String j:array3) {
			System.out.println(j);
		}
		
	}

}
