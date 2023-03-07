package com.example.demo0603gestioncitas.service;

import com.example.demo0603gestioncitas.domain.Cita;
import com.example.demo0603gestioncitas.repository.CitaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CitaService {
    void alta(Cita cita);
    void baja(Integer indice);
    List<Cita> listar();
}
