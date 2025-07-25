package com.correio.service.service;

import com.correio.service.dto.ConsultaFreteResponse;


public interface ConsultaService {
    ConsultaFreteResponse consultaFrete(String cep);
}
