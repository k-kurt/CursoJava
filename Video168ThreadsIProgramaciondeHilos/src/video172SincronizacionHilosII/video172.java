package video172SincronizacionHilosII;

public class video172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		hilosVarios hilo1=new hilosVarios();
		hilosVarios2 hilo2=new hilosVarios2(hilo1);//esto permite por el contructor de la clase, que se empiece primero por el que pasamos como parametro
		hilo2.start();
		hilo1.start();
		
		
		System.out.println("tareas terminadas");
		
	}

}


class hilosVarios extends Thread{
	
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Ejecutando hilos "+getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}



class hilosVarios2 extends Thread{
	public hilosVarios2(Thread hilo) {
		this.hilo=hilo;
	}
	public void run() {
		
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Imprimiendo hilos "+ getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private Thread hilo;
	
}