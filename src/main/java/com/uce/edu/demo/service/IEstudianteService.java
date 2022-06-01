package com.uce.edu.demo.service;

import com.uce.edu.demo.matriculacion.Estudiante;

public interface IEstudianteService {
	
	public void insertarEstudiante(Estudiante e);

	public Estudiante buscarPorApellido(String apellido);

	public void actualizarEstudiante(Estudiante e);

	public void borrarEstudiante(String cedula);
}
