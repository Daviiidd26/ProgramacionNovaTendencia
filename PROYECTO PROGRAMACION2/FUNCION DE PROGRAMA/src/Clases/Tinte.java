package Clases;

import enums.ColoresTinte;

public class Tinte extends Producto {
	
	private ColoresTinte color;

	public Tinte(float nDeSerie, String marca, String nombre, String descripcion, float precio, float ph,
			ColoresTinte color) {
		super(nDeSerie, marca, nombre, descripcion, precio, ph);
		this.color = color;
	}

	public ColoresTinte getColor() {
		return color;
	}

	public void setColor(ColoresTinte color) {
		this.color = color;
	}
	
	

}
