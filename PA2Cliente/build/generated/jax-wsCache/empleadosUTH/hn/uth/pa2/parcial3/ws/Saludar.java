
package hn.uth.pa2.parcial3.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saludar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saludar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saludo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="persona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saludar", propOrder = {
    "saludo",
    "persona"
})
public class Saludar {

    protected String saludo;
    protected String persona;

    /**
     * Obtiene el valor de la propiedad saludo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaludo() {
        return saludo;
    }

    /**
     * Define el valor de la propiedad saludo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaludo(String value) {
        this.saludo = value;
    }

    /**
     * Obtiene el valor de la propiedad persona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersona() {
        return persona;
    }

    /**
     * Define el valor de la propiedad persona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersona(String value) {
        this.persona = value;
    }

}
