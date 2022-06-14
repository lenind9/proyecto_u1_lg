package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {
	
	//@Autowired
	//@Qualifier("ahorro")
	//private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void realizarRetiro(String numeroCuenta, BigDecimal monto) {
		// TODO Auto-generated method stub
		/*CuentaBancaria cuenta = this.bancariaService.buscar(numeroCuenta);
		BigDecimal saldoCuenta = cuenta.getSaldo();
		BigDecimal saldoFinal = saldoCuenta.subtract(monto);
		cuenta.setSaldo(saldoFinal);
		this.bancariaService.actualizar(cuenta);
		
		Retiro retiro = new Retiro();
		retiro.setId("1564");
		retiro.setFecha(LocalDateTime.now());
		retiro.setNumeroCuenta(numeroCuenta);
		retiro.setMonto(monto);
		this.retiroRepository.insertarRetiro(retiro);*/
	}

	@Override
	public Retiro buscarRetiro(String id) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(id);
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(r);
	}

	@Override
	public void eliminarRetiro(String id) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(id);
	}

}
