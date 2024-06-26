package com.elisariane.arquiteturahexagonal.application.core.usecase;

import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;
import com.elisariane.arquiteturahexagonal.application.ports.in.InsertCustomerInputPort;
import com.elisariane.arquiteturahexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.elisariane.arquiteturahexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;


    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
