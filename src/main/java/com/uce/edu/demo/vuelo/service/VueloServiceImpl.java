package com.uce.edu.demo.vuelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vuelo.modelo.Vuelo;
import com.uce.edu.demo.vuelo.modelo.VueloInternacional;
import com.uce.edu.demo.vuelo.modelo.VueloNacional;
import com.uce.edu.demo.vuelo.repository.IVueloRepository;

@Service
public class VueloServiceImpl implements IVueloService {
	
	@Autowired
	private IVueloRepository iVueloRepository;
	
	@Autowired
	private VueloNacional vueloNacional;
	
	@Autowired
	private VueloInternacional vueloInternacional;

	@Override
	public void crearVuelo(Vuelo v) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON: " + this.vueloNacional);
		System.out.println("DI desde Service PROTOTYPE: " + this.vueloInternacional);
		this.iVueloRepository.insertar(v);
	}

	@Override
	public Vuelo buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iVueloRepository.buscar(numero);
	}

	@Override
	public void actualizarVuelo(Vuelo v) {
		// TODO Auto-generated method stub
		this.iVueloRepository.actualizar(v);
	}

	@Override
	public void borrarVuelo(String numero) {
		// TODO Auto-generated method stub
		this.iVueloRepository.eliminar(numero);
	}

}
