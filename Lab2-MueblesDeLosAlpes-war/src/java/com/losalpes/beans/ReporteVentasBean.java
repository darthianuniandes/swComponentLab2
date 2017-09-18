/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.beans.utils.ReporteVenta;
import com.losalpes.bos.Mueble;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.Venta;
import com.losalpes.servicios.IServicioVenta;
import com.losalpes.servicios.ServicioVentaMock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Melga
 */
@ManagedBean
@SessionScoped
public class ReporteVentasBean {
    
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo mueble a ingresar
     */
    private Date fecha_inicial;
    private Date fecha_final;
    private Venta venta;
    private List<Venta> lista_ventas;
    private List<ReporteVenta> listado_muebles_exteriores;
    private List<ReporteVenta> listado_muebles_interiores;
    private int costo_total_ventas;

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioVenta ventas;
    
    
    public ReporteVentasBean() {
        ventas = new ServicioVentaMock();
        lista_ventas = ventas.darVentas();
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta> getLista_ventas() {
        return lista_ventas;
    }

    public void setLista_ventas(List<Venta> lista_ventas) {
        this.lista_ventas = lista_ventas;
    }

    public IServicioVenta getVentas() {
        return ventas;
    }

    public void setVentas(IServicioVenta ventas) {
        this.ventas = ventas;
    }

    public Date getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(Date fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }
    
    public void generarReporte(){
    }
    
    public List<ReporteVenta> generarReporte(TipoMueble tipo){
        List<ReporteVenta> listado = new ArrayList<>();
        if (this.fecha_inicial != null && this.fecha_final!= null) {
            for (int i = 0; i < lista_ventas.size(); i++) {
                Venta venta_aux = lista_ventas.get(i);
                int mayor = venta_aux.getFechaVenta().compareTo(this.fecha_inicial);
                int menor = venta_aux.getFechaVenta().compareTo(this.fecha_final);
                if (venta_aux.getFechaVenta().compareTo(this.fecha_inicial) >= 0 && 
                    venta_aux.getFechaVenta().compareTo(this.fecha_final) <= 0 ) {
                    for (int j = 0; j < venta_aux.getMuebles().size(); j++) {
                        Mueble mueble_aux = venta_aux.getMuebles().get(j);
                        if(mueble_aux.getTipo() == tipo){
                            boolean agregado = false;
                            for (int k = 0; k < listado.size(); k++) {
                                if(listado.get(k).getNombre().equals(mueble_aux.getNombre())){
                                    listado.get(k).setCantidad(listado.get(k).getCantidad() + 1);
                                    agregado = true;
                                    break;
                                }
                            }
                            if(!agregado){
                                ReporteVenta nuevo_mueble = new ReporteVenta(mueble_aux.getNombre(), mueble_aux.getPrecio());
                                listado.add(nuevo_mueble);
                            }
                        }
                    }
                }
            }
        }
        return listado;
    }

    public List<ReporteVenta> getListado_muebles_exteriores() {
        this.listado_muebles_exteriores = generarReporte(TipoMueble.Exterior);
        return listado_muebles_exteriores;
    }

    public void setListado_muebles_exteriores(List<ReporteVenta> listado_muebles_exteriores) {
        this.listado_muebles_exteriores = listado_muebles_exteriores;
    }

    public List<ReporteVenta> getListado_muebles_interiores() {
        this.listado_muebles_interiores = generarReporte(TipoMueble.Interior);
        return listado_muebles_interiores;
    }

    public void setListado_muebles_interiores(List<ReporteVenta> listado_muebles_interiores) {
        this.listado_muebles_interiores = listado_muebles_interiores;
    }

    public int getCosto_total_ventas() {
        this.costo_total_ventas = 0;
        for (int i = 0; i < listado_muebles_interiores.size(); i++) {
            costo_total_ventas += listado_muebles_interiores.get(i).getCosto_total();
        }
        for (int i = 0; i < listado_muebles_exteriores.size(); i++) {
            costo_total_ventas += listado_muebles_exteriores.get(i).getCosto_total();
        }
        return costo_total_ventas;
    }

    public void setCosto_total_ventas(int costo_total_ventas) {
        this.costo_total_ventas = costo_total_ventas;
    }
    
    
}
