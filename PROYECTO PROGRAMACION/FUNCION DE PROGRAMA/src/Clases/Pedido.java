package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

	private LocalDate fechaPedido;
	private LocalDate fechaEntrega;
	private ArrayList<GastoProducto> procesoTrabajo;
	public Pedido(LocalDate fechaPedido, LocalDate fechaEntrega, ArrayList<GastoProducto> procesoTrabajo) {
		super();
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.procesoTrabajo = procesoTrabajo;
	}
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public ArrayList<GastoProducto> getProcesoTrabajo() {
		return procesoTrabajo;
	}
	public void setProcesoTrabajo(ArrayList<GastoProducto> procesoTrabajo) {
		this.procesoTrabajo = procesoTrabajo;
	}
	
	
}
