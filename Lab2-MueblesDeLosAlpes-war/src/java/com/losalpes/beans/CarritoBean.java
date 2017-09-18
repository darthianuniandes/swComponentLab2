/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ian
 */
@ManagedBean
@SessionScoped
public class CarritoBean {
    
    private List<Mueble> mueblesCompra;

    public CarritoBean() {
    }
    
    public void asignarMueblesCompra(List<Mueble> muebles) {
        mueblesCompra = muebles;
    }

    public List<Mueble> getMueblesCompra() {
        return mueblesCompra;
    }
}
