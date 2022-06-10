package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el deposito: " + d);
	}

	@Override
	public Deposito buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se busco el deposito: " + id);
		Deposito d = new Deposito();
		d.setId(id);
		return d;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el deposito: " + d);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el deposito: " + id);
	}
	
}
