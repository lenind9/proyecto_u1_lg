package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {
	public void inventario(String nombre, String cantidad, BigDecimal precio, LocalDateTime fecha);
	
	public void buscarInventario(LocalDateTime fecha);
	
	public void agregar(Producto p);
	
	public void mostrarInventario();
}
