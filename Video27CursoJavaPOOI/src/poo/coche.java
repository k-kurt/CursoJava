package poo;

public class coche {

	private int rueda;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
	
	
	public coche() {
		
		rueda=4;
		 largo=2000;
		 ancho=300;
		 motor=1600;
		 peso_plataforma=500;
		
	}
	
	public String dime_datos_generales() {
		
		return "el vehiculo tiene "+ rueda+ "ruedas "+ " con un largo de "+largo/1000+ " metros y con un ancho de "+ancho+" cm "
				+ " y el peso de la plataforma es "+peso_plataforma+" kg";
	
	}

	public void poner_color(String color_coche) {
	 //color= "azul";  	lo comentamos por que ahora vamos a pasar parametros
		
		color=color_coche;
	}
	
	public String dime_color() {
	return "el color es: "+color;
	}
	
	public void configurar_asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else{
			this.asientos_cuero=false;
		}
		
	}
	
	
	public String dime_asientos() {
		 if(asientos_cuero==true) {
			return "el coche tiene asientos de cuero";
		}else {
			return "el coche tiene asientos de serie";
		}
	}
	
	public String dime_si_tiene_climatizador() {
		
		if(climatizador==true) {
			return "el auto tiene climatizador";
			
		}else {
			return "el auto tiene aire acondicionado";
		}
		
	}
	
	public void configuracion_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	
	
	//VAMOS A HACER UN METODO QUE ES UN GETTER Y SETTER PERO NO ES MUY RECOMENDADO HACERLO
	
	public String dime_peso_coche() {
		int peso_carroceria= 500;
		
		 peso_total= peso_plataforma+peso_carroceria;//establece un valor en una variable
		
		 if(asientos_cuero==true) {
			 peso_total=peso_total+50;
		 }
		 if(climatizador==true) {
			 peso_total=peso_total+20;
		 }
		 
		 return "el peso total del vehiculo es: "+peso_total;//obtiene un dato
		
	}
	
	
	public int precio_coche() {//GETTER 
		
		int precio_final=10000;
		
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			
			precio_final+=1500;
		}
		
		return precio_final;
		
	}
	
	

	}


