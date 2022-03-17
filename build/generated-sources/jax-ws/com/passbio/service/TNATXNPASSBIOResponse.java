
package com.passbio.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TNATXNPASSBIOResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TNATXNPASSBIOResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/TWSPASSBIO}Status" minOccurs="0"/>
 *         &lt;element name="TNATXNPASSBIOType" type="{http://temenos.com/TNATXNPASSBIO}TNATXNPASSBIOType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNATXNPASSBIOResponse", propOrder = {
    "status",
    "tnatxnpassbioType"
})
public class TNATXNPASSBIOResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "TNATXNPASSBIOType")
    protected List<TNATXNPASSBIOType> tnatxnpassbioType;

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
     * Gets the value of the tnatxnpassbioType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tnatxnpassbioType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTNATXNPASSBIOType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNATXNPASSBIOType }
     * 
     * 
     */
    public List<TNATXNPASSBIOType> getTNATXNPASSBIOType() {
        if (tnatxnpassbioType == null) {
            tnatxnpassbioType = new ArrayList<TNATXNPASSBIOType>();
        }
        return this.tnatxnpassbioType;
    }

}
