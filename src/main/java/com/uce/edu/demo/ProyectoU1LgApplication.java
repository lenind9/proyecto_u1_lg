package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.vuelo.modelo.Persona;
import com.uce.edu.demo.vuelo.modelo.Vuelo;
import com.uce.edu.demo.vuelo.modelo.VueloInternacional;
import com.uce.edu.demo.vuelo.modelo.VueloNacional;
import com.uce.edu.demo.vuelo.service.IVueloService;

@SpringBootApplication
public class ProyectoU1LgApplication implements CommandLineRunner {
	
	@Autowired
	private VueloNacional nacional;
	
	@Autowired
	private VueloNacional nacional1;
	
	@Autowired
	private VueloInternacional internacional;
	
	@Autowired
	private VueloInternacional internacional1;
	
	@Autowired
	private IVueloService iVueloService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("EJEMPLO SINGLETON");
		this.nacional.setOrigen("Quito");
		this.nacional.setDestino("Guayaquil");
		
		System.out.println(this.nacional);
		
		System.out.println("---------------");
		System.out.println(this.nacional1);
		this.nacional.setDestino("Cuenca");
		System.out.println("---------------");
		System.out.println(this.nacional1);
		
		System.out.println("---------------");
		System.out.println(this.nacional1);
		
		System.out.println("\nEJEMPLO PROTOTYPE");
		this.internacional.setOrigen("Guayaquil");
		this.internacional.setDestino("Santiago de Chile");
		System.out.println(this.internacional);
		System.out.println("---------------");
		System.out.println(this.internacional1 + "\n");
		
		Vuelo vuelo1 = new Vuelo();
		Persona persona1 = new Persona();
		vuelo1.setNumero("156432");
		persona1.setCedula("1724116498");
		persona1.setNombre("Lenin");
		persona1.setApellido("Guananga");
		vuelo1.setPersona(persona1);
		
		this.iVueloService.crearVuelo(vuelo1);
		
	}

}
