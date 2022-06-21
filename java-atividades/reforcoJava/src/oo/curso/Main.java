package oo.curso;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("Go");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		aluno1.adicionarCurso(curso2);
		aluno1.adicionarCurso(curso3);
		
		System.out.println("Estão matriculados no curso 1:");
		for (Aluno aluno: curso1.alunos)
		{
			System.out.println(" - " + aluno.nome);
		}
		
		System.out.println("\n" + aluno1.nome + " está matriculado em tais cursos:");
		for (Curso curso: aluno1.cursos)
		{
			System.out.println(" - " + curso.nome);
		}
		
		Curso cursoProcurado = aluno1.procurarCurso("Go");
		
		if (cursoProcurado != null)
		{
			System.out.println(cursoProcurado.nome);
		}
		else
		{
			System.out.println("Não encontrado");
		}

	}

}
