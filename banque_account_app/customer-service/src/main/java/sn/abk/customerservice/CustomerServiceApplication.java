package sn.abk.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import sn.abk.customerservice.config.GlobalConfig;
import sn.abk.customerservice.entities.Customer;
import sn.abk.customerservice.repository.CustomerRepository;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
     CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
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
                            .build()

            );
            customerRepository.saveAll(customerList);
        };
    }

}
