/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.ubam.proyectodulces.catalogo;

import java.util.ArrayList;
import mx.com.ubam.proyectodulces.clases.Dulce;

/**
 *
 * @author force
 */
public class CatalogoDulces {
    public static ArrayList<Dulce> listaDulces = new ArrayList<Dulce>();
    
    private boolean agregarDefault(){
        return listaDulces.isEmpty();
    }
    public CatalogoDulces(){
        if(true == agregarDefault()){
        listaDulces.add(new Dulce("Sabritas" , "Chetos torciditos" , 15 , "Queso"));
        listaDulces.add(new Dulce("Ricolino" , "Paleta Payaso" , 15 , "Chocolate"));
        listaDulces.add(new Dulce("Vero" , "Paleta de Caramelo" , 6 , "Picante"));
        }
    }
    
    public static void agregarDulces(Dulce nuevoDulce){
        listaDulces.add(nuevoDulce);
    }
    public static ArrayList<Dulce> getCatalogoDulces() {
        return listaDulces;
    }
    public static void setCatalogoDulces(ArrayList<Dulce> catalogoDulces) {
        CatalogoDulces.listaDulces = catalogoDulces;
    }
}
