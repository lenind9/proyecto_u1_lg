package com.uce.edu.demo.vuelo.modelo;

public class Vuelo {
	private String numero;
	private Persona persona;
	
	@Override
	public String toString() {
		return "Vuelo [numero=" + numero + ", persona=" + persona + "]";
	}
	
	//SET y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
