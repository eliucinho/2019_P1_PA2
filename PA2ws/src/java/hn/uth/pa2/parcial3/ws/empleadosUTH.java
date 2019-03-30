/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial3.ws;

import hn.uth.pa2.parcial3.accesoDatos.gestorDatos;
import hn.uth.pa2.parcial3.objetos.Empleado;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author eliucinho
 */
@WebService(serviceName = "empleadosUTH")
public class empleadosUTH {
    gestorDatos gd=new gestorDatos();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saludar")
    public String saludar(
            @WebParam(name = "saludo") String saludo
          , @WebParam(name = "persona") String persona) {
        //TODO write your implementation code here:
        return saludo+" "+persona;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmpleados")
    public List<Empleado> getEmpleados() {
        //TODO write your implementation code here:
        return gd.getEmpleados();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "setEmpleado")
    public Empleado setEmpleado(@WebParam(name = "cuenta") int cuenta, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido) {
        //TODO write your implementation code here:
        Empleado empleado=new Empleado(cuenta, nombre, apellido);
        
        gd.guardarEmpleado(empleado);
        
        return empleado;
    }
    
    @WebMethod(operationName = "getEmpleado")
    public Empleado getEmpleado(@WebParam(name = "cuenta") int cuenta, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return gd.getEmpleadoByCuentaAndNombre(cuenta, nombre);
    }
}
