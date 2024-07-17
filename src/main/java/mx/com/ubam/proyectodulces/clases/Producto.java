
package mx.com.ubam.proyectodulces.clases;

import java.util.Date;

/**
 *
 * @author tibur
 */
public abstract class Producto {
	protected String marca;
	protected String presentacion;
	protected double precioBase;
	
	public Producto(String marca, String presentacion, double precioBase) {
		super();
		this.marca = marca;
		this.presentacion = presentacion;
		this.precioBase = precioBase;
	}
	
	//Factory Method
	public static Producto crearProducto(String tipo, String marca, String presentacion, 
			                              double precioBase, String sabor) {
		switch(tipo) {
		case "Dulce":
			return new Dulce(marca,presentacion,precioBase,sabor);
		
		}
		return null;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}


	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Articulo [marca=" + marca + ", presentacion=" + presentacion +  ", precioBase=" + precioBase
				+ "]";
	}

	public double vender(int cantidad) {
		double importeVendido = cantidad * this.precioBase;
		return importeVendido;
	}
	
	public abstract String getTipo();
	
}
