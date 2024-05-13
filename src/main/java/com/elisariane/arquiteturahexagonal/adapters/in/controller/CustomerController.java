package com.elisariane.arquiteturahexagonal.adapters.in.controller;

import com.elisariane.arquiteturahexagonal.adapters.in.mapper.CustomerMapper;
import com.elisariane.arquiteturahexagonal.adapters.in.request.CustomerRequest;
import com.elisariane.arquiteturahexagonal.adapters.in.response.CustomerResponse;
import com.elisariane.arquiteturahexagonal.application.core.domain.Customer;
import com.elisariane.arquiteturahexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.elisariane.arquiteturahexagonal.application.ports.in.InsertCustomerInputPort;
import com.elisariane.arquiteturahexagonal.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

   @PutMapping("/{id}")
   public  ResponseEntity<Void> update(@PathVariable final String id, @RequestBody CustomerRequest customerRequest){
       Customer customer = customerMapper.toCustomer(customerRequest);
       customer.setId(id);

       updateCustomerInputPort.update(customer, customerRequest.getZipCode());

       return ResponseEntity.noContent().build();

   }



}
