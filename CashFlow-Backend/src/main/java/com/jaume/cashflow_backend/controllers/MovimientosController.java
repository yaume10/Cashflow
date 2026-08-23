package com.jaume.cashflow_backend.controllers;

import com.jaume.cashflow_backend.entities.Movimientos;
import com.jaume.cashflow_backend.repositories.MovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Le decimos a Spring que esto es una API REST (devolverá JSON, no HTML)
@RestController
// Definimos la URL base para este controlador
@RequestMapping("/api/movimientos")
// Permitimos que el Frontend pueda pedirle datos sin que el navegador lo
// bloquee por seguridad
@CrossOrigin(origins = "*")

public class MovimientosController {

    // Spring crea el objeto
    @Autowired
    private MovimientosRepository movimientosRepository;

    // Método que se ejecutará cuando alguien entre con su navegador por el método
    // GET
    @GetMapping
    public List<Movimientos> obtenerTodos() {
        return movimientosRepository.findAll();
    }

}
