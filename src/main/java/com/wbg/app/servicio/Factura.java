package com.wbg.app.servicio;

import com.wbg.app.dto.Persona;
import com.wbg.app.dto.Producto;

public class Factura {

	public void  getFactura(Persona persona, Producto producto) {
		System.out.println("cantidad deproducto = " + producto.getCantidadProducto());
		System.out.println("Valor venta = " + producto.getValorVenta());
		System.out.println("Nombre = " + persona.getNombre());

		double valorPagar = producto.getValorVenta() * producto.getCantidadProducto();
		System.out.println("valor pagar  = " + valorPagar);
		
	}

}
