package leyendo;

import java.io.FileReader;
import java.io.IOException;

public class video152 {

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
			//int c = archivo.read();
			int c=0;//para poder leer el primer caracter sino no lo lee
			while (c != -1) {
				c = archivo.read();
				char letra = (char) c;// hacemos casting para mostrar los caracteres y no lo codigo unicode
				System.out.print(letra);

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