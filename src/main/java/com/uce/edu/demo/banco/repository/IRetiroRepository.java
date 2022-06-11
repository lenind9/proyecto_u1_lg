package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	public void insertarRetiro(Retiro r);
	public Retiro buscar(String id);
	public void actualizar(Retiro r);
	public void eliminar(String id);
	
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
