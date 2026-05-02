package com.inventario.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorInventarioTest {

	@Test
	void testAgregarStockPositvo() {
		GestorInventario gestor = new GestorInventario();
		gestor.agregarStock(10);
		assertEquals(10, gestor.getStock(), "El Stock deberia de ser 10");
	}
	
	@Test
	void testCalcularValorTotal() {
		GestorInventario gestor = new GestorInventario();
		gestor.agregarStock(5);
		assertEquals(50.0, gestor.calcularValorTotal(), "El valor deberia de ser 50.0");
	}
	
	@Test
	void testAgregarStockNegativo() {
		GestorInventario gestor = new GestorInventario();
		gestor.agregarStock(-5);
		assertEquals(0, gestor.getStock(), "El Stock no deberia de ser negativo");
	}

}
