package sn.abk.customerfrontthymelifapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.abk.customerfrontthymelifapp.entities.Customer;
import sn.abk.customerfrontthymelifapp.repository.CustomerRepository;

@SpringBootApplication
public class CustomerFrontThymelifAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerFrontThymelifAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Mouhamed").email("mouhamed@ggmail.com").build());
            customerRepository.save(Customer.builder().name("Abdoul").email("abdoul@ggmail.com").build());
            customerRepository.save(Customer.builder().name("Aicha").email("aicha@ggmail.com").build());

        };
    }

}
