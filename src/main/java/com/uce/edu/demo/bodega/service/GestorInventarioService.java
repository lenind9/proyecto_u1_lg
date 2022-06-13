package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class GestorInventarioService implements IGestorInventarioService {

	@Override
	public BigDecimal calculo(BigDecimal precioCompra) {
		// TODO Auto-generated method stub
		BigDecimal precioV = precioCompra.add(precioCompra.multiply(new BigDecimal(0.1))).add(precioCompra.multiply(new BigDecimal(0.12))).setScale(2, RoundingMode.HALF_UP);
		return precioV;
	}

	
}
