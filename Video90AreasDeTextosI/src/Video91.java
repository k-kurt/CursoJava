
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Video91 {

	public static void main(String[] args) {
		// VAMOS A AGREGAR UN LAYOUT EN EL PROPIO MARCO SIN AGREGAR LAMINA
				marcoLayout marco=new marcoLayout();
				marco.setVisible(true);
				marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
			}
		}


		class marcoLayout extends JFrame{	
			
			public marcoLayout() {
				setTitle("video 91, como lo hace el profe");
				setBounds(100,100,800,500);
				setLayout(new BorderLayout());
				
		
				 cuadro1=new JTextArea(10,30);
				 laminaConBarras =new JScrollPane(cuadro1);
	
				 
				add(laminaConBarras, BorderLayout.CENTER);
				
				JPanel lamina2=new JPanel();
				lamina2.setLayout(new GridLayout(1,2));
				
				 agregar=new JButton("AGREGAR");
				agregar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						cuadro1.append("Este es el texto que vamos a agregar en el documento");
					}
					
				}); 
				
				
				 activar=new JButton("ACTIVAR/DESACTIVAR");
				activar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
				
						boolean saltar=!cuadro1.getLineWrap();
						cuadro1.setLineWrap(saltar);
						
						if(saltar) {
							activar.setText("Quitar salto");
						}else {
							activar.setText("Activar salto");
						}
						
					}
				});
				 
				lamina2.add(agregar);
			
				lamina2.add(activar);
				
				add(lamina2,BorderLayout.SOUTH);
				
				
				
				
				
			}
			
			private JButton agregar, activar;
			private JTextArea cuadro1;
			private JScrollPane laminaConBarras;
			
			
	
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
//		marcoAreaII marco=new marcoAreaII();
//		marco.setVisible(true);
//		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//}
//
//
//class marcoAreaII extends JFrame{
//	public marcoAreaII() {
//		setTitle("Video 91");
//		setBounds(100, 100, 800, 500);
//		panel91 lamina=new panel91();
//		add(lamina);
//	}
//}
//
//class panel91 extends JPanel{
//	public panel91(){
//		setLayout(new BorderLayout());
//		
//		
//		cuadro=new JTextArea(5,5);
//		
//		JScrollPane cuadroSC=new JScrollPane(cuadro);
//		
//		add(cuadroSC, BorderLayout.CENTER);
//	
//		
//		JPanel lamina2=new JPanel();
//		lamina2.setLayout(new GridLayout(1,2));
//		
//		texto=new JButton("Agregar Texto");
//		activar=new JButton("Activar/Desactivar");
//	
//		lamina2.add(texto);
//		lamina2.add(activar);
//		
//		add(lamina2,BorderLayout.SOUTH);
//		
//	}
//	
//	
//	
//	
//	private JTextArea cuadro;
//	private JButton texto;
//	private JButton activar;
//}




