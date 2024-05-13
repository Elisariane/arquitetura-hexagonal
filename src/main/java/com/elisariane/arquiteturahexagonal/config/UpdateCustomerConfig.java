package com.elisariane.arquiteturahexagonal.config;

import com.elisariane.arquiteturahexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.elisariane.arquiteturahexagonal.adapters.out.UpdateCustomerAdapter;
import com.elisariane.arquiteturahexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.elisariane.arquiteturahexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerAdapter(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCodeAdapter findAddressByZipCodeAdapter, UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter,updateCustomerAdapter );

    }
}
