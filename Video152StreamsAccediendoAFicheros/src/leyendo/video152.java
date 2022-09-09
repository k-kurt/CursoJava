package leyendo;


import java.io.FileReader;
import java.io.IOException;

public class video152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leer_ficheros accediendo=new leer_ficheros();
		accediendo.lee();
		
	}

}


class leer_ficheros{
	
	public void lee(){
		try {
		 archivo=new FileReader("C:/Users/genesis/Desktop/prueba.txt");
		 int c=archivo.read();
		 while(c!=-1) {
			 
			 c=archivo.read();
			 char letra=(char)c;//hacemos casting para mostrar los caracteres y no lo codigo unicode
			 System.out.println(letra);
			 
		 }
		}catch(IOException e) {
			System.out.println("No se encontro el archivo");
			
		}
	}
	
	
	FileReader archivo;
}