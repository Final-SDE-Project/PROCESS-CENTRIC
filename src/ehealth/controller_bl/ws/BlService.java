
package ehealth.controller_bl.ws;

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
@WebServiceClient(name = "BlService", targetNamespace = "http://ws.controller_bl.ehealth/", wsdlLocation = "https://sde-bl.herokuapp.com/ws/bl?wsdl")
public class BlService
    extends Service
{

    private final static URL BLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BLSERVICE_EXCEPTION;
    private final static QName BLSERVICE_QNAME = new QName("http://ws.controller_bl.ehealth/", "BlService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sde-bl.herokuapp.com/ws/bl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BLSERVICE_WSDL_LOCATION = url;
        BLSERVICE_EXCEPTION = e;
    }

    public BlService() {
        super(__getWsdlLocation(), BLSERVICE_QNAME);
    }

    public BlService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BLSERVICE_QNAME, features);
    }

    public BlService(URL wsdlLocation) {
        super(wsdlLocation, BLSERVICE_QNAME);
    }

    public BlService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BLSERVICE_QNAME, features);
    }

    public BlService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BlService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceBl
     */
    @WebEndpoint(name = "ServiceBLogicImplPort")
    public ServiceBl getServiceBLogicImplPort() {
        return super.getPort(new QName("http://ws.controller_bl.ehealth/", "ServiceBLogicImplPort"), ServiceBl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceBl
     */
    @WebEndpoint(name = "ServiceBLogicImplPort")
    public ServiceBl getServiceBLogicImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.controller_bl.ehealth/", "ServiceBLogicImplPort"), ServiceBl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BLSERVICE_EXCEPTION!= null) {
            throw BLSERVICE_EXCEPTION;
        }
        return BLSERVICE_WSDL_LOCATION;
    }

}
