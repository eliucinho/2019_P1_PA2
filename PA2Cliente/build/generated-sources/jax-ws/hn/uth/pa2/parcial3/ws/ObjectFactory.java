
package hn.uth.pa2.parcial3.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.uth.pa2.parcial3.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmpleado_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "getEmpleado");
    private final static QName _GetEmpleadoResponse_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "getEmpleadoResponse");
    private final static QName _GetEmpleados_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "getEmpleados");
    private final static QName _GetEmpleadosResponse_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "getEmpleadosResponse");
    private final static QName _Hello_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "helloResponse");
    private final static QName _Saludar_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "saludar");
    private final static QName _SaludarResponse_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "saludarResponse");
    private final static QName _SetEmpleado_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "setEmpleado");
    private final static QName _SetEmpleadoResponse_QNAME = new QName("http://ws.parcial3.pa2.uth.hn/", "setEmpleadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.uth.pa2.parcial3.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmpleado }
     * 
     */
    public GetEmpleado createGetEmpleado() {
        return new GetEmpleado();
    }

    /**
     * Create an instance of {@link GetEmpleadoResponse }
     * 
     */
    public GetEmpleadoResponse createGetEmpleadoResponse() {
        return new GetEmpleadoResponse();
    }

    /**
     * Create an instance of {@link GetEmpleados }
     * 
     */
    public GetEmpleados createGetEmpleados() {
        return new GetEmpleados();
    }

    /**
     * Create an instance of {@link GetEmpleadosResponse }
     * 
     */
    public GetEmpleadosResponse createGetEmpleadosResponse() {
        return new GetEmpleadosResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Saludar }
     * 
     */
    public Saludar createSaludar() {
        return new Saludar();
    }

    /**
     * Create an instance of {@link SaludarResponse }
     * 
     */
    public SaludarResponse createSaludarResponse() {
        return new SaludarResponse();
    }

    /**
     * Create an instance of {@link SetEmpleado }
     * 
     */
    public SetEmpleado createSetEmpleado() {
        return new SetEmpleado();
    }

    /**
     * Create an instance of {@link SetEmpleadoResponse }
     * 
     */
    public SetEmpleadoResponse createSetEmpleadoResponse() {
        return new SetEmpleadoResponse();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "getEmpleado")
    public JAXBElement<GetEmpleado> createGetEmpleado(GetEmpleado value) {
        return new JAXBElement<GetEmpleado>(_GetEmpleado_QNAME, GetEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "getEmpleadoResponse")
    public JAXBElement<GetEmpleadoResponse> createGetEmpleadoResponse(GetEmpleadoResponse value) {
        return new JAXBElement<GetEmpleadoResponse>(_GetEmpleadoResponse_QNAME, GetEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpleados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "getEmpleados")
    public JAXBElement<GetEmpleados> createGetEmpleados(GetEmpleados value) {
        return new JAXBElement<GetEmpleados>(_GetEmpleados_QNAME, GetEmpleados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpleadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "getEmpleadosResponse")
    public JAXBElement<GetEmpleadosResponse> createGetEmpleadosResponse(GetEmpleadosResponse value) {
        return new JAXBElement<GetEmpleadosResponse>(_GetEmpleadosResponse_QNAME, GetEmpleadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "saludar")
    public JAXBElement<Saludar> createSaludar(Saludar value) {
        return new JAXBElement<Saludar>(_Saludar_QNAME, Saludar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "saludarResponse")
    public JAXBElement<SaludarResponse> createSaludarResponse(SaludarResponse value) {
        return new JAXBElement<SaludarResponse>(_SaludarResponse_QNAME, SaludarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "setEmpleado")
    public JAXBElement<SetEmpleado> createSetEmpleado(SetEmpleado value) {
        return new JAXBElement<SetEmpleado>(_SetEmpleado_QNAME, SetEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.parcial3.pa2.uth.hn/", name = "setEmpleadoResponse")
    public JAXBElement<SetEmpleadoResponse> createSetEmpleadoResponse(SetEmpleadoResponse value) {
        return new JAXBElement<SetEmpleadoResponse>(_SetEmpleadoResponse_QNAME, SetEmpleadoResponse.class, null, value);
    }

}
