//package sn.abk.customerservice.web;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import sn.abk.customerservice.entities.Customer;
//import sn.abk.customerservice.repository.CustomerRepository;
//
//import java.util.List;
//
//@RestController
////@RequestMapping("/api")
//public class CustomerRestController {
//    private final CustomerRepository customerRepository;
//
//    public CustomerRestController(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//    @GetMapping("/customers")
//    public List<Customer> customerList(){
//        return customerRepository.findAll();
//    }
//    @GetMapping("/customers/{id}")
//    public Customer customerById(@PathVariable Long id){
//        return customerRepository.findById(id).get();
//    }
//}
