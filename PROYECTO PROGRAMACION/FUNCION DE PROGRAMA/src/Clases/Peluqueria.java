package Clases;

import java.util.ArrayList;

public class Peluqueria {
	private String nombre;
	private String contraseña;
	private ArrayList<Servicio> trabajoRealizado;
	private ArrayList<Producto> productos;
	private float dinero;
	public Peluqueria(ArrayList<Servicio> trabajoRealizado, ArrayList<Producto> productos, float dinero) {
		super();
		this.trabajoRealizado = trabajoRealizado;
		this.productos = productos;
		this.dinero = dinero;
	}
	public ArrayList<Servicio> getTrabajoRealizado() {
		return trabajoRealizado;
	}
	public void setTrabajoRealizado(ArrayList<Servicio> trabajoRealizado) {
		this.trabajoRealizado = trabajoRealizado;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public float getDinero() {
		return dinero;
	}
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	
	
}
