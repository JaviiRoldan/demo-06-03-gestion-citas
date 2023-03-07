package com.example.demo0603gestioncitas.consola;

import com.example.demo0603gestioncitas.domain.Cita;
import com.example.demo0603gestioncitas.service.CitaService;
import com.example.demo0603gestioncitas.service.impl.CitaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@Controller
public class ConsolaReader{
    CitaService citaService;

    public ConsolaReader(CitaServiceImpl citaService) {
        this.citaService = citaService;
    }

    public void init(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fechaFormateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));
        String entradaConsola;
        int opcion = 1;
        while(opcion!=0){
            System.out.println("Menu por consola");
            System.out.println("1.- Resgistrar nueva cita");
            System.out.println("2.- Modificar una cita");
            System.out.println("3.- Listar todas las citas");
            System.out.println("4.- Borrar cita");
            System.out.println("0.- Salir");
            System.out.println("Ingresa la accion a realizar");

            entradaConsola = sc.next();
            try{
                opcion = Integer.parseInt(entradaConsola);
            }catch(Exception e){
                System.out.println("Opcion no válida, ingresa un número");
            }
            switch (opcion){
                case 0:
                    System.out.println("Hasta luego");
                    break;
                case 1:
                    System.out.println("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese apellidos: ");
                    String apellidos = sc.next();
                    System.out.println("Ingrese fecha (dd/MM/YYYY HH:mm:ss): ");
                    String fecha = sc.nextLine();

                    Date fechaCita;
                    try{
                        fechaCita = fechaFormateador.parse(sc.nextLine());
                        citaService.alta(new Cita(nombre,apellidos,fechaCita));

                    }catch(Exception e){
                        //throw new RuntimeException(e)
                        System.out.println("Formato fecha no valida");
                    }
                    break;
                case 2:
                    //TODO Por desarrollar
                case 3:
                    List<Cita> citas = citaService.listar();
                    System.out.println("Listado de citas");
                    for(Cita cita: citas){
                        System.out.printf("Id: %s, nombre: %s, apellidos: %s, fecha: %s",citas.indexOf(cita),cita.getNombre(),cita.getApellidos(),fechaFormateador.format(cita.getFecha()));
                        System.out.println();
                    }
                    break;
                case 4:
                    //TODO Por desarrollar
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
