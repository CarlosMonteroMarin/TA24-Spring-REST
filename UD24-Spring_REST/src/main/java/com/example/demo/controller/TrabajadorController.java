package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Trabajador;
import com.example.demo.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;
	
	
	
	
	@PostMapping("/trabajadores")
	public Trabajador salvarTrabajadores(@RequestBody Trabajador trabajador) {
		
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="id") Long id) {
		
		Trabajador trabajadores_xid= new Trabajador();
		
		trabajadores_xid=trabajadorServiceImpl.TrabajadorXID(id);
		
		System.out.println("Trabajador XID: "+trabajadores_xid);
		
		return trabajadores_xid;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado= trabajadorServiceImpl.TrabajadorXID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setApellido(trabajador.getApellido());
		trabajador_seleccionado.setPuesto(trabajador.getPuesto());
		trabajador_seleccionado.setSalario(trabajador.getSalario());
		
		trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eleiminarTrabajador(@PathVariable(name="id")Long id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
	}
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}
	
	@GetMapping("/trabajadores/nombre/{nombre}")
	public List<Trabajador> listarTrabajadorNombre(@PathVariable(name="nombre") String nombre) {
	    return trabajadorServiceImpl.listarTrabajadorNombre(nombre);
	}
	
	
	@GetMapping("/trabajadores/puesto_trabajo/{puesto_trabajo}")
		public List<Trabajador> listarTrabajadorPuesto(@PathVariable(name="puesto_trabajo") String puesto_trabajo) {
			return trabajadorServiceImpl.listarTrabajadorPuesto(puesto_trabajo);
	}
	
	
}
