package mx.com.ubam.proyectodulces.clases;

/**
 *
 * @author tibur
 */
public class DetalleVenta {
    private int numDetalleVenta;
    private int cantidad;
    private Producto producto;
    private double importe;

    public int getNumDetalleVenta() {
        return numDetalleVenta;
    }

    public void setNumDetalleVenta(int numDetalleVenta) {
        this.numDetalleVenta = numDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

   

    public DetalleVenta(int numDetalleVenta, int cantidad, Producto producto) {
        this.numDetalleVenta = numDetalleVenta;
        this.cantidad = cantidad;
        this.producto = producto;
        
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "numDetalleVenta=" + numDetalleVenta + ", cantidad=" + cantidad + ", producto=" + producto +  '}';
    }
}
  
            
    