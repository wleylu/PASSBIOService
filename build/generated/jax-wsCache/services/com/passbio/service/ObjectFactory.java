
package com.passbio.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.passbio.service package. 
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

    private final static QName _TNAGETTRXPASSResponse_QNAME = new QName("http://temenos.com/TWSPASSBIO", "TNAGETTRXPASSResponse");
    private final static QName _TNAGETTRXPASS_QNAME = new QName("http://temenos.com/TWSPASSBIO", "TNAGETTRXPASS");
    private final static QName _TNATXNPASSBIO_QNAME = new QName("http://temenos.com/TWSPASSBIO", "TNATXNPASSBIO");
    private final static QName _TNATXNPASSBIOResponse_QNAME = new QName("http://temenos.com/TWSPASSBIO", "TNATXNPASSBIOResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.passbio.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TNATXNPASSBIOType }
     * 
     */
    public TNATXNPASSBIOType createTNATXNPASSBIOType() {
        return new TNATXNPASSBIOType();
    }

    /**
     * Create an instance of {@link TNATXNPASSBIOType.GTNATXNPASSBIODetailType }
     * 
     */
    public TNATXNPASSBIOType.GTNATXNPASSBIODetailType createTNATXNPASSBIOTypeGTNATXNPASSBIODetailType() {
        return new TNATXNPASSBIOType.GTNATXNPASSBIODetailType();
    }

    /**
     * Create an instance of {@link TNAGETTRXPASSType }
     * 
     */
    public TNAGETTRXPASSType createTNAGETTRXPASSType() {
        return new TNAGETTRXPASSType();
    }

    /**
     * Create an instance of {@link TNAGETTRXPASSType.GTNAGETTRXPASSDetailType }
     * 
     */
    public TNAGETTRXPASSType.GTNAGETTRXPASSDetailType createTNAGETTRXPASSTypeGTNAGETTRXPASSDetailType() {
        return new TNAGETTRXPASSType.GTNAGETTRXPASSDetailType();
    }

    /**
     * Create an instance of {@link TNATXNPASSBIO }
     * 
     */
    public TNATXNPASSBIO createTNATXNPASSBIO() {
        return new TNATXNPASSBIO();
    }

    /**
     * Create an instance of {@link TNAGETTRXPASS }
     * 
     */
    public TNAGETTRXPASS createTNAGETTRXPASS() {
        return new TNAGETTRXPASS();
    }

    /**
     * Create an instance of {@link TNATXNPASSBIOResponse }
     * 
     */
    public TNATXNPASSBIOResponse createTNATXNPASSBIOResponse() {
        return new TNATXNPASSBIOResponse();
    }

    /**
     * Create an instance of {@link TNAGETTRXPASSResponse }
     * 
     */
    public TNAGETTRXPASSResponse createTNAGETTRXPASSResponse() {
        return new TNAGETTRXPASSResponse();
    }

    /**
     * Create an instance of {@link WebRequestCommon }
     * 
     */
    public WebRequestCommon createWebRequestCommon() {
        return new WebRequestCommon();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link EnquiryInputCollection }
     * 
     */
    public EnquiryInputCollection createEnquiryInputCollection() {
        return new EnquiryInputCollection();
    }

    /**
     * Create an instance of {@link EnquiryInput }
     * 
     */
    public EnquiryInput createEnquiryInput() {
        return new EnquiryInput();
    }

    /**
     * Create an instance of {@link AnyTypeArray }
     * 
     */
    public AnyTypeArray createAnyTypeArray() {
        return new AnyTypeArray();
    }

    /**
     * Create an instance of {@link TNATXNPASSBIOType.GTNATXNPASSBIODetailType.MTNATXNPASSBIODetailType }
     * 
     */
    public TNATXNPASSBIOType.GTNATXNPASSBIODetailType.MTNATXNPASSBIODetailType createTNATXNPASSBIOTypeGTNATXNPASSBIODetailTypeMTNATXNPASSBIODetailType() {
        return new TNATXNPASSBIOType.GTNATXNPASSBIODetailType.MTNATXNPASSBIODetailType();
    }

    /**
     * Create an instance of {@link TNAGETTRXPASSType.GTNAGETTRXPASSDetailType.MTNAGETTRXPASSDetailType }
     * 
     */
    public TNAGETTRXPASSType.GTNAGETTRXPASSDetailType.MTNAGETTRXPASSDetailType createTNAGETTRXPASSTypeGTNAGETTRXPASSDetailTypeMTNAGETTRXPASSDetailType() {
        return new TNAGETTRXPASSType.GTNAGETTRXPASSDetailType.MTNAGETTRXPASSDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNAGETTRXPASSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/TWSPASSBIO", name = "TNAGETTRXPASSResponse")
    public JAXBElement<TNAGETTRXPASSResponse> createTNAGETTRXPASSResponse(TNAGETTRXPASSResponse value) {
        return new JAXBElement<TNAGETTRXPASSResponse>(_TNAGETTRXPASSResponse_QNAME, TNAGETTRXPASSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNAGETTRXPASS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/TWSPASSBIO", name = "TNAGETTRXPASS")
    public JAXBElement<TNAGETTRXPASS> createTNAGETTRXPASS(TNAGETTRXPASS value) {
        return new JAXBElement<TNAGETTRXPASS>(_TNAGETTRXPASS_QNAME, TNAGETTRXPASS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNATXNPASSBIO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/TWSPASSBIO", name = "TNATXNPASSBIO")
    public JAXBElement<TNATXNPASSBIO> createTNATXNPASSBIO(TNATXNPASSBIO value) {
        return new JAXBElement<TNATXNPASSBIO>(_TNATXNPASSBIO_QNAME, TNATXNPASSBIO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNATXNPASSBIOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/TWSPASSBIO", name = "TNATXNPASSBIOResponse")
    public JAXBElement<TNATXNPASSBIOResponse> createTNATXNPASSBIOResponse(TNATXNPASSBIOResponse value) {
        return new JAXBElement<TNATXNPASSBIOResponse>(_TNATXNPASSBIOResponse_QNAME, TNATXNPASSBIOResponse.class, null, value);
    }

}
