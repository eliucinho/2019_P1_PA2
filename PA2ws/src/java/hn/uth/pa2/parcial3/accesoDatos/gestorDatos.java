/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial3.accesoDatos;

import hn.uth.pa2.parcial3.objetos.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eliucinho
 */
public class gestorDatos {
    private List<Empleado> listaEmpleados;

    public gestorDatos() {
        this.listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado(01, "eliud", "varela"));
        listaEmpleados.add(new Empleado(02, "jorge", "ortiz"));
        listaEmpleados.add(new Empleado(03, "carlos", "pineda"));
        listaEmpleados.add(new Empleado(04, "german", "rivera"));
    }
    
    public void guardarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    
    public List<Empleado> getEmpleados(){
        return listaEmpleados;
    }
    
    public Empleado getEmpleadoByCuenta(int cuenta){
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCuenta()==cuenta) {
                return empleado;
            }
        }
        return null;
    } 
    
    public Empleado getEmpleadoByCuentaAndNombre(int cuenta,String nombre){
        Empleado empleado=getEmpleadoByCuenta(cuenta);
        
        if (empleado!=null && empleado.getNombre().equals(nombre)) {
            return empleado;
        }
        else {
            return null;
        }
    } 
}
