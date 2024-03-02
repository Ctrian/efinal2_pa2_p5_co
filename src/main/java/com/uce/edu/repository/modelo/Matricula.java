package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_matricula")
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)

	@Column(name = "matr_id")
	private Integer id;

	@Column(name = "matr_cedula_estudiante")
	private String cedulaEstudiante;

	@Column(name = "matr_codigo_materia1")
	private String codigoMateria1;

	@Column(name = "matr_codigo_materia2")
	private String codigoMateria2;

	@Column(name = "matr_codigo_materia3")
	private String codigoMateria3;

	@Column(name = "matr_codigo_materia4")
	private String codigoMateria4;

	@Column(name = "matr_fecha")
	private LocalDateTime fecha;

	@Column(name = "matr_nombre_hilo")
	private String nombreHilo;

	@ManyToOne
	@JoinColumn(name = "matr_id_materia")
	private Materia materia;

	@ManyToOne
	@JoinColumn(name = "matr_id_estudiante")
	private Estudiante estudiante;

	// get y set
	public Integer getId() {
		return id;
	}

	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public String getCodigoMateria1() {
		return codigoMateria1;
	}

	public String getCodigoMateria2() {
		return codigoMateria2;
	}

	public String getCodigoMateria3() {
		return codigoMateria3;
	}

	public String getCodigoMateria4() {
		return codigoMateria4;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public Materia getMateria() {
		return materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public void setCodigoMateria1(String codigoMateria1) {
		this.codigoMateria1 = codigoMateria1;
	}

	public void setCodigoMateria2(String codigoMateria2) {
		this.codigoMateria2 = codigoMateria2;
	}

	public void setCodigoMateria3(String codigoMateria3) {
		this.codigoMateria3 = codigoMateria3;
	}

	public void setCodigoMateria4(String codigoMateria4) {
		this.codigoMateria4 = codigoMateria4;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
