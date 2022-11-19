package video176sincronizacionThreadsVI;

import java.util.concurrent.locks.*;

public class video176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		banco b=new banco();
		for(int i=0;i<100;i++) {
			ejecucionTranferencia r=new ejecucionTranferencia(b, i, 2000);
			Thread t=new Thread(r);
			t.start();
		}
		
		
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
		
		cierreBanco.lock();//bloquea el hilo hasta que termine
		
		try {
		
		if(cuentas[cuentaOrigen]<cantidad) {//evalua que el saldo no sea inferior a la cantidad
			
			System.out.println("----------------------TRANSFERENCIA CANCELADA---CUENTA: "+cuentaOrigen+"----SALDO: "+ cuentas[cuentaOrigen]+"-----"+"-----a trasferir: "+ cantidad);
			
			return;
		}else {
			System.out.println("-------------CANTIDAD OK-----");
		}
		
		System.out.println(Thread.currentThread());//sentencia que nos indica que thread se esta ejecutando
		cuentas[cuentaOrigen]-=cantidad;//restamos la cantidad de la tranferencia
		System.out.printf("%10.2f de %d para %d",cantidad, cuentaOrigen,cuentaDestino);//la sentencia printf
		cuentas[cuentaDestino]+=cantidad;
		System.out.printf(" Saldo Total: %10.2f%n",getSaldoTotal());
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("----cuenta origen: "+cuentaOrigen+"---saldo de cuenta origen: "+cuentas[cuentaOrigen]+ "---------cuentaDEstino: "+cuentaDestino+"--saldo: "+cuentas[cuentaDestino]);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		
	}finally {//finally es que si hay exception o no va a suceder esto si o si
		cierreBanco.unlock();
	}
	}
	
	public double getSaldoTotal() {
		double suma_cuentas=0;
		for(double a:cuentas) {//recorremos el array cuentas
			suma_cuentas+=a;
		}
		return suma_cuentas;
	}
	
	private final double[] cuentas;
	
	private Lock cierreBanco=new ReentrantLock();
}




class ejecucionTranferencia implements Runnable{

	public ejecucionTranferencia(banco b,int de,double max) {
		banco=b;
		deLaCuenta= de;
		cantidadMax=max;
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {
		while(true) {
			int paraLaCuenta=(int)(100*Math.random());
			double cantidad=cantidadMax*Math.random();
			banco.tranferencia(deLaCuenta, paraLaCuenta, cantidad);
			Thread.sleep((int)Math.random()*10);
		}
	}catch (InterruptedException e) {
		// TODO: handle exception
	}
	}
	
	private banco banco;
	private int deLaCuenta;
	private double cantidadMax;
	
	
}


