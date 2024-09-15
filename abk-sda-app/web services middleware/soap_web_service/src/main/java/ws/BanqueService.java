package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "euroToXofConversion")
    public double conversion(@WebParam(name = "amount") double mt){
        return 655*mt;
    }

    @WebMethod
    public Account getAccount(@WebParam(name = "code") int code){
        return new Account(code, Math.random()*60000, new Date());
    }

    @WebMethod
    public List<Account> listAccount(){
        return List.of(
                new Account(1, Math.random()*60000, new Date()),
                new Account(2, Math.random()*60000, new Date()),
                new Account(3, Math.random()*60000, new Date())
        );
    }
}
