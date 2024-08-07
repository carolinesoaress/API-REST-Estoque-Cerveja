package com.exemplo.estoquecerveja.repository;

import com.exemplo.estoquecerveja.model.Cerveja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CervejaRepository extends JpaRepository<Cerveja, Long> {
}
