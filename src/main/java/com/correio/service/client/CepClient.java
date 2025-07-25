package com.correio.service.client;

import com.correio.service.dto.EnderecoResponse;
import com.correio.service.exception.CepInexistente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class CepClient {

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${api.cep.url}")
    private String cepApiUrl;

    public EnderecoResponse buscarCep(String cep) {

        String url = cepApiUrl + cep + "/json";


        System.out.println("Consultando URL: " + url);


        try {
            EnderecoResponse response = restTemplate.getForObject(url, EnderecoResponse.class);

            // 2. VERIFICAÇÃO IMPORTANTE:
            // Se a resposta não for nula e o campo 'logradouro' for nulo,
            // significa que o ViaCEP retornou {"erro": true}.
            if (response != null && response.getLogradouro() == null) {
                throw new CepInexistente("CEP não encontrado ou inválido: " + cep);
            }

            return response;

        } catch (HttpClientErrorException.BadRequest e) {
            // 3. Captura um erro 400 (Bad Request), que o ViaCEP retorna para CEPs com formato inválido.
            throw new CepInexistente("Formato de CEP inválido: " + cep);
        }


    }
}