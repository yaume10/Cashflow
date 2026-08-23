package com.jaume.cashflow_backend.controllers;

import com.jaume.cashflow_backend.entities.Categoria;
import com.jaume.cashflow_backend.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
@CrossOrigin(origins = "*")

public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }

}
