package com.elisariane.arquiteturahexagonal.adapters.out.repository.mapper;

import com.elisariane.arquiteturahexagonal.adapters.out.repository.entity.CustomerEntity;
import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCostumer(CustomerEntity customerEntity);
}
