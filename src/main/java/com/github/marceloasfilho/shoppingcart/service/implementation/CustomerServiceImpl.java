package com.github.marceloasfilho.shoppingcart.service.implementation;

import com.github.marceloasfilho.shoppingcart.entity.Customer;
import com.github.marceloasfilho.shoppingcart.repository.CustomerRepository;
import com.github.marceloasfilho.shoppingcart.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findCustomerByEmail(String email) {
        return this.customerRepository.findCustomerByEmail(email);
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepository.save(customer);
    }
}
