package sn.abk.customerservice.repository;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import sn.abk.customerservice.entities.Customer;

import java.util.List;
import java.util.Optional;

@ActiveProfiles("test")
@DataJpaTest
public class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    public void setup(){
        List<Customer> customerList = List.of(
                Customer.builder()
                        .firstName("Abdoul")
                        .lastName("DIALLO")
                        .email("abdou@gmail.com")
                        .build(),
                Customer.builder()
                        .firstName("Fatou")
                        .lastName("Barry")
                        .email("fatou@gmail.com")
                        .build(),
                Customer.builder()
                        .firstName("Mouhamed")
                        .lastName("Diallo")
                        .email("moha@gmail.com")
                        .build()
        );
        customerRepository.saveAll(customerList);
    }

    @Test
    public void shouldFindCustomerByEmail(){
        String givenEmail = "abdou@gmail.com";
        Optional<Customer> result = customerRepository.findByEmail(givenEmail);
        AssertionsForClassTypes.assertThat(result).isPresent();
    }

    @Test
    public void shouldNotFindCustomerByEmail(){
        String givenEmail = "xxxxx@gmail.com";
        Optional<Customer> result = customerRepository.findByEmail(givenEmail);
        AssertionsForClassTypes.assertThat(result).isEmpty();
    }

    @Test
    public void shouldFindByFirstNameContainsIgnoreCase(){
        String keyword = "a";
        List<Customer> expected = List.of(
                Customer.builder()
                        .firstName("Abdoul")
                        .lastName("DIALLO")
                        .email("abdou@gmail.com")
                        .build(),
                Customer.builder()
                        .firstName("Fatou")
                        .lastName("Barry")
                        .email("fatou@gmail.com")
                        .build(),
                Customer.builder()
                        .firstName("Mouhamed")
                        .lastName("Diallo")
                        .email("moha@gmail.com")
                        .build()
        );
        List<Customer> results = customerRepository.findByFirstNameContainsIgnoreCase(keyword);
        AssertionsForClassTypes.assertThat(results).isNotNull();
        AssertionsForClassTypes.assertThat(results.size()).isEqualTo(expected.size());
        AssertionsForClassTypes.assertThat(results).usingRecursiveComparison().ignoringFields("id").isEqualTo(expected);
    }

}