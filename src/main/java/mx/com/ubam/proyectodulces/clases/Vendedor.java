
package mx.com.ubam.proyectodulces.clases;

/**
 *
 * @author tibur
 */
public class Vendedor {
    private int idVendedor;
    private String nombreVendedor;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String vendedor) {
        this.nombreVendedor = vendedor;
    }

    public Vendedor(int idVendedor, String vendedor , String password) {
        this.idVendedor = idVendedor;
        this.nombreVendedor = vendedor;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "idVendedor=" + idVendedor + ", vendedor=" + nombreVendedor + ", password= " + password + '}';
    }
    
}
