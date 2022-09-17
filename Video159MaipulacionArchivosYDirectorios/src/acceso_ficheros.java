import java.io.File;

public class acceso_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta_carp_kevin=new File("C:/Users/Kevin/Desktop/Kevin");
		File ruta_carp_kevin_netbook=new File("C:/Users/genesis/desktop/Kevin");
		
		
		//File ruta_carp_kevin=new File("C:" + File.separator+"Users"+File.separator+"Kevin"+File.separator+"Desktop"+File.separator+"Kevin");
		//ESTO SE UTILIZA PARA QUE EL DIRECTORIO FUNCIONE PARA TODOS LOS SISTEMA OPERATIVOS.
		
		
		/*System.out.println(ruta_carp_kevin.exists());
		
		System.out.println(ruta_carp_kevin_netbook.exists());*/
		
		boolean pc=ruta_carp_kevin.exists();
		boolean net=ruta_carp_kevin_netbook.exists();
		
		System.out.println(pc);
		System.out.println(net);
		
		
		if(pc) {
			
			 nombre_archivos=ruta_carp_kevin.list();
		
		}else {
			nombre_archivos=ruta_carp_kevin_netbook.list();
		}
			
			
			
			
		
		//String[] nombre_archivos=ruta_carp_kevin.list();//le asignamos la lista de los nombres de archivos de la ruta al array
		
		for(int i=0;i<nombre_archivos.length;i++) {
			
			System.out.println(nombre_archivos[i]);
		
		//-------------------------------------------------------------------------
		if(pc) {
		leyendo_ficheros=new File(ruta_carp_kevin.getAbsoluteFile(),nombre_archivos[i]);
		}else {
			leyendo_ficheros=new File(ruta_carp_kevin_netbook.getAbsoluteFile(),nombre_archivos[i]);
		}
		if(leyendo_ficheros.isDirectory()){
			
			String[] archivos_subcarpetas=leyendo_ficheros.list();
				for(int j=0; j<archivos_subcarpetas.length;j++) {
					System.out.println(archivos_subcarpetas[j]);
				}
			
		}
		
		}
		
	}
	
		static String[] nombre_archivos;
		static File leyendo_ficheros;
}
