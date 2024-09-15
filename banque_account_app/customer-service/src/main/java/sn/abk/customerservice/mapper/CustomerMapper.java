package sn.abk.customerservice.mapper;

import org.modelmapper.ModelMapper;
import sn.abk.customerservice.dtos.CustomerDTO;
import sn.abk.customerservice.entities.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public CustomerDTO fromCustomer(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);

    }
    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        return modelMapper.map(customerDTO, Customer.class);
    }
    public List<CustomerDTO> fromListCustomers(List<Customer> customers){
        return customers.stream().map(c->modelMapper.map(c, CustomerDTO.class)).collect(Collectors.toList());
    }
}
