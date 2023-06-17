

import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);


		//para que este a la escucha el marco apenas iniciamos el programa
		//es un hilo que permite hacer todo esto en segundo plano
		Thread miThread=new Thread(this);
		miThread.start();
		
		}
	
	private	JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
	

		try {
			//ponemos a la escucha a la aplicacion con el puerto 9999  
			ServerSocket server=new ServerSocket(9999);
			//en un bucle infinito para poder abrir el puerto y aceptar la tranferencia de paquetes			
			while(true){
			Socket miServer=server.accept();

			//creamos el flujo de datos, el socket ya esta creado
			DataInputStream miInput= new DataInputStream(miServer.getInputStream());
			//guardamos en un string el texto  escrito en el cliente
			String text_mensaje=miInput.readUTF();
			//lo pegamos en el campo de texto del servidor
			areatexto.append("\n"+text_mensaje);
			miServer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		




	}

}