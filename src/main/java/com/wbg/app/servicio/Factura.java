package com.wbg.app.servicio;

import com.wbg.app.dto.Persona;
import com.wbg.app.dto.Producto;

public class Factura {

	public double getFactura(Persona persona, Producto producto) {
		System.out.println("Nombre = " + persona.getNombre());
		System.out.println("apellido = " + persona.getApellido());
		System.out.println("producto = " + producto.getNombre());
		System.out.println("cantidad deproducto = " + producto.getCantidadProducto());
		System.out.println("valor unitario = " + producto.getValorVenta());
		

		double valorPagar = producto.getValorVenta() * producto.getCantidadProducto();
		System.out.println("valor pagar  = " + valorPagar);

		if (persona.getNombre().equals("Robin") & persona.getApellido().equals("Arellano")) {
			double descuento = valorPagar * 0.20;
			valorPagar = valorPagar - descuento;

			System.out.println("valor a pagar para cliente preferencial Robin = " + valorPagar);

		}
		if (producto.getNombre().equals("Iphone") || persona.getNombre().equals("Wilmer")) {
			double descuento = valorPagar * 0.10;
			valorPagar = valorPagar-descuento;
			System.out.println("valor a pagar con descuento al cliente no preferencial  Wilmer");
			

		}
		return valorPagar;
		
	}

}
