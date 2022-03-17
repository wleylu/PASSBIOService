
package com.passbio.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TNAGETTRXPASSResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TNAGETTRXPASSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/TWSPASSBIO}Status" minOccurs="0"/>
 *         &lt;element name="TNAGETTRXPASSType" type="{http://temenos.com/TNAGETTRXPASS}TNAGETTRXPASSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNAGETTRXPASSResponse", propOrder = {
    "status",
    "tnagettrxpassType"
})
public class TNAGETTRXPASSResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "TNAGETTRXPASSType")
    protected List<TNAGETTRXPASSType> tnagettrxpassType;

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the tnagettrxpassType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tnagettrxpassType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTNAGETTRXPASSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNAGETTRXPASSType }
     * 
     * 
     */
    public List<TNAGETTRXPASSType> getTNAGETTRXPASSType() {
        if (tnagettrxpassType == null) {
            tnagettrxpassType = new ArrayList<TNAGETTRXPASSType>();
        }
        return this.tnagettrxpassType;
    }

}
