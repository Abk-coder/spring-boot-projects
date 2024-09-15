package abk.sn.customerservice;

import abk.sn.customerservice.entities.Customer;
import abk.sn.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(
                    Customer.builder()
                            .name("Abdoul Khadre")
                            .email("abk@gmailcom")
                            .build()
            );
            customerRepository.save(
                    Customer.builder()
                            .name("Fatoumata")
                            .email("fatou@Gmal.om")
                            .build()
            );
            customerRepository.save(
                    Customer.builder()
                            .name("Mouhamed")
                            .email("mouhamed@gmail.com")
                            .build()
            );
        };
    }

}
