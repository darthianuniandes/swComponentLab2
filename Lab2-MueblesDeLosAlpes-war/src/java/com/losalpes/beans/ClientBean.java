/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.servicios.IServicioCliente;
import com.losalpes.servicios.ServicioClienteMock;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.rpc.encoding.Serializer;

/**
 *
 * @author i.sarasty
 */
@ManagedBean(name="clientBean")
@SessionScoped
public class ClientBean {
    
    private Cliente cliente;
    private List<Cliente> clientes;

    private IServicioCliente servicioCliente;

    public ClientBean() {
        this.cliente = new Cliente();
        this.servicioCliente = new ServicioClienteMock();
        this.clientes = servicioCliente.darClientes();
    }
    
    public void agregarMueble() {
        servicioCliente.agregarCliente(cliente);
        cliente = new Cliente();
    }
    
    public void eliminarMueble(Cliente cliente) {
        System.out.println("cliente"+cliente);
        System.out.println(servicioCliente.eliminarCliente(cliente));
        this.clientes = servicioCliente.darClientes();
    }
        
    public void limpiar() {
        cliente = new Cliente();
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
