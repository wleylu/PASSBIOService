
package com.passbio.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TNAGETTRXPASS complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TNAGETTRXPASS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/TWSPASSBIO}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="TNAGETTRXPASSType" type="{http://temenos.com/TWSPASSBIO}enquiryInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNAGETTRXPASS", propOrder = {
    "webRequestCommon",
    "tnagettrxpassType"
})
public class TNAGETTRXPASS {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "TNAGETTRXPASSType")
    protected EnquiryInput tnagettrxpassType;

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
     * Obtient la valeur de la propriété tnagettrxpassType.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getTNAGETTRXPASSType() {
        return tnagettrxpassType;
    }

    /**
     * Définit la valeur de la propriété tnagettrxpassType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setTNAGETTRXPASSType(EnquiryInput value) {
        this.tnagettrxpassType = value;
    }

}
