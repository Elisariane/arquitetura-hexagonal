package com.elisariane.arquiteturahexagonal.application.ports.out;

import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
