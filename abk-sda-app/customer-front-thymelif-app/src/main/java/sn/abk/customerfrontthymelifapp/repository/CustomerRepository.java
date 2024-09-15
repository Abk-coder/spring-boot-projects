package sn.abk.customerfrontthymelifapp.repository;

import lombok.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;
import sn.abk.customerfrontthymelifapp.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
