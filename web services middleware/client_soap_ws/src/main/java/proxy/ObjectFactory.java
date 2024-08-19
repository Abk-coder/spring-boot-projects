
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _EuroToXofConversion_QNAME = new QName("http://ws/", "euroToXofConversion");
    private static final QName _EuroToXofConversionResponse_QNAME = new QName("http://ws/", "euroToXofConversionResponse");
    private static final QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private static final QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");
    private static final QName _ListAccount_QNAME = new QName("http://ws/", "listAccount");
    private static final QName _ListAccountResponse_QNAME = new QName("http://ws/", "listAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EuroToXofConversion }
     * 
     * @return
     *     the new instance of {@link EuroToXofConversion }
     */
    public EuroToXofConversion createEuroToXofConversion() {
        return new EuroToXofConversion();
    }

    /**
     * Create an instance of {@link EuroToXofConversionResponse }
     * 
     * @return
     *     the new instance of {@link EuroToXofConversionResponse }
     */
    public EuroToXofConversionResponse createEuroToXofConversionResponse() {
        return new EuroToXofConversionResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link ListAccount }
     * 
     * @return
     *     the new instance of {@link ListAccount }
     */
    public ListAccount createListAccount() {
        return new ListAccount();
    }

    /**
     * Create an instance of {@link ListAccountResponse }
     * 
     * @return
     *     the new instance of {@link ListAccountResponse }
     */
    public ListAccountResponse createListAccountResponse() {
        return new ListAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToXofConversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroToXofConversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "euroToXofConversion")
    public JAXBElement<EuroToXofConversion> createEuroToXofConversion(EuroToXofConversion value) {
        return new JAXBElement<>(_EuroToXofConversion_QNAME, EuroToXofConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToXofConversionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroToXofConversionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "euroToXofConversionResponse")
    public JAXBElement<EuroToXofConversionResponse> createEuroToXofConversionResponse(EuroToXofConversionResponse value) {
        return new JAXBElement<>(_EuroToXofConversionResponse_QNAME, EuroToXofConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listAccount")
    public JAXBElement<ListAccount> createListAccount(ListAccount value) {
        return new JAXBElement<>(_ListAccount_QNAME, ListAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listAccountResponse")
    public JAXBElement<ListAccountResponse> createListAccountResponse(ListAccountResponse value) {
        return new JAXBElement<>(_ListAccountResponse_QNAME, ListAccountResponse.class, null, value);
    }

}
