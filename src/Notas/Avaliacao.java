package Notas;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import Alunos.Aluno;
import Disciplinas.Disciplina;

public class Avaliacao {
	private Aluno aluno;
	private Disciplina disciplina;
	private double nota1 = -1;
	private double nota2 = -1;
	
	public Avaliacao(Aluno aluno, Disciplina disciplina, double nota1, double nota2) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	public Avaliacao(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public void setNota1eNota2(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double getMediaAri() {
		NumberFormat formatter = new DecimalFormat();
		Locale.setDefault(new Locale("en", "US"));
		formatter.setMaximumFractionDigits(2);
		return Double.parseDouble(formatter.format((this.nota1 + this.nota2)/2));
//		return (this.nota1 + this.nota2)/2;
	}
	
	public double getMediaPon() {
		NumberFormat formatter = new DecimalFormat();
		Locale.setDefault(new Locale("en", "US"));
		formatter.setMaximumFractionDigits(2);
		return Double.parseDouble(formatter.format((this.nota1*1 + this.nota2*2)/3));
//		return (this.nota1*1 + this.nota2*2)/3;
	}
	
}
