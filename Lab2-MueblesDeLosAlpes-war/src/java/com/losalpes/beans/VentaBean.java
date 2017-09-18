/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Venta;
import com.losalpes.servicios.IServicioVenta;
import com.losalpes.servicios.ServicioVentaMock;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mithrandir
 */
@ManagedBean(name ="ventaBean")
@SessionScoped
public class VentaBean {
    private Venta venta;
    private List<Venta> ventas;
    private IServicioVenta servicioVenta;

    public VentaBean() {
        this.venta = new Venta();
        this.servicioVenta = new ServicioVentaMock();
        this.ventas = servicioVenta.darVentas();
    }
    
    
    
    
    
    
}
