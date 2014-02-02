
package br.net.reichel.mock.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.net.reichel.mock.client package. 
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

    private final static QName _ApplicationDetails_QNAME = new QName("http://finance.reichel.net.br/", "applicationDetails");
    private final static QName _ApplicationResponse_QNAME = new QName("http://finance.reichel.net.br/", "applicationResponse");
    private final static QName _ApplicationRequest_QNAME = new QName("http://finance.reichel.net.br/", "applicationRequest");
    private final static QName _DetectFraudResponse_QNAME = new QName("http://finance.reichel.net.br/", "detectFraudResponse");
    private final static QName _DetectFraud_QNAME = new QName("http://finance.reichel.net.br/", "detectFraud");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.net.reichel.mock.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DetectFraud }
     * 
     */
    public DetectFraud createDetectFraud() {
        return new DetectFraud();
    }

    /**
     * Create an instance of {@link ApplicationResponse }
     * 
     */
    public ApplicationResponse createApplicationResponse() {
        return new ApplicationResponse();
    }

    /**
     * Create an instance of {@link DetectFraudResponse }
     * 
     */
    public DetectFraudResponse createDetectFraudResponse() {
        return new DetectFraudResponse();
    }

    /**
     * Create an instance of {@link ApplicationRequest }
     * 
     */
    public ApplicationRequest createApplicationRequest() {
        return new ApplicationRequest();
    }

    /**
     * Create an instance of {@link ApplicationDetails }
     * 
     */
    public ApplicationDetails createApplicationDetails() {
        return new ApplicationDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://finance.reichel.net.br/", name = "applicationDetails")
    public JAXBElement<ApplicationDetails> createApplicationDetails(ApplicationDetails value) {
        return new JAXBElement<ApplicationDetails>(_ApplicationDetails_QNAME, ApplicationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://finance.reichel.net.br/", name = "applicationResponse")
    public JAXBElement<ApplicationResponse> createApplicationResponse(ApplicationResponse value) {
        return new JAXBElement<ApplicationResponse>(_ApplicationResponse_QNAME, ApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://finance.reichel.net.br/", name = "applicationRequest")
    public JAXBElement<ApplicationRequest> createApplicationRequest(ApplicationRequest value) {
        return new JAXBElement<ApplicationRequest>(_ApplicationRequest_QNAME, ApplicationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectFraudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://finance.reichel.net.br/", name = "detectFraudResponse")
    public JAXBElement<DetectFraudResponse> createDetectFraudResponse(DetectFraudResponse value) {
        return new JAXBElement<DetectFraudResponse>(_DetectFraudResponse_QNAME, DetectFraudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectFraud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://finance.reichel.net.br/", name = "detectFraud")
    public JAXBElement<DetectFraud> createDetectFraud(DetectFraud value) {
        return new JAXBElement<DetectFraud>(_DetectFraud_QNAME, DetectFraud.class, null, value);
    }

}
