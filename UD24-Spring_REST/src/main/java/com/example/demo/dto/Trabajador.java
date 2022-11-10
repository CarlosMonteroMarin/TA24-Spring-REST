package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")
public class Trabajador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "puesto_trabajo")
	private String puesto;
	@Column(name = "salario")
	private double salario;
	
	private String trabajador;
	
	
	public Trabajador() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param puesto_trabajo
	 * @param salario
	 */
	public Trabajador(Long id, String nombre, String apellido, String puesto, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto=puesto;
		this.salario=salario;
	}

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return puesto_trabajo
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto_trabajo
	 */
	public void setPuesto(String puesto_trabajo) {
		this.puesto = puesto_trabajo;
	}

	/**
	 * @return salario
	 */
	
	public double getSalario() {
		return com.example.demo.controller.Trabajador.definirSalario(puesto);
		

	}

	/**
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto
				+ ", salario=" + salario + ", trabajador=" + trabajador + "]";
	}
	
	
	
}


