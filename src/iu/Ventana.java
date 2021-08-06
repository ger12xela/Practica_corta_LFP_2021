package iu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import funcion.Funcion;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

	private JPanel contentPane;
	public JTextArea entrada;
	public JTextArea salida;
	public JButton identificar;
	Funcion funcion = new Funcion();

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 1};
		gbl_contentPane.rowHeights = new int[] {0, 0, 0, 3};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		entrada = new JTextArea();
		GridBagConstraints gbc_entrada = new GridBagConstraints();
		gbc_entrada.insets = new Insets(0, 0, 5, 0);
		gbc_entrada.fill = GridBagConstraints.BOTH;
		gbc_entrada.gridx = 0;
		gbc_entrada.gridy = 0;
		contentPane.add(entrada, gbc_entrada);
		
		identificar = new JButton("Identificar");
		GridBagConstraints gbc_identificar = new GridBagConstraints();
		gbc_identificar.insets = new Insets(0, 0, 5, 0);
		gbc_identificar.gridx = 0;
		gbc_identificar.gridy = 1;
		contentPane.add(identificar, gbc_identificar);
			identificar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					salida.setText("");
					salida.setText(funcion.paso1(entrada.getText()));
				}
			});
		
		salida = new JTextArea();
		GridBagConstraints gbc_salida = new GridBagConstraints();
		gbc_salida.fill = GridBagConstraints.BOTH;
		gbc_salida.gridx = 0;
		gbc_salida.gridy = 2;
		contentPane.add(salida, gbc_salida);
	}
}
