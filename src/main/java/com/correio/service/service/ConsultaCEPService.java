package com.correio.service.service;

import com.correio.service.client.CepClient;
import com.correio.service.dto.EnderecoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.correio.service.service.ConsultaService;
import com.correio.service.dto.ConsultaFreteResponse;

@Service
public class ConsultaCEPService implements ConsultaService {

    @Autowired
    private CepClient cepClient;

    @Autowired
    private FreteService freteService;


    @Override
    public ConsultaFreteResponse consultaFrete(String cep){

        EnderecoResponse endereco = cepClient.buscarCep(cep);

        String uf = endereco.getUf();

        Double valorFrete = freteService.CalcularFrete(uf);

        return new ConsultaFreteResponse(
                endereco.getCep(),
            endereco.getLogradouro(),
            endereco.getBairro(),
            endereco.getLocalidade(),
            endereco.getUf(),
                valorFrete
        );

    }

}
