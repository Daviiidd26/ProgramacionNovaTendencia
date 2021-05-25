package Clases;

import java.util.ArrayList;

public class Servicio {

	private String nombre;
	private ArrayList<GastoProducto> productosUsados;
	private float precio;
	public Servicio(String nombre, ArrayList<GastoProducto> productosUsados, float precio) {
		super();
		this.nombre = nombre;
		this.productosUsados = productosUsados;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<GastoProducto> getProductosUsados() {
		return productosUsados;
	}
	public void setProductosUsados(ArrayList<GastoProducto> productosUsados) {
		this.productosUsados = productosUsados;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
