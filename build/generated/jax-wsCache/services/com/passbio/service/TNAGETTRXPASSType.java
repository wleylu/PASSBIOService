
package com.passbio.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TNAGETTRXPASSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TNAGETTRXPASSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gTNAGETTRXPASSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTNAGETTRXPASSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MESSAGERETOUR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNAGETTRXPASSType", namespace = "http://temenos.com/TNAGETTRXPASS", propOrder = {
    "gtnagettrxpassDetailType"
})
public class TNAGETTRXPASSType {

    @XmlElement(name = "gTNAGETTRXPASSDetailType", namespace = "http://temenos.com/TNAGETTRXPASS")
    protected TNAGETTRXPASSType.GTNAGETTRXPASSDetailType gtnagettrxpassDetailType;

    /**
     * Obtient la valeur de la propriété gtnagettrxpassDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TNAGETTRXPASSType.GTNAGETTRXPASSDetailType }
     *     
     */
    public TNAGETTRXPASSType.GTNAGETTRXPASSDetailType getGTNAGETTRXPASSDetailType() {
        return gtnagettrxpassDetailType;
    }

    /**
     * Définit la valeur de la propriété gtnagettrxpassDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TNAGETTRXPASSType.GTNAGETTRXPASSDetailType }
     *     
     */
    public void setGTNAGETTRXPASSDetailType(TNAGETTRXPASSType.GTNAGETTRXPASSDetailType value) {
        this.gtnagettrxpassDetailType = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mTNAGETTRXPASSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MESSAGERETOUR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mtnagettrxpassDetailType"
    })
    public static class GTNAGETTRXPASSDetailType {

        @XmlElement(name = "mTNAGETTRXPASSDetailType", namespace = "http://temenos.com/TNAGETTRXPASS")
        protected List<TNAGETTRXPASSType.GTNAGETTRXPASSDetailType.MTNAGETTRXPASSDetailType> mtnagettrxpassDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtnagettrxpassDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtnagettrxpassDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTNAGETTRXPASSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TNAGETTRXPASSType.GTNAGETTRXPASSDetailType.MTNAGETTRXPASSDetailType }
         * 
         * 
         */
        public List<TNAGETTRXPASSType.GTNAGETTRXPASSDetailType.MTNAGETTRXPASSDetailType> getMTNAGETTRXPASSDetailType() {
            if (mtnagettrxpassDetailType == null) {
                mtnagettrxpassDetailType = new ArrayList<TNAGETTRXPASSType.GTNAGETTRXPASSDetailType.MTNAGETTRXPASSDetailType>();
            }
            return this.mtnagettrxpassDetailType;
        }

        /**
         * Obtient la valeur de la propriété g.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Définit la valeur de la propriété g.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MESSAGERETOUR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "messageretour"
        })
        public static class MTNAGETTRXPASSDetailType {

            @XmlElement(name = "MESSAGERETOUR", namespace = "http://temenos.com/TNAGETTRXPASS")
            protected List<String> messageretour;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the messageretour property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the messageretour property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMESSAGERETOUR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMESSAGERETOUR() {
                if (messageretour == null) {
                    messageretour = new ArrayList<String>();
                }
                return this.messageretour;
            }

            /**
             * Obtient la valeur de la propriété m.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Définit la valeur de la propriété m.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
