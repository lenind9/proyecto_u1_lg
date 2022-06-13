package com.uce.edu.demo.bodega.modelo;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
	private String id;
	List<Producto> listaProductos = new ArrayList<>();
	
	@Override
	public String toString() {
		return "Inventario [id=" + id + ", listaProductos=" + listaProductos + "]";
	}

	//SET y GET
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
