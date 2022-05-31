package com.uce.edu.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.matriculacion.MatriculaAtributos;
import com.uce.edu.demo.matriculacion.MatriculaConstructor;
import com.uce.edu.demo.matriculacion.MatriculaSet;

@SpringBootApplication
public class ProyectoU1LgApplication implements CommandLineRunner {
	
	//1) Inyeccion de dependencias (DI) por atributo
	/*@Autowired
	private CitaMedica cita;*/
	
	/*@Autowired
	private CitaMedica2 cita;*/
	
	//1) Inyeccion de dependencias (DI) por atributo
	@Autowired
	private MatriculaAtributos matrAtr;
	
	//2) Inyeccion de dependencia (DI) por constructor
	@Autowired
	private MatriculaConstructor matrConstr;
	
	//3) Inyeccion de dependencia (DI) por metodo SET
	@Autowired
	private MatriculaSet matrSet;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto proyecto con Spring Framework");
		
		/*String respuesta = this.cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta);*/
		
		String matr = this.matrAtr.matricular(LocalDateTime.now(), "Lenin", "Guananga", LocalDate.of(1999, 12, 29), "Programacion Avanzada II", 32);
		System.out.println(matr);
	}

}
