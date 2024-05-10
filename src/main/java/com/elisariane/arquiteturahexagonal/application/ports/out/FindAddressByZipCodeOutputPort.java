package com.elisariane.arquiteturahexagonal.application.ports.out;

import com.elisariane.arquiteturahexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
