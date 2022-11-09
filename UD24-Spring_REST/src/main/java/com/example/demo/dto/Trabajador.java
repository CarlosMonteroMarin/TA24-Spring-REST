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
	private String puesto_trabajo;
	@Column(name = "salario")
	private double salario;
	
	
	public Trabajador() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param puesto_trabajo
	 * @param salario
	 */
	public Trabajador(Long id, String nombre, String apellido, String puesto_trabajo, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto_trabajo = puesto_trabajo;
		this.salario = salario;
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
	public String getPuesto_trabajo() {
		return puesto_trabajo;
	}

	/**
	 * @param puesto_trabajo
	 */
	public void setPuesto_trabajo(String puesto_trabajo) {
		this.puesto_trabajo = puesto_trabajo;
	}

	/**
	 * @return salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}


