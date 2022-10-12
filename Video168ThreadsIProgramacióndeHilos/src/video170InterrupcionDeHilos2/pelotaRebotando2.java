package video170InterrupcionDeHilos2;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class pelotaRebotando2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco = new MarcoRebote2();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

}

class pelotaHilos implements Runnable {

	public pelotaHilos(Pelota unaPelota, Component unComponente) {

		pelota = unaPelota;
		componente = unComponente;
	}

	public void run() {
		
		System.out.println(Thread.currentThread().isInterrupted()+"Esta interrupido? al comenzar");
		
		
		//for (int i = 1; i <= 1500; i++) {

		//while(!Thread.interrupted()) {
		
		while(!Thread.currentThread().isInterrupted()) {
			pelota.mueve_pelota(componente.getBounds());

			componente.paint(componente.getGraphics());

			
			  try { Thread.sleep(4);// hace una pausa en el hilo de ejecucion
			  } catch(InterruptedException e) { // TODO Auto-generated catch block
			  System.out.println("Hilo bloqueado. Imposible su interrupcion");
			  //System.exit(0);//intentamos salir pero se podria hacer otras cosas cuando se intenta interrunpir un hilo 
			 
			  Thread.currentThread().interrupt(); //interrumpe solo el ultimo hilo
			 
			  }
			
			
			

			
			
		}
		
		System.out.println(Thread.currentThread().isInterrupted()+"Esta interrupido? al terminar");
		
	}

	private Pelota pelota;
	private Component componente;

}

// Movimiento de la
// pelota-----------------------------------------------------------------------------------------

class Pelota {

	// Mueve la pelota invirtiendo posición si choca con límites

	public void mueve_pelota(Rectangle2D limites) {

		x += dx;

		y += dy;

		if (x < limites.getMinX()) {

			x = limites.getMinX();

			dx = -dx;
		}

		if (x + TAMX >= limites.getMaxX()) {

			x = limites.getMaxX() - TAMX;

			dx = -dx;
		}

		if (y < limites.getMinY()) {

			y = limites.getMinY();

			dy = -dy;
		}

		if (y + TAMY >= limites.getMaxY()) {

			y = limites.getMaxY() - TAMY;

			dy = -dy;

		}

	}

	// Forma de la pelota en su posición inicial

	public Ellipse2D getShape() {

		return new Ellipse2D.Double(x, y, TAMX, TAMY);

	}

	private static final int TAMX = 15;

	private static final int TAMY = 15;

	private double x = 0;

	private double y = 0;

	private double dx = 1;

	private double dy = 1;

}

// Lámina que dibuja las
// pelotas----------------------------------------------------------------------

class LaminaPelota2 extends JPanel {

	// Añadimos pelota a la lámina

	public void add(Pelota b) {

		pelotas.add(b);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for (Pelota b : pelotas) {

			g2.fill(b.getShape());
		}

	}

	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
}

// Marco con lámina y
// botones------------------------------------------------------------------------------

class MarcoRebote2 extends JFrame {

	public MarcoRebote2() {

		setBounds(600, 300, 600, 350);

		setTitle("Rebotes");

		lamina = new LaminaPelota2();

		add(lamina, BorderLayout.CENTER);

		JPanel laminaBotones2 = new JPanel();

		
		arranca1=new JButton("Hilo 1");
		arranca1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				comienza_el_juego2(evento);
			}
			
		});
		laminaBotones2.add(arranca1);
		
		
		//-------------------------------------------------------------------
		arranca2=new JButton("Hilo 2");
		arranca2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				comienza_el_juego2(evento);
			}
			
		});
		laminaBotones2.add(arranca2);
		
		
		//-------------------------------------------------------------------
		arranca3=new JButton("Hilo 3");
		arranca3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				comienza_el_juego2(evento);
			}
			
		});
		
		laminaBotones2.add(arranca3);
		
		//-------------------------------------------------------------------
		
		detener1=new JButton("Detener 1");
		detener1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				detener2(evento);
			}
		});
		
		laminaBotones2.add(detener1);
		
		//-------------------------------------------------------------------
		detener2=new JButton("Detener 2");
		detener2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				detener2(evento);
			}
		});
		
		laminaBotones2.add(detener2);
		//-------------------------------------------------------------------
		detener3=new JButton("Detener 3");
		detener3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				detener2(evento);
			}
		});
		
		laminaBotones2.add(detener3);
		//-------------------------------------------------------------------

		
		add(laminaBotones2, BorderLayout.SOUTH);
	}

	

	// Añade pelota y la bota 1000 veces

	public void comienza_el_juego2(ActionEvent e) {

		Pelota pelota = new Pelota();

		lamina.add(pelota);

		// instanciamos para hacer el uso de multiples hilos de ejecucion
		Runnable r = new pelotaHilos(pelota, lamina);
	
		if(e.getSource().equals(arranca1)) {
		
		t1 = new Thread(r);
		t1.start();

		}else if(e.getSource().equals(arranca2)) {
			t2=new Thread(r);
			t2.start();
		}else if(e.getSource().equals(arranca3)) {
			t3=new Thread(r);
			t3.start();
		}
	}

	public void detener2(ActionEvent e) {

		// t.stop(); OBSOLETO
		
		
		if(e.getSource().equals(detener1)) {
		t1.interrupt();
		}else if(e.getSource().equals(detener2)) {
			t2.interrupt();
		}else if(e.getSource().equals(detener3)) {
			t3.interrupt();
		}
		
			
	}

	Thread t1,t2,t3;
	JButton arranca1,arranca2,arranca3,detener1,detener2,detener3;
	
	private LaminaPelota2 lamina;

}
