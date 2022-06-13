package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {
	public Producto insertarProducto(String nombre, String cantidad, BigDecimal precio, LocalDateTime fecha);
	
	public Producto buscarProducto(String nombre);
	public void actualizarProducto(Producto p);
	public void eliminarProducto(String nombre);
}
