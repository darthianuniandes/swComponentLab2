/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ian
 */
public class ServicioClienteMock implements IServicioCliente {
    
    private List clientes;

    public ServicioClienteMock() {
        this.clientes = new ArrayList<Cliente>();
        
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
        this.clientes.add(new Cliente("CC","1123","Batman","123","123","calle","bog","cun","col","millonario","baitmail"));
    }
    
    @Override
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Boolean eliminarCliente(Cliente cliente) {
        return this.clientes.remove(cliente);
    }

    @Override
    public List<Cliente> darClientes() {
        return clientes;
    }
    
}
