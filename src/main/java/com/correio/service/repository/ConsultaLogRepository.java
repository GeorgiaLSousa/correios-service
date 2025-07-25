package com.correio.service.repository;

import com.correio.service.entity.ConsultaLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaLogRepository extends JpaRepository<ConsultaLog, Long> {

    // Aqui você pode adicionar métodos personalizados, se necessário
    // Exemplo: List<ConsultaLog> findByCep(String cep);
}
