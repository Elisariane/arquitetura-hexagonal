package com.elisariane.arquiteturahexagonal.adapters.out.client.mapper;

import com.elisariane.arquiteturahexagonal.adapters.out.client.response.AddressResponse;
import com.elisariane.arquiteturahexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address  toAddress(AddressResponse addressResponse);
}
