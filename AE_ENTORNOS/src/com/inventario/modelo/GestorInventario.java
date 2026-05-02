package com.inventario.modelo;

public class GestorInventario {
	private int stock = 0;
	private double precioUnitario = 10.0;
	
	public void agregarStock(int cantidad) {
		if (cantidad > 0) {
			this.stock += cantidad;
		}
	}
	
	public double calcularValorTotal() {
		return this.stock * this.precioUnitario;
	}
	
	public int getStock() {
		return this.stock;
	}
	
}
