package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;

@Service
public class InventarioServiceImpl implements IInventarioService {
	
	@Autowired
	private IGestorInventarioService gestorInventarioService;
	
	private List<Producto> listaInventario = new ArrayList<Producto>();
	
	private List<Producto> listaInventarioFecha = new ArrayList<Producto>();
	
	@Override
	public void inventario(String nombre, String cantidad, BigDecimal precio, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.gestorInventarioService.calculo(precio);
	}
	
	@Override
	public void buscarInventario(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		for(Producto p:this.listaInventario) {	
			if(p.getFecha().isAfter(fecha)) {
				this.listaInventarioFecha.add(p);
			}
		}
		System.out.println("Consulta por fecha: \n" + this.listaInventarioFecha.toString());
	}
	
	@Override
	public void agregar(Producto p) {
		// TODO Auto-generated method stub
		this.listaInventario.add(p);
	}

	@Override
	public void mostrarInventario() {
		// TODO Auto-generated method stub
		System.out.println(this.listaInventario.toString());
	}
	
}
