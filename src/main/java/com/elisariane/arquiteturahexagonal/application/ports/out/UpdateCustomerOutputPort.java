package com.elisariane.arquiteturahexagonal.application.ports.out;

import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
