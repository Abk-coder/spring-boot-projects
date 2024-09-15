package sn.abk.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.abk.customerservice.entities.Customer;

import java.util.List;
import java.util.Optional;

//@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Optional<Customer> findByEmail(String email);
    public List<Customer> findByFirstNameContainsIgnoreCase(String keyword);
}
