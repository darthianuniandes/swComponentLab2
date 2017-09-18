/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Venta;
import java.util.List;

/**
 *
 * @author Mithrandir
 */
public interface IServicioVenta {

    public void registrarVenta(Venta venta);
    
    public List<Venta> darVentas();
}
