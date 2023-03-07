package com.example.demo0603gestioncitas.repository;

import com.example.demo0603gestioncitas.domain.Cita;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CitaRepository {
    void alta(Cita cita);
    void baja(Integer indice);
    List<Cita> listar();
}
