package Disciplinas;

import java.util.ArrayList;

import Notas.Avaliacao;

public class Curriculo {
	private ArrayList <Disciplina> listaDeDisciplinas = new ArrayList<>();
	
	public void addDisciplinas(Disciplina disciplina) {
		listaDeDisciplinas.add(disciplina);
	}

}
