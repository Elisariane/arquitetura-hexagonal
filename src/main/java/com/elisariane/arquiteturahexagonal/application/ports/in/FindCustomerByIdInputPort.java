package com.elisariane.arquiteturahexagonal.application.ports.in;

import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
