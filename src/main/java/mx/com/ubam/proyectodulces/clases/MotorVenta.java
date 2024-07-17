
package mx.com.ubam.proyectodulces.clases;
import java.time.LocalDate;
import java.util.ArrayList;
import mx.com.ubam.proyectodulces.servicios.Vendible;

/**
 *
 * @author tibur
 */
public class MotorVenta implements Vendible{
   private ArrayList<Producto> lstProductos;
   private ArrayList<Integer> lstCantidades;

	public MotorVenta() {
		super();
		this.lstProductos = new ArrayList<>();
		this.lstCantidades = new ArrayList<>();
	}
	
   @Override
	public void agregarProducto(Producto artI, int cantidad) {
		this.lstProductos.add(artI);
		this.lstCantidades.add(cantidad);
	}
	
	/*public void desplegarVenta() {
		double total = 0;
		System.out.printf(" Cant. %15s %20s %10s\n", "Articulo", "Precio", "Total");
		for(int i=0; i<this.lstProductos.size(); i++) {
			Producto artI = this.lstProductos.get(i);
			int cantI = this.lstCantidades.get(i);
			double totArtVendidos = artI.vender(cantI);
			total += totArtVendidos;
			
			System.out.println(String.format("%5d ",cantI)
					         + String.format("%-30s",artI.getTipo() + " " + artI.getMarca() + " " +artI.getPresentacion())
					         + String.format(" %8.2f", artI.getPrecioBase())
					         + String.format(" %10.2f", totArtVendidos)
					         );
		}
		String cadTotal = String.format("%12.2f",total);
		System.out.println(String.format("%56s", cadTotal));
	}*/
	
   @Override
	public Venta emitirVenta(){
		double total = 0;
		Venta venta = new Venta(LocalDate.now(), new Vendedor(1,"Royer"), new Cliente(2,"Juan"));
		//venta.setFechaVenta(LocalDate.now());
//		System.out.printf(" Cant. %15s %20s %10s\n", "Articulo", "Precio", "Total");
		for(int i=0; i<this.lstProductos.size(); i++) {
			Producto artI = this.lstProductos.get(i);
			int cantI = this.lstCantidades.get(i);
			double totArtVendido = artI.vender(cantI);
			total += totArtVendido;
			
			venta.agregarDetalle(artI, cantI);
		}
		venta.setTotal(total);
		return venta;
	}

	@Override
	public void eliminarProducto(Producto artI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdVenta() {
		return this.getClass().getName();
	}
    
}
