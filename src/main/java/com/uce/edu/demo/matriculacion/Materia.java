package com.uce.edu.demo.matriculacion;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	private String nombre;
	private int numeroHoras;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
}
