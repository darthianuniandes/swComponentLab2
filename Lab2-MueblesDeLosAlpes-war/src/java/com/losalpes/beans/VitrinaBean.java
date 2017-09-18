/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.beans.utils.UtilJsf;
import com.losalpes.bos.Mueble;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.ServicioCatalogoMock;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ian
 */
@ManagedBean
@SessionScoped
public class VitrinaBean {
    
    private Mueble muebleSele;
    private List<Mueble> muebles;
    private List<Mueble> mueblesCompra;
    
    private IServicioCatalogo catalogo;

    public VitrinaBean() {
        catalogo = new ServicioCatalogoMock();
        muebles = catalogo.darMuebles();
        mueblesCompra = new ArrayList<Mueble>();
    }
    
    public void agregarMuebleCarrito(Mueble mueble) {
        mueblesCompra.add(mueble);
    }
    
    public void asignarMueblesCompra(List<Mueble> muebles) {
        mueblesCompra = muebles;
    }
    
    public void irCarrito() {
        CarritoBean carrito = UtilJsf.getBean();
        carrito.asignarMueblesCompra(mueblesCompra);
    }
    
    public Mueble getMuebleSele() {
        return muebleSele;
    }

    public void setMuebleSele(Mueble muebleSele) {
        this.muebleSele = muebleSele;
    }

    public List<Mueble> getMuebles() {
        return muebles;
    }

    public void setMuebles(List<Mueble> muebles) {
        this.muebles = muebles;
    }

    public List<Mueble> getMueblesCompra() {
        return mueblesCompra;
    }

    public void setMueblesCompra(List<Mueble> mueblesCompra) {
        this.mueblesCompra = mueblesCompra;
    }
}
