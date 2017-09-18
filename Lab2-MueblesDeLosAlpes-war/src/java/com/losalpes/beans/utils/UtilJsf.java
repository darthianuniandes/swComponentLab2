/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans.utils;

import com.losalpes.beans.CarritoBean;
import com.losalpes.beans.VentaBean;
import com.losalpes.beans.VitrinaBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author ian
 */
public class UtilJsf {
    
    /***
    * Permite obtener una instancia de un backing bean determinado a traves del
    * nombre del mismo.
    * 
    * @param nombre
    * @return
    */
    @SuppressWarnings("unchecked")
    public static <T> T obtenerBackingBean(String nombre) {
        FacesContext context = FacesContext.getCurrentInstance();
        return (T) context.getApplication().evaluateExpressionGet(context, expresionEl(nombre), Object.class);
    }

    public static String expresionEl(String texto) {
        if (texto!= null && texto.equals(""))
            return "";
        StringBuilder retorno = new StringBuilder("#{");
        retorno.append(texto);
        retorno.append("}");
        return retorno.toString();
    }

    public static CarritoBean getBeanCarrito() {
        return UtilJsf.obtenerBackingBean("carritoBean");
    }
    
    public static VentaBean getBeanVenta() {
        return UtilJsf.obtenerBackingBean("ventaBean");
    }
    
    public static VitrinaBean getBeanVitrina() {
        return UtilJsf.obtenerBackingBean("vitrinaBean");
    }

    public static void navegar(String accion) {
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getApplication().getNavigationHandler().handleNavigation(fc, null, accion);
    }

}
