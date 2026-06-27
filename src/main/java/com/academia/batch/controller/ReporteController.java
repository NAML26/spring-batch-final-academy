package com.academia.batch.controller;

import com.academia.batch.model.EstudianteReporte;
import com.academia.batch.repository.ReporteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    private final ReporteRepository repository;

    public ReporteController(ReporteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<EstudianteReporte> listar() {
        return repository.findAll();
    }

    @GetMapping("/estado/{estado}")
    public List<EstudianteReporte> porEstado(@PathVariable String estado) {
        return repository.findByEstado(estado);
    }
}