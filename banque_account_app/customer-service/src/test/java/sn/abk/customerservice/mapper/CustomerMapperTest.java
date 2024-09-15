package sn.abk.customerservice.mapper;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import sn.abk.customerservice.dtos.CustomerDTO;
import sn.abk.customerservice.entities.Customer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerMapperTest {
    CustomerMapper underTest = new CustomerMapper();

    @Test
    public void shouldMapCustomerToCustomerDTO(){
        Customer givenCustomer = Customer.builder()
                .id(1L).firstName("Yagouba").lastName("Barry").email("yaoub@gmail.com").build();
        CustomerDTO expected = CustomerDTO.builder()
                .id(1L).firstName("Yagouba").lastName("Barry").email("yaoub@gmail.com").build();

        CustomerDTO result = underTest.fromCustomer(givenCustomer);
        AssertionsForClassTypes.assertThat(result).isNotNull();
        AssertionsForClassTypes.assertThat(expected).usingRecursiveComparison().isEqualTo(result);
    }

    @Test
    public void shouldMapCustomerDTOToCustomer(){
        CustomerDTO givenCustomerDTO = CustomerDTO.builder()
                .id(1L)
                .firstName("Yagouba")
                .lastName("Barry")
                .email("yaoub@gmail.com")
                .build();
        Customer expected = Customer.builder()
                .id(1L)
                .firstName("Yagouba")
                .lastName("Barry")
                .email("yaoub@gmail.com")
                .build();

        Customer result = underTest.fromCustomerDTO(givenCustomerDTO);
        AssertionsForClassTypes.assertThat(result).isNotNull();
        AssertionsForClassTypes.assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void shouldMapListOfCustomersToListOfCustomerDTOs(){
        List<Customer> givenCustomers = List.of(
                Customer.builder()
                        .id(1L).firstName("Yagouba").lastName("Barry").email("yaoub@gmail.com").build(),
                Customer.builder()
                        .id(2L).firstName("Adama").lastName("Diallo").email("adama@gmail.com").build(),
                Customer.builder()
                        .id(3L).firstName("Maimouna").lastName("Diallo").email("may@gmail.com").build()
        );

        List<CustomerDTO> expected = List.of(
                CustomerDTO.builder()
                        .id(1L).firstName("Yagouba").lastName("Barry").email("yaoub@gmail.com").build(),
                CustomerDTO.builder()
                        .id(2L).firstName("Adama").lastName("Diallo").email("adama@gmail.com").build(),
                CustomerDTO.builder()
                        .id(3L).firstName("Maimouna").lastName("Diallo").email("may@gmail.com").build()
        );
        List<CustomerDTO> results = underTest.fromListCustomers(givenCustomers);
        AssertionsForClassTypes.assertThat(results).isNotNull();
        AssertionsForClassTypes.assertThat(expected).usingRecursiveComparison().isEqualTo(results);
    }

    @Test
    public void shouldNotMapNullCustomerToCustomerDTO(){
        Customer givenCustomer = null;
        AssertionsForClassTypes.assertThatThrownBy(()->underTest.fromCustomer(givenCustomer))
                .isInstanceOf(IllegalArgumentException.class);
    }

}