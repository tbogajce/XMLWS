//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.19 at 04:50:45 PM CEST 
//


package rs.ac.uns.ftn.faktura;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb.faktura package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb.faktura
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Faktura }
     * 
     */
    public Faktura createFaktura() {
        return new Faktura();
    }

    /**
     * Create an instance of {@link Faktura.ZaglavljeFakture }
     * 
     */
    public Faktura.ZaglavljeFakture createFakturaZaglavljeFakture() {
        return new Faktura.ZaglavljeFakture();
    }

    /**
     * Create an instance of {@link Faktura.StavkaFakture }
     * 
     */
    public Faktura.StavkaFakture createFakturaStavkaFakture() {
        return new Faktura.StavkaFakture();
    }

    /**
     * Create an instance of {@link TPreduzece }
     * 
     */
    public TPreduzece createTPreduzece() {
        return new TPreduzece();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link TRacun }
     * 
     */
    public TRacun createTRacun() {
        return new TRacun();
    }

}
