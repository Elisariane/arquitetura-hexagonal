package com.elisariane.arquiteturahexagonal.adapters.out;

import com.elisariane.arquiteturahexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.elisariane.arquiteturahexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.elisariane.arquiteturahexagonal.application.core.domain.Address;
import com.elisariane.arquiteturahexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);

    }
}
