/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mithrandir
 */
public class Venta {
    
    private List<Mueble> muebles;
    
    private Date fechaVenta;
    
    private int valorTotal;
    
    private String formaPago;
    
    private String ciudad;

    public Venta(){
    
    }
    public Venta(List<Mueble> muebles, Date fechaVenta, int valorTotal, String formaPago, String ciudad) {
        this.muebles = muebles;
        this.fechaVenta = fechaVenta;
        this.valorTotal = valorTotal;
        this.formaPago = formaPago;
        this.ciudad = ciudad;
    }

    public List<Mueble> getMuebles() {
        return muebles;
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    
}
