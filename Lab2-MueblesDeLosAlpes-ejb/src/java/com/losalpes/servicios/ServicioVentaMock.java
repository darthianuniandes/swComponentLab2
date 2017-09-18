/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.Venta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mithrandir
 */
public class ServicioVentaMock implements IServicioVenta{
    private List ventas;
    
    private Mueble mueble1 = new Mueble("RF1", "Mueble1", "Este es el mueble 1", TipoMueble.Interior, 10000);
    private Mueble mueble2 = new Mueble("RF2", "Mueble2", "Este es el mueble 2", TipoMueble.Exterior, 41234);
    private Mueble mueble3 = new Mueble("RF3", "Mueble3", "Este es el mueble 3", TipoMueble.Interior, 132);
    private Mueble mueble4 = new Mueble("RF4", "Mueble4", "Este es el mueble 4", TipoMueble.Interior, 1512);
    private Mueble mueble5 = new Mueble("RF5", "Mueble5", "Este es el mueble 5", TipoMueble.Exterior, 12341);
    private Mueble mueble6 = new Mueble("RF6", "Mueble6", "Este es el mueble 6", TipoMueble.Interior, 1200);
    private Mueble mueble7 = new Mueble("RF7", "Mueble7", "Este es el mueble 7 ", TipoMueble.Interior, 567);
    private Mueble mueble8 = new Mueble("RF8", "Mueble8", "Este es el mueble 8", TipoMueble.Exterior, 87);
    private Mueble mueble9 = new Mueble("RF9", "Mueble9", "Este es el mueble 9", TipoMueble.Interior, 345);
    private Mueble mueble10 = new Mueble("RF10", "Mueble10", "Este es el mueble 10", TipoMueble.Exterior, 12345);
    private Mueble mueble11 = new Mueble("RF11", "Mueble11", "Este es el mueble 11", TipoMueble.Interior, 34);
    private Mueble mueble12= new Mueble("RF12", "Mueble12", "Este es el mueble 12", TipoMueble.Interior, 645);
    private Mueble mueble13 = new Mueble("RF13", "Mueble13", "Este es el mueble 13", TipoMueble.Interior, 456);
    private Mueble mueble14 = new Mueble("RF14", "Mueble14", "Este es el mueble 14", TipoMueble.Interior, 10456);
    private Mueble mueble15 = new Mueble("RF15", "Mueble15", "Este es el mueble 15", TipoMueble.Interior, 465);
    private Mueble mueble16 = new Mueble("RF16", "Mueble16", "Este es el mueble 16", TipoMueble.Exterior, 456);
    private Mueble mueble17 = new Mueble("RF17", "Mueble17", "Este es el mueble 17", TipoMueble.Interior, 907);
    
    private List<Mueble> lista1;
    private List<Mueble> lista2;
    private List<Mueble> lista3;
    private List<Mueble> lista4;
    private List<Mueble> lista5;
    
    
    public ServicioVentaMock(){
        
        this.lista1 = new ArrayList<>();
        this.lista2 = new ArrayList<>();
        this.lista3 = new ArrayList<>();
        this.lista4 = new ArrayList<>();
        this.lista5 = new ArrayList<>(); 
        
        this.ventas = new ArrayList<>();
        
        this.lista1.add(mueble1);
        this.lista1.add(mueble2);
        this.lista1.add(mueble9);
        this.lista1.add(mueble8);
        this.lista1.add(mueble11);
        
        this.lista2.add(mueble11);
        this.lista2.add(mueble6);
        this.lista2.add(mueble15);
        
        this.lista3.add(mueble15);
        this.lista3.add(mueble1);
        this.lista3.add(mueble3);
        this.lista3.add(mueble11);
        this.lista3.add(mueble4);
        
        this.lista4.add(mueble8);
        
        this.lista5.add(mueble17);
        this.lista5.add(mueble16);
        this.lista5.add(mueble15);
        this.lista5.add(mueble14);
        this.lista5.add(mueble17);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.ventas.add(new Venta(lista1, sdf.parse("2017-9-17"), 10000, "Efectivo", "Bogota"));
            this.ventas.add(new Venta(lista5, sdf.parse("2017-9-18"), 324563, "Tarjeta de crédito", "Pasto"));
            this.ventas.add(new Venta(lista4, sdf.parse("2017-9-19"), 356543, "Tarjeta débito", "Bogota"));
            this.ventas.add(new Venta(lista3, sdf.parse("2017-9-20"), 345664, "Efectivo", "Cali"));
            this.ventas.add(new Venta(lista2, sdf.parse("2017-9-21"), 4356, "Cheque", "Bucaramanga"));  
        } catch (ParseException ex) {
            Logger.getLogger(ServicioVentaMock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    @Override
    public List<Venta> darVentas() {
        return ventas;
    }

    
}
