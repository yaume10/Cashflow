package com.jaume.cashflow_backend.repositories;

import com.jaume.cashflow_backend.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, String> {

}
