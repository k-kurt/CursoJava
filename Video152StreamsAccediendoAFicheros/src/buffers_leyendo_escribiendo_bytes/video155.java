package buffers_leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class video155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;

		int datos_entrada[] = new int[37204];

		try {
			FileInputStream leyendo_archivo = new FileInputStream("C:/Users/genesis/Desktop/video 22.png");
			boolean final_arc = false;
			while (!final_arc) {
				int byte_final = leyendo_archivo.read();
				
				if(byte_final!=-1) {
					datos_entrada[contador]=byte_final;
				}else {
					final_arc = true;
	
				}
			
				System.out.println(datos_entrada[contador]);
				contador++;
			}

			leyendo_archivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(contador);
	}

}

//leyendo la informcion de la imagen