package com.jaume.cashflow_backend.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movimientos")

public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private Double importe;
    private String descripcion;

    // Esto conecta con la Foreign Key id_categoria de la bbdd
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Movimiento() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
