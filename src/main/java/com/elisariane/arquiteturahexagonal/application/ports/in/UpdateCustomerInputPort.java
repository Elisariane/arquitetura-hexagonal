package com.elisariane.arquiteturahexagonal.application.ports.in;

import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer,String zipCode);

}
