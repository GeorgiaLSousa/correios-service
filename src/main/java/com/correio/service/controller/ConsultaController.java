package com.correio.service.controller;

import com.correio.service.dto.ConsultaFreteResponse;
import com.correio.service.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    /*
     * Endpoint para consultar o frete baseado no CEP.
     * @param cep o CEP a ser consultado

     */
    @GetMapping("/{cep}")
    public ConsultaFreteResponse consultaFrete(@PathVariable String cep) {
        return consultaService.consultaFrete(cep);
    }



}
