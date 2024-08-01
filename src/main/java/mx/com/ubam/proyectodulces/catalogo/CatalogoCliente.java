/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.ubam.proyectodulces.catalogo;

import java.util.ArrayList;
import mx.com.ubam.proyectodulces.clases.Cliente;

/**
 *
 * @author irvin
 */
public class CatalogoCliente {
    public static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    
    private boolean agregarDefault(){
        return listaCliente.isEmpty();
    }
    
    public CatalogoCliente(){
        if(true == agregarDefault()){
        listaCliente.add(new Cliente(1001 , "Jesus Jimenez" ));
        listaCliente.add(new Cliente(1002 , "Venado Martinez"));
        listaCliente.add(new Cliente(1002 , "Edwin Ramirez"));
        }
    }
    
    public static void agregarCliente(Cliente nuevoCliente){
        listaCliente.add(nuevoCliente);
    }
    public static ArrayList<Cliente> getCatalogoClientes() {
        return listaCliente;
    }
    public static void setCatalogoDulces(ArrayList<Cliente> catalogoClientes) {
        CatalogoCliente.listaCliente = catalogoClientes;
    }
}
