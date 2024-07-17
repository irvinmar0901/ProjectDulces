package mx.com.ubam.proyectodulces.clases;

import java.util.Date;

/**
 *
 * @author tibur
 */
public class Dulce extends Producto{
   private String sabor;

	public Dulce(String marca, String presentacion, double precioBase, String sabor) {
		super(marca, presentacion, precioBase);
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return super.toString() + " " +
				"Dulce [sabor=" + sabor + "]";
	}
	@Override
	public String getTipo() {
		return "Dulce";
	}
    
}
