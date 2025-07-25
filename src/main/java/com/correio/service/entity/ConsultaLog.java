package com.correio.service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@Entity
public class ConsultaLog {

    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private Double valorFrete;
    private LocalDateTime dataConsulta;

    public ConsultaLog(String cep, String logradouro, String bairro, String cidade, String uf, Double valorFrete) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.valorFrete = valorFrete;
        this.dataConsulta = LocalDateTime.now();
    }

}
