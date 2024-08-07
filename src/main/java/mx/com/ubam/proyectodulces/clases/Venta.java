
package mx.com.ubam.proyectodulces.clases;

import java.time.LocalDate;
import java.util.ArrayList;



public class Venta {
    private int numVenta;
    private LocalDate fechaVenta;
    private ArrayList<DetalleVenta> detalles;
    private Vendedor vendedor;
    private Cliente cliente;
    private double total;
    private int cant;

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    private static int nVenta = 0;
	

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

   

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
  /*  public Venta(){
                Venta.nVenta++;
		this.numVenta = Venta.nVenta;
                this.fechaVenta=fechaVenta;
                this.vendedor=vendedor;
                this.cliente=cliente;
                this.detalles = new ArrayList<>();
    }*/
     public Venta(LocalDate fechaVenta, Vendedor vendedor, Cliente cliente){
     Venta.nVenta++;
		this.numVenta = Venta.nVenta;
                this.fechaVenta=fechaVenta;
                this.vendedor=vendedor;
                this.cliente=cliente;
                this.detalles = new ArrayList<>();
                
     }
    public Venta(int numVenta, LocalDate fechaVenta, ArrayList<DetalleVenta> detalleVenta, Vendedor vendedor, Cliente cliente) {
        this.numVenta = numVenta;
        this.fechaVenta = fechaVenta;
        this.detalles = detalleVenta;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "numVenta=" + numVenta + ", fechaVenta=" + fechaVenta + ", detalles=" + detalles + ", vendedor=" + vendedor + ", cliente=" + cliente + ", total=" + total + '}';
    }

   
       
   /* public void agregarDetalle(Producto prod, int cant) {
                this.cant=cant;
		int nDetalle = this.detalles.size() + 1;
		DetalleVenta detVta = new DetalleVenta(nDetalle, cant, prod);
		this.detalles.add(detVta);
	}
    
    public void mostrarVenta(){
        System.out.println("======================================");
        System.out.println("Num Venta: " + this.numVenta);
        System.out.println("Fecha Venta: " + this.fechaVenta);
        System.out.println("Vendedor: " + this.vendedor.getNombreVendedor());
        System.out.println("Cliente: " + this.cliente.getNombreCliente());
        System.out.println("======================================");
        
      System.out.println("Num Detalle \t Producto \tTipo                \tPresentacion \t Sabor \tPrecio \tImporte");
		for(DetalleVenta detVta : this.detalles) {
			Producto prod = detVta.getProducto();
      System.out.println("        "+detVta.getNumDetalleVenta()+"  \t"+prod.getTipo()+"    \t"+prod.getMarca()+"\t" +prod.getPresentacion()+"      \t" +"  \t" +prod.getPrecioBase() + 
              "     \t" + prod.vender(this.cant));	
      
		}
		//String canTotal =
    }
*/
}
