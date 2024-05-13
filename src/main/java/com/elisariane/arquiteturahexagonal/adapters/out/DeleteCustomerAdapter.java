package com.elisariane.arquiteturahexagonal.adapters.out;

import com.elisariane.arquiteturahexagonal.adapters.out.repository.CustomerRepository;
import com.elisariane.arquiteturahexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteCustomerAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
