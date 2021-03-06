package rs.ac.uns.ftn.centralnabanka;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-06-22T17:19:52.485+02:00
 * Generated source version: 2.6.5
 * 
 */
@WebService(targetNamespace = "http://www.ftn.uns.ac.rs/centralnaBanka", name = "CentralnaBanka")
@XmlSeeAlso({rs.ac.uns.ftn.mt102.ObjectFactory.class, rs.ac.uns.ftn.zahtevzaizvod.ObjectFactory.class, rs.ac.uns.ftn.xmlws.ObjectFactory.class, rs.ac.uns.ftn.mt103.ObjectFactory.class, rs.ac.uns.ftn.faktura.ObjectFactory.class, rs.ac.uns.ftn.presek.ObjectFactory.class, rs.ac.uns.ftn.mt90010.ObjectFactory.class, rs.ac.uns.ftn.nalogzaprenos.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CentralnaBanka {

    @WebMethod
    @WebResult(name = "MT900", targetNamespace = "http://www.ftn.uns.ac.rs/mt90010", partName = "mt900")
    public rs.ac.uns.ftn.mt90010.TMT9 primiMT102(
        @WebParam(partName = "mt102", name = "mt102", targetNamespace = "http://www.ftn.uns.ac.rs/mt102")
        rs.ac.uns.ftn.mt102.Mt102 mt102
    );

    @WebMethod
    @WebResult(name = "MT900", targetNamespace = "http://www.ftn.uns.ac.rs/mt90010", partName = "mt900")
    public rs.ac.uns.ftn.mt90010.TMT9 primiMT103(
        @WebParam(partName = "mt103", name = "MT_103", targetNamespace = "http://www.ftn.uns.ac.rs/mt103")
        rs.ac.uns.ftn.mt103.MT103 mt103
    );
}
