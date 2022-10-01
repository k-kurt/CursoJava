package video164;

import java.io.File;

public class video164_usoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		video164_arrayList archivos=new video164_arrayList(4);
		
		archivos.add("kevin");
		archivos.add("kurt");
		archivos.add("sboboda");
		archivos.add("soboda");
		archivos.add(new File("holaMundo.png"));//no da ningun error
		//cuando ejecutemos no dara error por que no puede guardar un objeto cuando espera un string
		//entonces es mejor que nos tire el error en tiempo de compilacion que en ejecucion
		//por eso es mejor la clase ArrayList por que tira error en tiempo de compilacion
		
		
		//no podemos alamcenar un variable string un objeto por eso el casting
		String nombrePersona=(String) archivos.get(2);
		
		System.out.println(nombrePersona);
		
		
		/*
		 * archivos.add(new File("gestion_pedidos.accedb")); File nombrePersona= (File)
		 * archivos.get(0); System.out.println(nombrePersona);
		 *///serviria para todo tipos de objetos
		
	}

}
