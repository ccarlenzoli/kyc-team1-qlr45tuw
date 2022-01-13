package com.kyc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyc.model.Anagrafica;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HttpClient {

    RestTemplate restTemplate = new RestTemplate();

    String url = "http://192.46.232.80:9090/kyc/vat-number/";

    ObjectMapper mapper = new ObjectMapper();

    public Anagrafica getCustomer(String vat_number) throws JsonProcessingException {
        return mapper.readValue(restTemplate.getForEntity(url + vat_number, String.class).getBody(),Anagrafica.class);
    }

}