package Clases;

public class Producto {

	private float nDeSerie;
	private String marca;
	private String nombre;
	private String descripcion;
	private float precio;
	private float ph;
	public Producto(float nDeSerie, String marca, String nombre, String descripcion, float precio, float ph) {
		super();
		this.nDeSerie = nDeSerie;
		this.marca = marca;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.ph = ph;
	}
	public float getnDeSerie() {
		return nDeSerie;
	}
	public void setnDeSerie(float nDeSerie) {
		this.nDeSerie = nDeSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPh() {
		return ph;
	}
	public void setPh(float ph) {
		this.ph = ph;
	}
	
	
}
