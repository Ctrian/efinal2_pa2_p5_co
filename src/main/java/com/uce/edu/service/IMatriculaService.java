package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.repository.modelo.MatriculaAux;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaService {
	public void matricular(String cedula, String codigoMateria, LocalDateTime fecha, String nombreHilo);

	public void matricularOptimizado(MatriculaAux aux);

	public List<MatriculaDTO> reporteMatriculas();
}
