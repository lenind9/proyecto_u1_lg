package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void crear(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Inventario creado: " + i);
	}

	@Override
	public Inventario buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Inventario buscado: " + id);
		Inventario i = new Inventario();
		i.setId(id);
		return i;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Inventario actualizado: " + i);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Inventario eliminadoo: " + id);
	}
	
	
	
}
