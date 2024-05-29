package com.wbg.app;

import com.wbg.app.dto.Persona;
import com.wbg.app.dto.Producto;
import com.wbg.app.servicio.Factura;

public class ExamenApp {
	public static void main(String[] args) {
		Producto producto = new Producto();
		producto.setCantidadProducto(4);
		producto.setValorVenta(10.0);

		Persona persona = new Persona();
		persona.setNombre("Carlos");

		Factura factura = new Factura();
		factura.getFactura(persona, producto);
		
	 
	}

}
