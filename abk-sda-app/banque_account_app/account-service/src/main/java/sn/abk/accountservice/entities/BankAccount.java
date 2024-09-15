package sn.abk.accountservice.entities;

import jakarta.persistence.*;
import lombok.*;
import sn.abk.accountservice.enums.AccountType;
import sn.abk.accountservice.model.Customer;

import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING) //to save enum as string into db
    private AccountType type;
    @Transient //ignore this attribute. Exists into the class but not in db
    private Customer customer;
    private Long customerId;

}
