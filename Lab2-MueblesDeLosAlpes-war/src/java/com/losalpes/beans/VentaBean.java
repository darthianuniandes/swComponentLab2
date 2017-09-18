/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.beans.utils.UtilJsf;
import com.losalpes.bos.Mueble;
import com.losalpes.bos.Venta;
import com.losalpes.servicios.IServicioVenta;
import com.losalpes.servicios.ServicioVentaMock;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ian
 */
@ManagedBean
@SessionScoped
public class VentaBean {
    
    private IServicioVenta servicioVenta;
    
    private Venta venta;
    
    private List<Mueble> mueblesCompra;

    public VentaBean() {
        venta = new Venta();
        servicioVenta = new ServicioVentaMock();
    }
    
    public void registrarVenta() {
        Venta venta = new Venta(mueblesCompra, new Date(), obtenerValorCompra(), this.venta.getFormaPago(), this.venta.getCiudad());
        
        servicioVenta.registrarVenta(venta);
    }
    
    public void asignarMueblesCompra(List<Mueble> muebles) {
        mueblesCompra = muebles;
    }
    
    public void reiniciar() {
        VitrinaBean vitrina = UtilJsf.getBeanVitrina();
        vitrina.reinciar();
    }

    public Integer obtenerValorCompra() {
        Integer total = 0;
        for (Mueble mueble : mueblesCompra) {
            total += mueble.getPrecio();
        }
        return total;
    }
    
    public List<Mueble> getMueblesCompra() {
        return mueblesCompra;
    }
    
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}
