/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans.utils;

/**
 *
 * @author Melga
 */
public class ReporteVenta {
    private String nombre;
    private int cantidad;
    private int costo_unitario;
    private int costo_total;
    
    public ReporteVenta(String nombre, int costo_unitario){
        this.nombre = nombre;
        this.cantidad = 1;
        this.costo_unitario = costo_unitario;
        this.costo_total = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto_unitario() {
        return costo_unitario;
    }

    public void setCosto_unitario(int costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public float getCosto_total() {
        return this.costo_unitario * this.cantidad ;
    }
}
