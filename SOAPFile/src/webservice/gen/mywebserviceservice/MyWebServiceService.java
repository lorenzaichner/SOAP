
package webservice.gen.mywebserviceservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MyWebServiceService", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/services?wsdl")
public class MyWebServiceService
    extends Service
{

    private final static URL MYWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MYWEBSERVICESERVICE_EXCEPTION;
    private final static QName MYWEBSERVICESERVICE_QNAME = new QName("http://webservice/", "MyWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/services?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYWEBSERVICESERVICE_WSDL_LOCATION = url;
        MYWEBSERVICESERVICE_EXCEPTION = e;
    }

    public MyWebServiceService() {
        super(__getWsdlLocation(), MYWEBSERVICESERVICE_QNAME);
    }

    public MyWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYWEBSERVICESERVICE_QNAME, features);
    }

    public MyWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MYWEBSERVICESERVICE_QNAME);
    }

    public MyWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYWEBSERVICESERVICE_QNAME, features);
    }

    public MyWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MINICALC
     */
    @WebEndpoint(name = "MINICALCPort")
    public MINICALC getMINICALCPort() {
        return super.getPort(new QName("http://webservice/", "MINICALCPort"), MINICALC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MINICALC
     */
    @WebEndpoint(name = "MINICALCPort")
    public MINICALC getMINICALCPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "MINICALCPort"), MINICALC.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MYWEBSERVICESERVICE_EXCEPTION;
        }
        return MYWEBSERVICESERVICE_WSDL_LOCATION;
    }

}