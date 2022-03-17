
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
 * <p>Classe Java pour TNATXNPASSBIOType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TNATXNPASSBIOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gTNATXNPASSBIODetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTNATXNPASSBIODetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RESULTAT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TNATXNPASSBIOType", namespace = "http://temenos.com/TNATXNPASSBIO", propOrder = {
    "gtnatxnpassbioDetailType"
})
public class TNATXNPASSBIOType {

    @XmlElement(name = "gTNATXNPASSBIODetailType", namespace = "http://temenos.com/TNATXNPASSBIO")
    protected TNATXNPASSBIOType.GTNATXNPASSBIODetailType gtnatxnpassbioDetailType;

    /**
     * Obtient la valeur de la propriété gtnatxnpassbioDetailType.
     * 
     * @return
     *     possible object is
     *     {@link TNATXNPASSBIOType.GTNATXNPASSBIODetailType }
     *     
     */
    public TNATXNPASSBIOType.GTNATXNPASSBIODetailType getGTNATXNPASSBIODetailType() {
        return gtnatxnpassbioDetailType;
    }

    /**
     * Définit la valeur de la propriété gtnatxnpassbioDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link TNATXNPASSBIOType.GTNATXNPASSBIODetailType }
     *     
     */
    public void setGTNATXNPASSBIODetailType(TNATXNPASSBIOType.GTNATXNPASSBIODetailType value) {
        this.gtnatxnpassbioDetailType = value;
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
     *         &lt;element name="mTNATXNPASSBIODetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RESULTAT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "mtnatxnpassbioDetailType"
    })
    public static class GTNATXNPASSBIODetailType {

        @XmlElement(name = "mTNATXNPASSBIODetailType", namespace = "http://temenos.com/TNATXNPASSBIO")
        protected List<TNATXNPASSBIOType.GTNATXNPASSBIODetailType.MTNATXNPASSBIODetailType> mtnatxnpassbioDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtnatxnpassbioDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtnatxnpassbioDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTNATXNPASSBIODetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TNATXNPASSBIOType.GTNATXNPASSBIODetailType.MTNATXNPASSBIODetailType }
         * 
         * 
         */
        public List<TNATXNPASSBIOType.GTNATXNPASSBIODetailType.MTNATXNPASSBIODetailType> getMTNATXNPASSBIODetailType() {
            if (mtnatxnpassbioDetailType == null) {
                mtnatxnpassbioDetailType = new ArrayList<TNATXNPASSBIOType.GTNATXNPASSBIODetailType.MTNATXNPASSBIODetailType>();
            }
            return this.mtnatxnpassbioDetailType;
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
         *         &lt;element name="RESULTAT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "resultat"
        })
        public static class MTNATXNPASSBIODetailType {

            @XmlElement(name = "RESULTAT", namespace = "http://temenos.com/TNATXNPASSBIO")
            protected List<String> resultat;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the resultat property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resultat property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRESULTAT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRESULTAT() {
                if (resultat == null) {
                    resultat = new ArrayList<String>();
                }
                return this.resultat;
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
