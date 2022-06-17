package com.uce.edu.demo.vuelo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class VueloNacional {
	private String origen;
	private String destino;
	
	@Override
	public String toString() {
		return "VueloNacional [origen=" + origen + ", destino=" + destino + "]";
	}
	
	//SET y GET
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
