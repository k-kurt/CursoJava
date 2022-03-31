package poo;

public interface jefes extends trabajadores {

	//no hace falta contruir constructores por que son staticos y da igual si estan o no 
	
	
	String tomar_decisiones(String decision);//asi se declara un metodo dentro de una interfaz, los metodos se definen pero no se desarrollan, no se implementan
	
	
	
	/*
	 * cuando implementamos una interfaz, tenemos que implementar tambien todos los
	 * metodos que esta interfaz tenga
	 */	
}
