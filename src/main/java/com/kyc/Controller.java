package com.kyc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kyc.model.Anagrafica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Controller {

    @Autowired
    private HttpClient client;

    @GetMapping("/{vat_number}")
    public Anagrafica getCustomer(@PathVariable String vat_number) throws JsonProcessingException {
        return client.getCustomer(vat_number);
    }
}
