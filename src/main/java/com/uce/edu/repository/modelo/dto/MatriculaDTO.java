package com.uce.edu.repository.modelo.dto;

import java.time.LocalDateTime;

public class MatriculaDTO {

	private String cedulaEstudiante;
	private String codigoMateria;
	private LocalDateTime fecha;
	private String nombreHilo;

	public MatriculaDTO() {
		// TODO Auto-generated constructor stub
	}

	public MatriculaDTO(String cedulaEstudiante, String codigoMateria, LocalDateTime fecha, String nombreHilo) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.codigoMateria = codigoMateria;
		this.fecha = fecha;
		this.nombreHilo = nombreHilo;
	}

	// get y set

	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	@Override
	public String toString() {
		return "MatriculaDTO [cedulaEstudiante=" + cedulaEstudiante + ", codigoMateria=" + codigoMateria + ", fecha="
				+ fecha + ", nombreHilo=" + nombreHilo + "]";
	}

}
