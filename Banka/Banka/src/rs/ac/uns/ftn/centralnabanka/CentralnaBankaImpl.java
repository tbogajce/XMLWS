
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package rs.ac.uns.ftn.centralnabanka;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.banka.Banka;
import rs.ac.uns.ftn.mt90010.TMT9;

/**
 * This class was generated by Apache CXF 2.6.5 2017-06-22T17:19:52.461+02:00
 * Generated source version: 2.6.5
 * 
 */

@javax.jws.WebService(serviceName = "CentralnaBankaService", portName = "CentralnaBankaPort", targetNamespace = "http://www.ftn.uns.ac.rs/centralnaBanka", wsdlLocation = "file:/C:/Users/Tihomir/Documents/GitHub/XMLWS/Centralna_banka/WEB-INF/wsdl/CentralnaBanka.wsdl", endpointInterface = "rs.ac.uns.ftn.centralnabanka.CentralnaBanka")

public class CentralnaBankaImpl implements CentralnaBanka {

	private static final Logger LOG = Logger.getLogger(CentralnaBankaImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * rs.ac.uns.ftn.centralnabanka.CentralnaBanka#primiMT102(rs.ac.uns.ftn.
	 * mt102.Mt102 mt102 )*
	 */
	public rs.ac.uns.ftn.mt90010.TMT9 primiMT102(rs.ac.uns.ftn.mt102.Mt102 mt102) {
		LOG.info("Executing operation primiMT102");
		System.out.println(mt102);
		System.out.println("primiMT102: " + mt102.getIdPoruke());

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm");

		TMT9 mt900 = new TMT9();
		mt900.setIDPoruke("mt900-" + dateFormat.format(date));
		mt900.setSWIFTKodBankeDuznika(mt102.getSwiftKodBankeDuznika());
		mt900.setObracunskiRacunBankeDuznika(mt102.getObracunskiRacunBankeDuznika());
		mt900.setIDPorukeNaloga(mt102.getIdPoruke());
		mt900.setDatum(mt102.getDatumValute());
		mt900.setIznos(mt102.getUkupanIznos());
		mt900.setSifraValute(mt102.getSifraValute());

		TMT9 mt910 = new TMT9();
		mt910.setIDPoruke("mt910-" + dateFormat.format(date));
		mt910.setSWIFTKodBankeDuznika(mt102.getSwiftKodBankePoverioca());
		mt910.setObracunskiRacunBankeDuznika(mt102.getObracunskiRacunBankePoverioca());
		mt910.setIDPorukeNaloga(mt102.getIdPoruke());
		mt910.setDatum(mt102.getDatumValute());
		mt910.setIznos(mt102.getUkupanIznos());
		mt910.setSifraValute(mt102.getSifraValute());

		URL wsdl = null;
		try {
			wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
		QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");

		Service service = Service.create(wsdl, serviceName);
		Banka banka = service.getPort(portName, Banka.class);

		banka.primiMT102(mt102);
		banka.primiMT900(mt900);
		banka.primiMT910(mt910);

		/*
		 * try { rs.ac.uns.ftn.mt90010.TMT9 _return = null; return _return; }
		 * catch (java.lang.Exception ex) { ex.printStackTrace(); throw new
		 * RuntimeException(ex); }
		 */

		return mt900;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * rs.ac.uns.ftn.centralnabanka.CentralnaBanka#primiMT103(rs.ac.uns.ftn.
	 * mt103.MT103 mt103 )*
	 */
	public rs.ac.uns.ftn.mt90010.TMT9 primiMT103(rs.ac.uns.ftn.mt103.MT103 mt103) {
		LOG.info("Executing operation primiMT103");
		System.out.println(mt103);
		System.out.println("primiMT103: " + mt103.getIDPoruke());

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm");

		TMT9 mt900 = new TMT9();
		mt900.setIDPoruke("mt900-" + dateFormat.format(date));
		mt900.setSWIFTKodBankeDuznika(mt103.getSWIFTKodBankeDuznika());
		mt900.setObracunskiRacunBankeDuznika(mt103.getObracunskiRacunBankeDuznika());
		mt900.setIDPorukeNaloga(mt103.getIDPoruke());
		mt900.setDatum(mt103.getDatumValute());
		mt900.setIznos(mt103.getIznos());
		mt900.setSifraValute(mt103.getSifraValute());

		TMT9 mt910 = new TMT9();
		mt910.setIDPoruke("mt910-" + dateFormat.format(date));
		mt910.setSWIFTKodBankeDuznika(mt103.getSWIFTKodBankePoverioca());
		mt910.setObracunskiRacunBankeDuznika(mt103.getObracunskiRacunBankePoverioca());
		mt910.setIDPorukeNaloga(mt103.getIDPoruke());
		mt910.setDatum(mt103.getDatumValute());
		mt910.setIznos(mt103.getIznos());
		mt910.setSifraValute(mt103.getSifraValute());

		URL wsdl = null;
		try {
			wsdl = new URL("http://localhost:8080/banka/services/Banka?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName serviceName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaService");
		QName portName = new QName("http://www.ftn.uns.ac.rs/banka", "BankaPort");

		Service service = Service.create(wsdl, serviceName);
		Banka banka = service.getPort(portName, Banka.class);

		banka.primiMT103(mt103);
		banka.primiMT900(mt900);
		banka.primiMT910(mt910);
		/*
		 * try { rs.ac.uns.ftn.mt90010.TMT9 _return = null; return _return; }
		 * catch (java.lang.Exception ex) { ex.printStackTrace(); throw new
		 * RuntimeException(ex); }
		 */

		return mt900;
	}

}
