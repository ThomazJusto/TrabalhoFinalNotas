package Alunos;

import java.util.ArrayList;
import java.util.List;


public class Turma {
	private static List<Aluno> listaDeAlunos = new ArrayList<>();
	
	public void addAluno(Aluno aluno) {
		listaDeAlunos.add(aluno);
	}
	
	public Aluno verificaSeAlunoExistePorMatricula(String mat) {
		for(int i=0; i<listaDeAlunos.size();i++) {
			if(listaDeAlunos.get(i).getMatricula().equalsIgnoreCase(mat)) {
				return listaDeAlunos.get(i);
			}
		}
		return null;
	}

}
