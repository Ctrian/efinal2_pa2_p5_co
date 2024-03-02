package com.uce.edu.repository.modelo;

public class MatriculaAux {

	private String cedulaEstudiante;
	private String codeMat1;
	private String codeMat2;
	private String codeMat3;
	private String codeMat4;

	public MatriculaAux() {
		// TODO Auto-generated constructor stub
	}

	public MatriculaAux(String ceduaEstudiante, String codeMat1, String codeMat2, String codeMat3, String codeMat4) {
		this.cedulaEstudiante = ceduaEstudiante;
		this.codeMat1 = codeMat1;
		this.codeMat3 = codeMat2;
		this.codeMat3 = codeMat3;
		this.codeMat4 = codeMat4;
	}

	// get y set
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public String getCodeMat1() {
		return codeMat1;
	}

	public String getCodeMat2() {
		return codeMat2;
	}

	public String getCodeMat3() {
		return codeMat3;
	}

	public String getCodeMat4() {
		return codeMat4;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public void setCodeMat1(String codeMat1) {
		this.codeMat1 = codeMat1;
	}

	public void setCodeMat2(String codeMat2) {
		this.codeMat2 = codeMat2;
	}

	public void setCodeMat3(String codeMat3) {
		this.codeMat3 = codeMat3;
	}

	public void setCodeMat4(String codeMat4) {
		this.codeMat4 = codeMat4;
	}

}
