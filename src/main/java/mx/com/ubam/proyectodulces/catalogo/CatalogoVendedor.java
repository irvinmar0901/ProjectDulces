/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.ubam.proyectodulces.catalogo;

import java.util.ArrayList;
import mx.com.ubam.proyectodulces.clases.Vendedor;

/**
 *
 * @author irvin
 */
public class CatalogoVendedor {
    public static ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
    
    public CatalogoVendedor(){
        listaVendedor.add(new Vendedor(1001 , "Irvin"));
        listaVendedor.add(new Vendedor(1002 , "Yaret"));
        listaVendedor.add(new Vendedor(1003 , "Luis"));
    }
    
    public static void agregarVendedor(Vendedor nuevoVendedor){
        listaVendedor.add(nuevoVendedor);
    }
    public static ArrayList<Vendedor> getCatalogoVendedor() {
        return listaVendedor;
    }
    public static void setCatalogoVendedor(ArrayList<Vendedor> catalogoVendedor) {
        CatalogoVendedor.listaVendedor = catalogoVendedor;
    }
}
