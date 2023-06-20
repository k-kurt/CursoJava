
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame {

	public MarcoCliente() {

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setVisible(true);
	}

}

class LaminaMarcoCliente extends JPanel {

	public LaminaMarcoCliente() {

		nick = new JTextField(5);

		add(nick);

		JLabel texto = new JLabel("--CHAT--");

		add(texto);

		ip = new JTextField(8);

		add(ip);

		campoChat = new JTextArea(12, 20);

		add(campoChat);

		campo1 = new JTextField(20);

		add(campo1);

		miboton = new JButton("Enviar");

		// importante, esto va antes de agregar el boton
		EnviaTexto enviarTexto = new EnviaTexto();

		miboton.addActionListener(enviarTexto);

		add(miboton);

	}

	private class EnviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// System.out.println(campo1.getText());

			// la excepcion es necesario para la clase

			try {

				Socket miSoclet = new Socket("192.168.1.3", 9999);
				

				//consigna2
				EnvioPaquetes paqueteDatos=new EnvioPaquetes();
				paqueteDatos.setNick(nick.getText());
				paqueteDatos.setIp(ip.getText());
				paqueteDatos.setMensaje(campo1.getText());


				//consigna 3

				ObjectOutputStream flujoDeDatos=new ObjectOutputStream(miSoclet.getOutputStream());//creamos el flujo
				flujoDeDatos.writeObject(paqueteDatos);//asiganamos el objecto al flujo de datos
				flujoDeDatos.close();



				/* 
				// creamos un campo de flujo de datos e indicar por donde va a circular(el
				// socket), enviamos por el socket los datos
				DataOutputStream flujo_salida = new DataOutputStream(miSoclet.getOutputStream());
				// guardamos el texto en el flujo de salida
				flujo_salida.writeUTF(campo1.getText());
				// hay que cerrar el flujo de salida
				flujo_salida.close();
				*/



			} catch (UnknownHostException e1) {

				// TODO: handle exception
				e1.getStackTrace();

			} catch (IOException e1) {
				// TODO: handle exception
				System.out.println(e1.getMessage());
			}

		}

	}

	private JTextField campo1, nick, ip;
	private JTextArea campoChat;

	private JButton miboton;

}


	//consigna1

class EnvioPaquetes {
	private String nick, ip, mensaje;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}