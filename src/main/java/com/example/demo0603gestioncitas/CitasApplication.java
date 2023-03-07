package com.example.demo0603gestioncitas;

import com.example.demo0603gestioncitas.consola.ConsolaReader;
import com.example.demo0603gestioncitas.repository.CitaRepository;
import com.example.demo0603gestioncitas.repository.impl.CitaRepositoryMemory;
import com.example.demo0603gestioncitas.service.impl.CitaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitasApplication.class, args);
		ConsolaReader consolaReader = new ConsolaReader(new CitaServiceImpl(new CitaRepositoryMemory()));
		//ConsolaReader consolaReader = ConsolaReader(CitaServiceImpl(CitaRepository()));// = new ConsolaReader(new CitaServiceImpl(new CitaRepositoryMemory()));
		consolaReader.init();


	}

}
