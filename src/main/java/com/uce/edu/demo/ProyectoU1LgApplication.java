package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication
public class ProyectoU1LgApplication implements CommandLineRunner {
	
	@Autowired
	private IInventarioService inventarioService;
	
	@Autowired
	private IProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.inventarioService.agregar(this.productoService.insertarProducto("Huevos", "150", new BigDecimal(3.69), LocalDateTime.of(2022, 6, 8, 22, 54, 20)));
		this.inventarioService.agregar(this.productoService.insertarProducto("Pepsi", "250", new BigDecimal(1.23), LocalDateTime.of(2022, 3, 25, 15, 21, 2)));
		this.inventarioService.agregar(this.productoService.insertarProducto("Shampoo", "200", new BigDecimal(1.64), LocalDateTime.of(2022, 2, 17, 16, 42, 55)));
		this.inventarioService.agregar(this.productoService.insertarProducto("Papel higienico", "215", new BigDecimal(3.48), LocalDateTime.of(2022, 4, 12, 23, 23, 11)));
		this.inventarioService.agregar(this.productoService.insertarProducto("Mayonesa", "175", new BigDecimal(1.44), LocalDateTime.of(2022, 6, 6, 9, 31, 10)));
		this.inventarioService.mostrarInventario();
		
		this.inventarioService.buscarInventario(LocalDateTime.of(2022, 4, 10, 23, 11));
		
	}

}
