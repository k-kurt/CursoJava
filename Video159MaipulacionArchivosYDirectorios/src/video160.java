import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class video160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//CREANDO
		
		/*
		 * File ruta=new File("C:/Users/genesis/desktop/Kevin/nuevo_directorio");
		 * 
		 * ruta.mkdir();//CREA UN NUEVO DIRECTORIO(CARPETA)
		 */		
		
		
		 File ruta=new File("C:/Users/genesis/desktop/Kevin/nuevo_directorio/nuevo_archivo.txt");
		 
		 String archivo_destino=ruta.getAbsolutePath();
		
		try {
			ruta.createNewFile(); //CREA SOLO SI NO EXISTE EL ARCHIVO
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Escribiendo accede_archivo_destino=new Escribiendo();
		
		accede_archivo_destino.Escribir(archivo_destino);
		
		
	}

}

class Escribiendo{
	
	public void Escribir(String archivo_destino) {
		
		String frase="Esto es un ejemplo, espero que salga!";
		
		try {
			FileWriter escritura=new FileWriter(archivo_destino);
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
