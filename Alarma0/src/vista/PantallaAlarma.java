package vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.AlertaAlarma;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class PantallaAlarma extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	


	public PantallaAlarma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HORA");
		lblNewLabel.setBounds(28, 79, 94, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MINUTO");
		lblNewLabel_1.setBounds(28, 134, 94, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(208, 80, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(208, 135, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlertaAlarma v = new AlertaAlarma();
				
				Object hora=textField.getText(); 
				Object min=textField_1.getText();
				
				Object h= hora;
				Object m = min;
			    System.out.println(h +" "+m);
			    
		
				v.CrearAlarma(h,m,0, "PM");
			
				//JOptionPane.showMessageDialog(null, "ALARMA DE TRABAJO");
			
			}
		});
		btnNewButton.setBounds(156, 196, 89, 23);
		contentPane.add(btnNewButton);
		
		

		
	}

	

	
}
