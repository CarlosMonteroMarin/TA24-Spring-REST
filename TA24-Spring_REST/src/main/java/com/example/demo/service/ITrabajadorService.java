package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Trabajador;

public interface ITrabajadorService {
	
	public List<Trabajador> listarTrabajadores();
	
	public Trabajador guardarTrabajador(Trabajador trabajador);
	
	public Trabajador TrabajadorXID(Long id);
	
	public List<Trabajador> listarTrabajadorNombre(String nombre);
	
	public Trabajador actualizarTrabajador(Trabajador trabajador);
	
	public void eliminarTrabajador(Long id);
	
	
}
