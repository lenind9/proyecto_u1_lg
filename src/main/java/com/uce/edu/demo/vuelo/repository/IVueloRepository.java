package com.uce.edu.demo.vuelo.repository;

import com.uce.edu.demo.vuelo.modelo.Vuelo;

public interface IVueloRepository {
	public void insertar(Vuelo v);
			
	public Vuelo buscar(String numero);
			
	public void actualizar(Vuelo v);
			
	public void eliminar(String numero);
}
