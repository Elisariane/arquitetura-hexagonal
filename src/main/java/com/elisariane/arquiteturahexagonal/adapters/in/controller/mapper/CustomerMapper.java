package com.elisariane.arquiteturahexagonal.adapters.in.controller.mapper;

import com.elisariane.arquiteturahexagonal.adapters.in.controller.request.CustomerRequest;
import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

}
