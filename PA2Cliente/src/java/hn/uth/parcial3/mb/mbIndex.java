/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.parcial3.mb;

import hn.uth.pa2.parcial3.ws.Empleado;
import hn.uth.pa2.parcial3.ws.EmpleadosUTH_Service;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author eliucinho
 */
@Named(value = "mbIndex")
@SessionScoped
public class mbIndex implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_12948/uthWS/empleadosUTH.wsdl")
    private EmpleadosUTH_Service service;

    /**
     * Creates a new instance of mbIndex
     */
    public mbIndex() {
    }

    public List<Empleado> getListaEmpleados(){
        return this.getEmpleados();
    }
    
    private java.util.List<hn.uth.pa2.parcial3.ws.Empleado> getEmpleados() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hn.uth.pa2.parcial3.ws.EmpleadosUTH port = service.getEmpleadosUTHPort();
        return port.getEmpleados();
    }
    
    
    
}
