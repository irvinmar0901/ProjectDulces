package mx.com.ubam.proyectodulces.clases;

/**
 *
 * @author tibur
 */
public class DetalleVenta {
    private int numDetalleVenta;
    private int cantidad;
    private double importe;
    private String dulce;
    private String vendedor;
    private String cliente;

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

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getDulce() {
        return dulce;
    }

    public void setDulce(String dulce) {
        this.dulce = dulce;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public DetalleVenta(int numDetalleVenta, int cantidad, double importe, String dulce, String vendedor, String cliente) {
        this.numDetalleVenta = numDetalleVenta;
        this.cantidad = cantidad;
        this.importe = importe;
        this.dulce = dulce;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "numDetalleVenta=" + numDetalleVenta + ", cantidad=" + cantidad + ", importe=" + importe + ", dulce=" + dulce + ", vendedor=" + vendedor + ", cliente=" + cliente + '}';
    }
    
    

   
}
  
            
    