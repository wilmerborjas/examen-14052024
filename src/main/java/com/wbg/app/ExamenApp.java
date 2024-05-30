package com.wbg.app;

import com.wbg.app.dto.Persona;
import com.wbg.app.dto.Producto;
import com.wbg.app.servicio.Factura;

public class ExamenApp {
	public static void main(String[] args) {
		Producto producto = new Producto();
		producto.setCantidadProducto(4);
		producto.setValorVenta(100.0);
		producto.setNombre("Celular");

		Persona persona = new Persona();
		persona.setNombre("Robin");
		persona.setApellido("Arellano");

		Factura factura = new Factura();
		double valorPagar = factura.getFactura(persona, producto);

		double valorPagado = 450.0;
		System.out.println("valor pagado = " + valorPagado);

		if (valorPagado >= valorPagar) {
			double cambio = valorPagado - valorPagar;
			System.out.println("cambio = " + cambio);
			System.out.println("gracias por su compra vuelva pronto ... ");
		} else {
			double saldoPendiente = valorPagar - valorPagado;
			System.out.println("saldo pendiente = " + saldoPendiente);

		}

	}

}
