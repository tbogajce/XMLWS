package rs.ac.uns.ftn.banka;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-06-19T20:31:52.942+02:00
 * Generated source version: 2.6.5
 * 
 */
@WebServiceClient(name = "BankaService", 
                  wsdlLocation = "/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl",
                  targetNamespace = "http://www.ftn.uns.ac.rs/banka") 
public class BankaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
    public final static QName BankaPort = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");
    static {
        URL url = BankaService.class.getResource("/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(BankaService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/home/igor/Documents/gitRepos/XMLWS/Banka/Banka/WEB-INF/wsdl/Banka.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public BankaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BankaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankaService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BankaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BankaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BankaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Banka
     */
    @WebEndpoint(name = "BankaPort")
    public Banka getBankaPort() {
        return super.getPort(BankaPort, Banka.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Banka
     */
    @WebEndpoint(name = "BankaPort")
    public Banka getBankaPort(WebServiceFeature... features) {
        return super.getPort(BankaPort, Banka.class, features);
    }

}
