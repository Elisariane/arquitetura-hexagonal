package com.elisariane.arquiteturahexagonal.application.ports.in;

import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
