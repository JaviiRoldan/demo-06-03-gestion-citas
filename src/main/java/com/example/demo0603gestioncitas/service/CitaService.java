package com.example.demo0603gestioncitas.service;

import com.example.demo0603gestioncitas.domain.Cita;
import java.util.List;

public interface CitaService {
    void alta(Cita cita);
    void baja(Integer indice);
    List<Cita> listar();
}
