package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> reporteMatriculas() {
		TypedQuery<MatriculaDTO> mQ = this.entityManager.createNamedQuery(
				"SELECT new com.uce.edu.repository.modelo.dto.MatriculaDTO(m.estudiante.cedula, m.materia.codigo, m.fecha, m.nombreHilo) m FROM Matricula m",
				MatriculaDTO.class);
		return mQ.getResultList();
	}

}
