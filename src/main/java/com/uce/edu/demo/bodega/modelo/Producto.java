package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
	private String nombre;
	private String cantidad;
	private BigDecimal precio;
	private LocalDateTime fecha;
	
	@Override
	public String toString() {
		return nombre + " - " + cantidad + " - $" + precio + " - " + fecha + "\n";
	}
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioCompra() {
		return precio;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precio = precioCompra;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
}
