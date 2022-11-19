package Tela;

import java.util.Scanner;

import Alunos.Aluno;
import Alunos.Turma;
import Disciplinas.Curriculo;
import Disciplinas.Disciplina;
import Notas.Curso;


public class UI {
	private Scanner teclado;
	private Turma turma;
	private Curriculo curriculo;
	private Curso curso;
	
	public UI() {
		teclado = new Scanner(System.in);
	}
	
	public void loopMenu() {
		menu();
		boolean condicao = true;
		
		while(condicao) {
			System.out.printf("\nDigite a opção que deseja do menu: ");
			int codigo = teclado.nextInt();
			switch (codigo) {
			case 1:
				insereAluno();
				break;
			case 2:
				insereDisciplina();
				break;
			case 3:
				adicionarNota();
				break;
			case 4:
				mediaAri();
				break;
			case 5:
				mediaPon();
				break;
			case 6:
				listaAlu();
				break;
			case 7:
				System.out.println("Encerrando...");
				condicao = false;
				break;
			default:
				naoExiste();
				break;
			}
		}
	}
	
	public void menu() {
		System.out.println("[1] - Inserir Aluno");
		System.out.println("[2] - Inserir Disciplina");
		System.out.println("[3] - Adicionar Notas");//cria a avaliacao
		System.out.println("[4] - Calcular Média Aritmética");
		System.out.println("[5] - Calcular Média Ponderada");
		System.out.println("[6] - Listar Alunos e suas notas");
		System.out.println("[7] - Sair");
	}
	
	public void naoExiste() {
		System.out.println("Número digitado não existe no Menu. Digite novamente");
	}
	
	public void insereAluno() {
		System.out.println("Adicionando um aluno!");
		System.out.println("Digite o nome do Aluno ");
		String nome = teclado.nextLine();
		System.out.println("Digite a matricula do aluno: ");
		String matricula = teclado.next();
		
		turma.addAluno(new Aluno(nome, matricula));
		System.out.println("Aluno adicionado com sucesso...");
	}
	
    public void insereDisciplina() {
    	System.out.println("Adicionando uma Disciplina!");
		System.out.println("Digite o nome da Disciplina: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o código da Disciplina: ");
		String codigo = teclado.next();
		
		curriculo.addDisciplinas(new Disciplina(nome, codigo));
		System.out.println("Disciplina adicionada com sucesso...");
	}
    
    private int verificaSeValido(String str) {
    	try {
    		return Integer.parseInt(str);
    	} catch(Exception e) {
    		return -1;
    	}
    }
    //verificar se aluno existe
    public void adicionarNota() {
    	int codigoAluno = -1;
    	while(true) {
    		System.out.println("Adicionando Notas\n\nInforme o código do Aluno");
    		codigoAluno = verificaSeValido(teclado.next());
    		if(codigoAluno != -1)
    			break;
    		System.out.println("Código inválido!");
    	}

    	int codigoDisciplina = -1;
    	while(true) {
    		System.out.println("Adicionando Notas\n\nInforme o código da Disciplina");
    		codigoDisciplina = verificaSeValido(teclado.next());
    		if(codigoDisciplina != -1)
    			break;
    		System.out.println("Código inválido");

    	}
    	
    	
    	boolean condicao = true;
    	while(condicao) {
    		System.out.println("Adicionando Notas \nQual/Quais nota(s) adicionar?");
    		System.out.println("[1] Nota 1\n[2] Nota 2\n [3] Nota 1 e 2\n [4] Sair");
    		int codigo = verificaSeValido(teclado.next());
    		
    		switch(codigo) {
    			case 1:
    				2
    		}
 
    	}
	}
	
    public void mediaAri() {
		
	}
    
    public void mediaPon() {
		
	}
    
    public void listaAlu() {
    	
    }
    
}
