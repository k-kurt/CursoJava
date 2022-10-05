package video166MetodosGenericos;

public class video166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String elementos[]= {"jose","maria","anuel"};
		
		
		
	}

}


class MisArrays{
	
	
	public static <T> String getElementos(T []a){
		return "el array tiene " + a.length+ " elementos";
	}
}