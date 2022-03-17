
package com.passbio.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TNATXNPASSBIO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TNATXNPASSBIO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/TWSPASSBIO}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="TNATXNPASSBIOType" type="{http://temenos.com/TWSPASSBIO}enquiryInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNATXNPASSBIO", propOrder = {
    "webRequestCommon",
    "tnatxnpassbioType"
})
public class TNATXNPASSBIO {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "TNATXNPASSBIOType")
    protected EnquiryInput tnatxnpassbioType;

    /**
     * Obtient la valeur de la propriété webRequestCommon.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Définit la valeur de la propriété webRequestCommon.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Obtient la valeur de la propriété tnatxnpassbioType.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getTNATXNPASSBIOType() {
        return tnatxnpassbioType;
    }

    /**
     * Définit la valeur de la propriété tnatxnpassbioType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setTNATXNPASSBIOType(EnquiryInput value) {
        this.tnatxnpassbioType = value;
    }

}
