package poo;

public class furgoneta extends coche {

	private int capacidad_peso;
	private int plazas_extras;

	public furgoneta(int capacidad_peso, int plazas_extras) {

		super();//SE USA LA PLABRA "SUPER" PARA LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE "COCHE".

		this.capacidad_peso = capacidad_peso;
		this.plazas_extras = plazas_extras;

	}
	
	
	public String dameDAtosFurgoneta() {
		
		
		return "plazas extras son: "+plazas_extras+"la capacidad de peso es: "+capacidad_peso;
	}

}
