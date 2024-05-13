package com.elisariane.arquiteturahexagonal.application.core.usecase;

import com.elisariane.arquiteturahexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.elisariane.arquiteturahexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.elisariane.arquiteturahexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    private DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);

        deleteCustomerByIdOutputPort.delete(id);
    }

}
