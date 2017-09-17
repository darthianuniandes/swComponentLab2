/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 *
 * @author ian
 */
public class Cliente {
    
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String telefono;
    private String telefonoCelular;
    private String direccion;
    private String ciudadResidencia;
    private String departamento;
    private String pais;
    private String profesion;
    private String email;
    
    public Cliente() {
    }

    public Cliente(String tipoDocumento, String numeroDocumento, String nombre, String telefono, String telefonoCelular, String direccion, String ciudadResidencia, String departamento, String pais, String profesion, String email) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
        this.departamento = departamento;
        this.pais = pais;
        this.profesion = profesion;
        this.email = email;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", nombre=" + nombre + ", telefono=" + telefono + ", telefonoCelular=" + telefonoCelular + ", direccion=" + direccion + ", ciudadResidencia=" + ciudadResidencia + ", departamento=" + departamento + ", pais=" + pais + ", profesion=" + profesion + ", email=" + email + '}';
    }
}
