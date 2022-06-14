package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	public void crearCuentaBancaria(CuentaBancaria c);
	public CuentaBancaria buscar(String numero);
	public void actualizar(CuentaBancaria c);
	public void eliminarCuentaBancaria(String numero);
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo);
}
