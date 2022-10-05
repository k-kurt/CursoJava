package video166MetodosGenericos;

public class video166Parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String elementos2[] = { "jose", "maria", "anuel" };

		System.out.println(MisArrays2.getMenor(elementos2));

	}

}

class MisArrays2 {

	public static <T extends Comparable> T getMenor(T[] a) {
		
		if(a==null || a.length==0) {
			return null;
		}
		
		T elementoMenor=a[0];
		for(int i=1;i<a.length;i++) {
			if(elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}
		}
		
		return elementoMenor;
		
	}
}