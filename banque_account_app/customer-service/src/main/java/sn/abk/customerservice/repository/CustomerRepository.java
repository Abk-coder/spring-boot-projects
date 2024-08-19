package sn.abk.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.abk.customerservice.entities.Customer;

//@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
