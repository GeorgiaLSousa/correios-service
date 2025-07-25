package com.correio.service.service;

import com.correio.service.dto.ConsultaFreteResponse;


public interface ConsultaService {
    /**
     * Consulta o frete para um determinado CEP.
     */
    ConsultaFreteResponse consultaFrete(String cep);
}
