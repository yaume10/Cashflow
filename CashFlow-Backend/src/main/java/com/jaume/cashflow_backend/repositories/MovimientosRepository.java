package com.jaume.cashflow_backend.repositories;

import com.jaume.cashflow_backend.entities.Movimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientosRepository extends JpaRepository<Movimientos, Long> {

}
