
package gstekyc.tml.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gstekyc.tml.service package. 
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

    private final static QName _GSTRequest_QNAME = new QName("http://service.TML.GSTeKYC/", "GSTRequest");
    private final static QName _GSTResponse_QNAME = new QName("http://service.TML.GSTeKYC/", "GSTResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gstekyc.tml.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GSTRequestObject }
     * 
     */
    public GSTRequestObject createGSTRequestObject() {
        return new GSTRequestObject();
    }

    /**
     * Create an instance of {@link GSTResponseObject }
     * 
     */
    public GSTResponseObject createGSTResponseObject() {
        return new GSTResponseObject();
    }

    /**
     * Create an instance of {@link KYCObject }
     * 
     */
    public KYCObject createKYCObject() {
        return new KYCObject();
    }

    /**
     * Create an instance of {@link KYCResultObject }
     * 
     */
    public KYCResultObject createKYCResultObject() {
        return new KYCResultObject();
    }

    /**
     * Create an instance of {@link PradrObject }
     * 
     */
    public PradrObject createPradrObject() {
        return new PradrObject();
    }

    /**
     * Create an instance of {@link AdadrObject }
     * 
     */
    public AdadrObject createAdadrObject() {
        return new AdadrObject();
    }

    /**
     * Create an instance of {@link NameMatchObject }
     * 
     */
    public NameMatchObject createNameMatchObject() {
        return new NameMatchObject();
    }

    /**
     * Create an instance of {@link GSTResultObject }
     * 
     */
    public GSTResultObject createGSTResultObject() {
        return new GSTResultObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GSTRequestObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GSTRequestObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.GSTeKYC/", name = "GSTRequest")
    public JAXBElement<GSTRequestObject> createGSTRequest(GSTRequestObject value) {
        return new JAXBElement<GSTRequestObject>(_GSTRequest_QNAME, GSTRequestObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GSTResponseObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GSTResponseObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.GSTeKYC/", name = "GSTResponse")
    public JAXBElement<GSTResponseObject> createGSTResponse(GSTResponseObject value) {
        return new JAXBElement<GSTResponseObject>(_GSTResponse_QNAME, GSTResponseObject.class, null, value);
    }

}
