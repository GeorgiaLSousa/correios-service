package com.correio.service.service;

public interface FreteService {
    /**
     * Calcula o valor do frete com base na UF.
     */
    Double CalcularFrete(String uf);
}
