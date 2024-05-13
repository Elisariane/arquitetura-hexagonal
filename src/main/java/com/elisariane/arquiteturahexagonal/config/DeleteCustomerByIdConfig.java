package com.elisariane.arquiteturahexagonal.config;

import com.elisariane.arquiteturahexagonal.adapters.out.DeleteCustomerAdapter;
import com.elisariane.arquiteturahexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.elisariane.arquiteturahexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase insertCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerAdapter deleteCustomerAdapter) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerAdapter);
    }
}
