
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package yu.ac.ns.ftn.informatika.ws.hello;
import javax.jws.WebService;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-06-13T03:05:43.390+02:00
 * Generated source version: 2.6.5
 * 
 */
@WebService(endpointInterface = "yu.ac.ns.ftn.informatika.ws.hello.Hello", serviceName = "HelloService")                      
public class HelloImpl implements Hello {

    public java.lang.String sayHi(java.lang.String arg0) {  
        System.out.println(arg0);    
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
 
    }

}