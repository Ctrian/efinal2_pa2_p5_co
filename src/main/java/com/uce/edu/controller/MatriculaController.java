package com.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.MatriculaAux;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;
import com.uce.edu.service.IMatriculaService;

//	http://localhost:8080/matriculas/

@Controller
@RequestMapping(value = "/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService iMatriculaService;

	@GetMapping(value = "/nueva")
	public String nuevaMatricula() {
		return "vistaNuevaMatricula";
	}

	@GetMapping(value = "/reporte")
	public String reporte(MatriculaDTO matriculaDTO, Model model) {
		List<MatriculaDTO> matriculas = this.iMatriculaService.reporteMatriculas();
		model.addAttribute("matriculas", matriculas);
		return "vistaReporteMatriculas";
	}

	@PostMapping(value = "/guardar")
	public String matricularse(MatriculaAux aux) {
		this.iMatriculaService.matricularOptimizado(aux);
		return "redirect:/matriculas/nueva";
	}
}
