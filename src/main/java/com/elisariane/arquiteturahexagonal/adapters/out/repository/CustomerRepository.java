package com.elisariane.arquiteturahexagonal.adapters.out.repository;

import com.elisariane.arquiteturahexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
