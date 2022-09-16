import java.io.File;

public class acceso_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta_carp_kevin=new File("C:/Users/Kevin/Desktop/Kevin");
		
		System.out.println(ruta_carp_kevin.exists());
		
		String[] nombre_archivos=ruta_carp_kevin.list();//le asignamos la lista de los nombres de archivos de la ruta al array
		
		for(int i=0;i<nombre_archivos.length;i++) {
			
			System.out.println(nombre_archivos[i]);
		
		//-------------------------------------------------------------------------
		
		File leyendo_ficehros=new File(ruta_carp_kevin.getAbsoluteFile(),nombre_archivos[i]);
		
		if(leyendo_ficehros.isDirectory()){
			
			String[] archivos_subcarpetas=leyendo_ficehros.list();
				for(int j=0; j<archivos_subcarpetas.length;j++) {
					System.out.println(archivos_subcarpetas[j]);
				}
			
		}
		
		}
		
	}

}
