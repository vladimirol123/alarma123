package controlador;



import java.awt.EventQueue;

import modelo.AlertaAlarma;
import vista.PantallaAlarma;



public class Alarma{

	
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
	
		//	public void run() {
				try {
					PantallaAlarma frame = new PantallaAlarma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
//			}
//		});
		 
	}

	
	
	
	

}
