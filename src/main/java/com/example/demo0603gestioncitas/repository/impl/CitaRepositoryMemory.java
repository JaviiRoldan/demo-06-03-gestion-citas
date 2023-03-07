package com.example.demo0603gestioncitas.repository.impl;

import com.example.demo0603gestioncitas.domain.Cita;
import com.example.demo0603gestioncitas.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CitaRepositoryMemory implements CitaRepository {
    private List<Cita> citas;
    public CitaRepositoryMemory() {
        citas = new ArrayList<>();
    }

    @Override
    public void alta(Cita cita) {
        citas.add(cita);
    }
    @Override
    public void baja(Integer indice) {
        citas.remove(indice);
    }
    @Override
    public List<Cita> listar() {
        return citas;
    }
}
