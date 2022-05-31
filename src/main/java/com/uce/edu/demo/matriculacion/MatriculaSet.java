package com.uce.edu.demo.matriculacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaSet {
	private LocalDateTime fechaMatricula;

	//3) Inyeccion de dependencia (DI) por metodo SET
	private Estudiante estudiante; //a su metodo SET le pongo @Autowired
	private Materia materia; //a su metodo SET le pongo @Autowired

	public String matricular(LocalDateTime fechaMatricula, String nombre, String apellido, LocalDate fechaNacimiento,
			String nombreMateria, int numeroHoras) {

		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setFechaNacimiento(fechaNacimiento);

		this.materia.setNombre(nombreMateria);
		this.materia.setNumeroHoras(numeroHoras);

		// Seteamos los atributos de matricula
		this.fechaMatricula = fechaMatricula;
		// Se inserta una matricula en la base de datos
		return "Matricula con DI por metodos SET completada";
	}

	// SET y GET
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	@Autowired
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	@Autowired
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
