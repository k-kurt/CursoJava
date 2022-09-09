package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class video153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		escribiendo_archivo arc=new escribiendo_archivo();
		arc.escribiendo();
		
		
	}

}

class escribiendo_archivo{
	
	public void escribiendo() {
		
		String frase=new String("Probando la escritura en archivos3");
		try {
			FileWriter archivo=new FileWriter("C:/Users/genesis/Desktop/escritura_archivo.txt");//esto es para crear, con el true es para el existente
			//entonces agrega a lo que ya esta escrito
			//FileWriter archivo=new FileWriter("C:/Users/genesis/Desktop/escritura_archivo.txt",true);
			for(int i=0;i<frase.length();i++) {
				archivo.write(frase.charAt(i));
			}
			
			archivo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}