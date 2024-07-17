/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.ubam.proyectodulces.servicios;

import mx.com.ubam.proyectodulces.clases.Producto;
import mx.com.ubam.proyectodulces.clases.Venta;

/**
 *
 * @author tibur
 */
public interface Vendible {
        void agregarProducto(Producto artI, int cantidad);
	Venta emitirVenta();
	void eliminarProducto(Producto artI);
	String getIdVenta();
}

