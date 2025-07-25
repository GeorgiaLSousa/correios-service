package com.correio.service.service;


import org.springframework.stereotype.Service;

@Service
public class CalcularFreteService implements FreteService{

    /* Implementação do metodo CalcularFrete para calcular
     *           valor do frete com base na UF */

    @Override
    public Double CalcularFrete(String uf) {

        switch (uf.toUpperCase()) {
            case "SP":
            case "RJ":
            case "MG":
            case "ES":
                return 7.85; // Região Sudeste

            case "PR":
            case "SC":
            case "RS":
                return 17.30; // Região Sul

            case "DF":
            case "GO":
            case "MT":
            case "MS":
                return 12.50; // Região Centro-Oeste

            case "AL":
            case "BA":
            case "CE":
            case "MA":
            case "PB":
            case "PE":
            case "PI":
            case "RN":
            case "SE":
                return 15.98; // Região Nordeste

            default:
                return 20.83; // Região Norte e outros casos
        }
    }
}
