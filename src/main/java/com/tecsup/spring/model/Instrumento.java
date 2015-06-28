/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.spring.model;

/**
 *
 * @author alumno
 */
public class Instrumento {
    private String nombre;
    private String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void sonido(){
        System.out.println("Sonido de instrumento");
    }
}
