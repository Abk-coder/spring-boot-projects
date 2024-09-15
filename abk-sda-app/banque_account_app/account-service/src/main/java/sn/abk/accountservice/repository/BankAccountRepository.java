package sn.abk.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.abk.accountservice.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

}
