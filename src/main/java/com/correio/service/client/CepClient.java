package com.correio.service.client;

import com.correio.service.dto.EnderecoResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CepClient {

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${api.cep.url}")
    private String cepApiUrl;

    public EnderecoResponse buscarCep(String cep) {

        String url = cepApiUrl + cep + "/json";


        System.out.println("Consultando URL: " + url);


        EnderecoResponse response = restTemplate.getForObject(url, EnderecoResponse.class);

        return response;
    }
}