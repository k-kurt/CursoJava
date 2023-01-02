package video171SincronizandoHilos;

public class video171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		hilosVarios hilo1=new hilosVarios();
		hilosVarios hilo2=new hilosVarios();
		hilo1.start();
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hilo2.start();
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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