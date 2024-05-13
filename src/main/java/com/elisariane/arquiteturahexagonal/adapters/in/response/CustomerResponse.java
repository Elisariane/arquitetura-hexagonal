package com.elisariane.arquiteturahexagonal.adapters.in.response;

import com.elisariane.arquiteturahexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;

}
