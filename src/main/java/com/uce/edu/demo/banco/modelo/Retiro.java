package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	private String id;
	private LocalDateTime fecha;
	private String numeroCuenta;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Retiro [id=" + id + ", fecha=" + fecha + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto + "]";
	}
	
	//SET y GET
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
}
