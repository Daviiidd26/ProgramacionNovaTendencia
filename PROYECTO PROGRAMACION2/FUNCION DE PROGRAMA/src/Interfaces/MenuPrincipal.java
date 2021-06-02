package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {

	private JPanel contenedorPrincipal;
	
	public static JDesktopPane escritorio;
	private JMenuItem cerrar;
	private JMenuItem producto;
	private JMenuItem gasprodducto;
	private JMenuItem ventasPeinados;
	private JMenu Sistemas;
	private JMenu productos;
	private JMenu Servicios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 452);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Administraci\u00F3n");
		setJMenuBar(menuBar);
		
		Sistemas = new JMenu("Sistemas");
		Sistemas.addActionListener(this);
		Sistemas.setMnemonic('S');
		menuBar.add(Sistemas);
		
		cerrar = new JMenuItem("Cerrar");
		cerrar.addActionListener(this);
		cerrar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/002-cerrar.png")));
		cerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, InputEvent.ALT_MASK));
		Sistemas.add(cerrar);
		
		productos = new JMenu("Productos");
		productos.addActionListener(this);
		productos.setMnemonic('P');
		menuBar.add(productos);
		
		producto = new JMenuItem("Producto");
		producto.addActionListener(this);
		producto.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/productos-cosmeticos.png")));
		producto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_MASK));
		productos.add(producto);
		
		Servicios = new JMenu("Servicios");
		Servicios.addActionListener(this);
		Servicios.setMnemonic('S');
		menuBar.add(Servicios);
		
		gasprodducto = new JMenuItem("Gasto producto");
		gasprodducto.addActionListener(this);
		gasprodducto.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/001-conversacion.png")));
		gasprodducto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		Servicios.add(gasprodducto);
		
		JMenu administracion = new JMenu("Administraci\u00F3n");
		administracion.setMnemonic('A');
		menuBar.add(administracion);
		
		ventasPeinados = new JMenuItem("Ventas y Peinados");
		ventasPeinados.addActionListener(this);
		ventasPeinados.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/003-fondos.png")));
		ventasPeinados.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		administracion.add(ventasPeinados);
		contenedorPrincipal =new VentanaProductos();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPrincipal);
		contenedorPrincipal.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Servicios) {
			actionPerformedServicios(e);
		}
		if (e.getSource() == productos) {
			actionPerformedProductos(e);
		}
		if (e.getSource() == Sistemas) {
			actionPerformedSistemas(e);
		}
		
	}

	
	/*ruteo de enlaces como: cerrar,productos,beneficios,etc*/
	
	
		
	protected void actionPerformedSistemas(ActionEvent e) {
	}
	
	
	protected void actionPerformedProductos(ActionEvent e) {
	}
	
	
	
	
	protected void actionPerformedServicios(ActionEvent e) {
	}
	
	
}
