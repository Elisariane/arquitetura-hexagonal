package com.elisariane.arquiteturahexagonal.config;

import com.elisariane.arquiteturahexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.elisariane.arquiteturahexagonal.adapters.out.InsertCustomerAdapter;
import com.elisariane.arquiteturahexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter, InsertCustomerAdapter insertCustomerAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);

    }
}
