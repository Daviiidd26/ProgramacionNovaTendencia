package Interfaces;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VentanaProductos extends JPanel  {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textNºdeSerie;
	private JTextField textNombre;
	private JTextField textMarca;
	private JTextField textDescripcion;
	private JTextField textPrecio;
	private JComboBox cboTipo;
	private JTable table;
	private JScrollPane tbProducto;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_6;
	private JTextField textCantidad;
	private JButton btnQuitar;

	/**
	 * Create the frame.
	 */
	public VentanaProductos() {
		
		this.setBorder(new TitledBorder(null, "Registro de Productos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		this.setBounds(10, 11, 611, 550);
		setLayout(null);
		
		lblNewLabel = new JLabel("N\u00BA de serie:");
		lblNewLabel.setBounds(22, 21, 89, 14);
		this.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(22, 46, 66, 14);
		this.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Marca:");
		lblNewLabel_2.setBounds(22, 71, 46, 14);
		this.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_3.setBounds(22, 94, 89, 14);
		this.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Precio:");
		lblNewLabel_4.setBounds(22, 119, 46, 14);
		this.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Tipo:");
		lblNewLabel_5.setBounds(22, 144, 46, 14);
		this.add(lblNewLabel_5);
		
		textNºdeSerie = new JTextField();
		textNºdeSerie.setBounds(121, 18, 135, 20);
		this.add(textNºdeSerie);
		textNºdeSerie.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(121, 43, 135, 20);
		this.add(textNombre);
		textNombre.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(121, 68, 135, 20);
		this.add(textMarca);
		textMarca.setColumns(10);
		
		textDescripcion = new JTextField();
		textDescripcion.setBounds(121, 91, 135, 20);
		this.add(textDescripcion);
		textDescripcion.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(121, 116, 135, 20);
		this.add(textPrecio);
		textPrecio.setColumns(10);
		
		cboTipo = new JComboBox();
		cboTipo.setBounds(121, 140, 135, 22);
		this.add(cboTipo);
		
		tbProducto = new JScrollPane();
		tbProducto.setBounds(10, 227, 346, 105);
		add(tbProducto);
		
		table = new JTable();
		tbProducto.setViewportView(table);
		
		JButton  botonNuevo = new JButton("Nuevo");
		botonNuevo.setBounds(383, 26, 89, 23);
		add(botonNuevo);
		botonNuevo.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent arg0) {
	        	
	        	
	        	
	        }
	    });
		
		btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(383, 69, 89, 23);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Editar");
		btnNewButton_2.setBounds(383, 113, 89, 23);
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Cerrar");
		btnNewButton_3.setBounds(383, 162, 89, 23);
		add(btnNewButton_3);
		
		lblNewLabel_6 = new JLabel("Cantidad:");
		lblNewLabel_6.setBounds(273, 358, 66, 14);
		add(lblNewLabel_6);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(349, 355, 54, 20);
		textCantidad.setEnabled(false);
		add(textCantidad);
		textCantidad.setColumns(10);
		
		btnQuitar = new JButton("");
		btnQuitar.setBounds(406, 227, 47, 60);
		btnQuitar.setIcon(new ImageIcon(VentanaProductos.class.getResource("/img/002-cerrar.png")));
		add(btnQuitar);

	}
}
