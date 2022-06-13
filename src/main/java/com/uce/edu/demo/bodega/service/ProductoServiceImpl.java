package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	
	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Autowired
	private IGestorInventarioService gestorInventarioService;
	
	@Override
	public Producto insertarProducto(String nombre, String cantidad, BigDecimal precio, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		Producto prod = new Producto();
		prod.setNombre(nombre);
		prod.setCantidad(cantidad);
		prod.setPrecioCompra(gestorInventarioService.calculo(precio));
		prod.setFecha(fecha);
		return prod;
	}
	
	@Override
	public Producto buscarProducto(String nombre) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombre);
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public void eliminarProducto(String nombre) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(nombre);
	}
	
}
