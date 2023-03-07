package com.example.demo0603gestioncitas;

import com.example.demo0603gestioncitas.consola.ConsolaReader;
import com.example.demo0603gestioncitas.service.CitaService;
import com.example.demo0603gestioncitas.service.impl.CitaServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitasApplication.class, args);
		//ConsolaReader consolaReader = new ConsolaReader(new CitaServiceImpl(new CitaRepositoryMemory()));
		//consolaReader.init();
		ConsolaReader consolaReader = new ConsolaReader(new CitaServiceImpl(new CitaRepositoryMemory()));

	}

}
