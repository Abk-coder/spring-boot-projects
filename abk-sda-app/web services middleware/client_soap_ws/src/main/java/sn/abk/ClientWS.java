package sn.abk;

import proxy.Account;
import proxy.BanqueService;
import proxy.BanqueWS;

import java.util.List;

// app orientee object distribuee
public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.euroToXofConversion(2500));

        Account ac = proxy.getAccount(5);
        System.out.println("Code: "+ ac.getCode());
        System.out.println("Amount: " + ac.getAmount());
        System.out.println("Date creation: " + ac.getCreationDate());

        List<Account> accountList = proxy.listAccount();
        for (Account a : accountList) {
            System.out.println("------------------------");
            System.out.println("Code: "+ a.getCode());
            System.out.println("Amount: " + a.getAmount());
            System.out.println("Date creation: " + a.getCreationDate());
        }
    }
}
