package com.example.demo0603gestioncitas.service.impl;

import com.example.demo0603gestioncitas.domain.Cita;
import com.example.demo0603gestioncitas.repository.CitaRepository;
import com.example.demo0603gestioncitas.service.CitaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitaServiceImpl implements CitaService {
    CitaRepository citaRepository;
    public CitaServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public void alta(Cita cita){
        citaRepository.alta(cita);
    }

    public void baja(Integer indice){
        citaRepository.baja(indice);

    }
    public List<Cita> listar(){
        return citaRepository.listar();
    }
}
