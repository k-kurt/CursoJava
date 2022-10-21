package video173BancoSinSincronizar;

public class video173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class banco{
	public banco() {
		cuentas = new double[100];
		
		for(int i=0;i<cuentas.length;i++) {
			cuentas[i]=2000;//cargamos cada elemento i del array cuentas con 2000
		}
		
	}
	
	public void tranferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {
		if(cuentas[cuentaOrigen]<cantidad) {//evalua que el saldo no sea inferior a la cantidad
			return;
		}
		System.out.println(Thread.currentThread());//sentencia que nos indica que thread se esta ejecutando
		cuentas[cuentaOrigen]-=cantidad;//restamos la cantidad de la tranferencia
		System.out.printf("%10.2f de %d para %d",cantidad, cuentaOrigen,cuentaDestino);//la sentencia printf
		cuentas[cuentaDestino]+=cantidad;
		System.out.printf(" Saldo Total: %10.2f/n",getSaldoTotal());
	}
	
	public double getSaldoTotal() {
		double suma_cuentas=0;
		for(double a:cuentas) {//recorremos el array cuentas
			suma_cuentas+=a;
		}
		return suma_cuentas;
	}
	
	private final double[] cuentas;
}