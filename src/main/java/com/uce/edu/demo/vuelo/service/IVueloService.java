package com.uce.edu.demo.vuelo.service;

import com.uce.edu.demo.vuelo.modelo.Vuelo;

public interface IVueloService {
	public void crearVuelo(Vuelo v);

	public Vuelo buscarPorNumero(String numero);

	public void actualizarVuelo(Vuelo v);

	public void borrarVuelo(String numero);
}
