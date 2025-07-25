package com.correio.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaFreteResponse {


    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private double valorFrete;


}
