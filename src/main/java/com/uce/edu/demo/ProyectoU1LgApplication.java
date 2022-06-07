package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1LgApplication implements CommandLineRunner {
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Materia");
		
		Materia m = new Materia();
		m.setNombre("Inteligencia Artificial");
		m.setSemestre("Sexto");
		
		this.materiaService.insertarMateria(m);
		
		this.materiaService.buscarPorNombre("Inteligencia Artificial");
		
		m.setNombre("Programacion Avanzada II");
		this.materiaService.actualizarMateria(m);
		
		this.materiaService.borrarMateria("Programacion Avanzada II");
		
		System.out.println("Matricula");
		
		Estudiante e = new Estudiante();
		e.setNombre("Lenin");
		e.setApellido("Guananga");
		e.setCedula("1750368084");
		
		Materia m1 = new Materia();
		m1.setNombre("Redes y Protocolos de Comunicación");
		m1.setSemestre("Sexto");
		
		List<Materia> lista = new ArrayList<Materia>();
		lista.add(m);
		lista.add(m1);
		Matricula mtr = new Matricula();
		mtr.setNumero("55497226");
		mtr.setEstudiante(e);
		mtr.setMateria(lista);
		
		this.matriculaService.insertarMatricula(mtr);
		
		this.matriculaService.buscarPorNumero("55497226");
		
		mtr.setNumero("49863326");
		this.matriculaService.actualizarMatricula(mtr);
		
		this.matriculaService.borrarMatricula("49863326");
	}

}
