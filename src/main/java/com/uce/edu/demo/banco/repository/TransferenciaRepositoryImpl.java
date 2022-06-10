package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos: " + t);
	}

	@Override
	public Transferencia buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se busca en la base la transferencia: " + id);
		Transferencia t = new Transferencia();
		t.setId(id);
		return t;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se actualiza la transferencia en la base de datos: " + t);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se elimina la transferencia en la base de datos: " + id);
	}

}
