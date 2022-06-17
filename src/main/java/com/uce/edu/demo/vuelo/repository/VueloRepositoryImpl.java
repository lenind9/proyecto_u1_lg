package com.uce.edu.demo.vuelo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vuelo.modelo.Vuelo;

@Repository
public class VueloRepositoryImpl implements IVueloRepository {

	@Override
	public void insertar(Vuelo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el vuelo: " + v);
	}

	@Override
	public Vuelo buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el vuelo: " + numero);
		Vuelo v = new Vuelo();
		v.setNumero(numero);
		return v;
	}

	@Override
	public void actualizar(Vuelo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el vuelo: " + v);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el vuelo: " + numero);
	}

}
