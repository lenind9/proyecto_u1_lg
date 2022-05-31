package com.uce.edu.demo.matriculacion;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

//Agregando metadata
@Component
public class Estudiante {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
