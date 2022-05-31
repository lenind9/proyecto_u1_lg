package com.uce.edu.demo.matriculacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class MatriculaConstructor {
private LocalDateTime fechaMatricula;
	
	private Estudiante estudiante;
	private Materia materia;
	
	//2) Inyeccion de dependencia (DI) por constructor
	public MatriculaConstructor(Estudiante estudiante, Materia materia) {
		this.estudiante = estudiante;
		this.materia = materia;
	}
	
	public String matricular(LocalDateTime fechaMatricula, String nombre, String apellido, LocalDate fechaNacimiento, String nombreMateria, int numeroHoras) {
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setFechaNacimiento(fechaNacimiento);
		
		this.materia.setNombre(nombreMateria);
		this.materia.setNumeroHoras(numeroHoras);
		
		//Seteamos los atributos de matricula
		this.fechaMatricula = fechaMatricula;
		//Se inserta una matricula en la base de datos
		return "Matricula con DI por constructor completada";
	}
	
	//SET y GET
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
}
