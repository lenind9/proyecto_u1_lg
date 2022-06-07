package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1LgApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estudiante e = new Estudiante();
		e.setNombre("Lenin");
		e.setApellido("Guananga");
		e.setCedula("1750368085");
		this.estudianteService.insertarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e.setNombre("Pepito");
		e.setApellido("Perez");
		e.setCedula("0945221982");
		this.estudianteService.insertarEstudiante(e1);
		
		//Usar los 3 metodos restantes
		e.setCedula("1750368084");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Guananga");
		
		this.estudianteService.borrarEstudiante("0945221982");
	}

}
