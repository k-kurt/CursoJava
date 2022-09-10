package buffers_leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class video154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leer_ficheros accediendo = new leer_ficheros();
		accediendo.lee();

	}
 
}

class leer_ficheros {

	public void lee() {
		try {
			archivo = new FileReader("C:/Users/genesis/Desktop/prueba.txt");
			BufferedReader mibuffer=new BufferedReader(archivo);//guardamos el archivo en un buffer
			String linea="";
			
			while (linea!=null) {
				
				linea=mibuffer.readLine();
				
				if(linea!=null)//para que no imprima el null
				System.out.println(linea);

			}

			// archivo.close();
			/*
			 * Se puede aca pero si queremos usar el finally tenemos que hacerlo mas abajo
			 */

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");

		} finally {
			try {
				archivo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				/*
				 * no es realmente necesario el finally ya que el codigo permite que el archivo
				 * si va todo bien podamos cerrarlo fuera del while y sino salta realemente al
				 * catch entonces no se abre el archivo
				 */
			}
		}
	}

	FileReader archivo;
}