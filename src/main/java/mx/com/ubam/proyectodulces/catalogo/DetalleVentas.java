/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.ubam.proyectodulces.catalogo;

import java.util.ArrayList;
import mx.com.ubam.proyectodulces.clases.DetalleVenta;

/**
 *
 * @author force
 */
public class DetalleVentas {
    public static ArrayList<DetalleVenta> detalleVenta = new ArrayList<DetalleVenta>();
    
    public static void agregarDetalleVenta(DetalleVenta nuevaVenta){
        detalleVenta.add(nuevaVenta);
    }
    public static ArrayList<DetalleVenta> getDetalleVenta(){
        return detalleVenta;
    }
    public static void setDetalleVenta(ArrayList<DetalleVenta> detalleVenta){
        DetalleVentas.detalleVenta = detalleVenta;
    }
}
