
package mx.com.ubam.proyectodulces.pruebas;

import java.util.ArrayList;
import java.util.Date;
import mx.com.ubam.proyectodulces.clases.Cliente;
import mx.com.ubam.proyectodulces.clases.DetalleVenta;
import mx.com.ubam.proyectodulces.clases.Dulce;
import mx.com.ubam.proyectodulces.clases.MotorVenta;
import mx.com.ubam.proyectodulces.clases.Producto;
import mx.com.ubam.proyectodulces.clases.Vendedor;
import mx.com.ubam.proyectodulces.clases.Venta;
import mx.com.ubam.proyectodulces.servicios.Vendible;

public class VentaTest {
    public static void main(String[] args) {
		Vendible motorVenta = new MotorVenta();
		//ICotizador cotizadorB = new Cotizador();
		
		test_emisionVenta(motorVenta);
		
		System.out.println("\n------------------------------\n");
		
		//test_emisionCotizacion(cotizadorB);

	}

	private static void test_emisionVenta(Vendible motorVenta) {
		System.out.println("Probando " + motorVenta.getIdVenta());
		motorVenta.agregarProducto(Producto.crearProducto("Dulce", "ricolino", "bolsita",15.20 , "fresa"), 7);
                motorVenta.agregarProducto(Producto.crearProducto("Dulce", "Vero", "Paleta",5.10 , "mango"), 2);
                motorVenta.agregarProducto(Producto.crearProducto("Dulce", "Marinela", "Paquete Galletas",16.35 , "Chocolate"), 3);
		Venta miVenta = motorVenta.emitirVenta();
		miVenta.mostrarVenta();
		
	}
}
