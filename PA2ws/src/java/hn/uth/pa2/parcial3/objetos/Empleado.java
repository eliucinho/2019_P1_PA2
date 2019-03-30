/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial3.objetos;

/**
 *
 * @author eliucinho
 */
public class Empleado {
    private int cuenta;
    private String nombre;
    private String apellido;

    public Empleado(int cuenta, String nombre, String apellido) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cuenta=" + cuenta + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
