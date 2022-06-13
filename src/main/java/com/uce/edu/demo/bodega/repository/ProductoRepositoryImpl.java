package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el producto: " + p);
	}

	@Override
	public Producto buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se busco el producto: " + nombre);
		Producto p = new Producto();
		p.setNombre(nombre);
		return p;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el producto: " + p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el producto: " + nombre);
	}

}
