package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM = new ProfesorMateria();
		profeM.setApellido("Tapia");
		profeM.setNombre("Jose");
		return profeM;
	}
	
	@Override
	public void crearMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON: " + this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE: " + this.profesorMateria);
		
		System.out.println("DI un metodo General: " + this.obtenerProfesorG());
		System.out.println("DI un metodo Materia: " + this.obtenerProfesorM());
		this.iMatriculaRepository.insertar(m);
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizar(m);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminar(numero);
	}

}
