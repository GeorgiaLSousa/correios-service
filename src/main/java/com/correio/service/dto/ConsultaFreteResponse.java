package com.correio.service.dto;

import lombok.Data;

@Data
public class ConsultaFreteResponse {

    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private double valorFrete;

}
