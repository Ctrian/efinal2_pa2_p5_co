package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IEstudianteRepository;
import com.uce.edu.repository.IMateriaRepository;
import com.uce.edu.repository.IMatriculaRepository;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.MatriculaAux;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void matricular(String cedula, String codigoMateria, LocalDateTime fecha, String nombreHilo) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.estudianteRepository.seleccionarPorCedula(cedula);
		Materia materia = this.iMateriaRepository.seleccionarPorCodigo(codigoMateria);

		Matricula matricula = new Matricula();
		matricula.setEstudiante(estudiante);
		matricula.setMateria(materia);
		matricula.setFecha(fecha);
		matricula.setNombreHilo(nombreHilo);

		this.iMatriculaRepository.insertar(matricula);

	}

	@Override
	public void matricularOptimizado(MatriculaAux aux) {
		// TODO Auto-generated method stub

		Matricula matricula1 = new Matricula();
		matricula1.setFecha(LocalDateTime.now());

		Materia materia1 = new Materia();

		matricula1.setMateria(materia1);

		materia1.setCodigo(aux.getCodeMat1());

		matricula1.setMateria(materia1);

		Matricula matr2 = new Matricula();
		matr2.setFecha(LocalDateTime.now());
		Materia materia2 = new Materia();
		matr2.setMateria(materia2);
		materia2.setCodigo(aux.getCodeMat1());
		matr2.setMateria(materia2);

		List<Matricula> matricuals = new ArrayList<>();
		matricuals.add(matricula1);
		matricuals.add(matr2);

		matricuals.parallelStream().forEach(matricula -> {
			Thread hilo = Thread.currentThread();
			String nombreHilo = hilo.getName();
			matricula.setNombreHilo(nombreHilo);
			this.matricular(matricula.getCedulaEstudiante(), matricula.getMateria().getCodigo(), matricula.getFecha(),
					matricula.getNombreHilo());
		});

	}

	@Override
	public List<MatriculaDTO> reporteMatriculas() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.reporteMatriculas();
	}

}
