package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el retiro: " + r);
	}

	@Override
	public Retiro buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se busco el retiro: " + id);
		Retiro r = new Retiro();
		r.setId(id);
		return r;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el retiro: " + r);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el retiro: " + id);
	}
	
}
