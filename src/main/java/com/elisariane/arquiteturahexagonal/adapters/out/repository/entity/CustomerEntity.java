package com.elisariane.arquiteturahexagonal.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    private String id;
    private String name;
    private AddressEntity addressEntity;
    private String cpf;
    private Boolean isValidCpf;
}
