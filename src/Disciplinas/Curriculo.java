package Disciplinas;

import java.util.ArrayList;

import Notas.Avaliacao;

public class Curriculo {
	private ArrayList <Disciplina> listaDeDisciplinas = new ArrayList<>();
	
	public void addDisciplinas(Disciplina disciplina) {
		listaDeDisciplinas.add(disciplina);
	}
	
	public Disciplina verificaSeDisciplinaExistePorCodigo(String cod) {
		for(int i=0; i<listaDeDisciplinas.size();i++) {
			if(listaDeDisciplinas.get(i).getCodigo().equalsIgnoreCase(cod)) {
				return listaDeDisciplinas.get(i);
			}
		}
		return null;
	}

}
