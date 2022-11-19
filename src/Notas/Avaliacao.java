package Notas;

import Alunos.Aluno;
import Disciplinas.Disciplina;

public class Avaliacao {
	private Aluno aluno;
	private Disciplina disciplina;
	private int nota1;
	private int nota2;
	
	public Avaliacao(Aluno aluno, Disciplina disciplina, int nota1, int nota2) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
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

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
	
}
