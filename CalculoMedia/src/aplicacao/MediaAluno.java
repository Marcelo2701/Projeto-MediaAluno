package aplicacao;
import entidades.Aluno;
import funcionalidades.Calcular;
import funcionalidades.Resultado;
import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno("Marcelo",24,2024291832);
		Calcular calc = new Calcular();
		Resultado result = new Resultado();
		
		System.out.print("Nome do Aluno: ");
		String nome = scan.next();
		aluno.setNome(nome);
		
		System.out.print("Idade do aluno: ");
		int idade = scan.nextInt();
		aluno.setIdade(idade);
		
		System.out.print("Matricula do aluno: ");
		int matricula = scan.nextInt();
		aluno.setMatricula(matricula);
		
		System.out.println();
		
		System.out.println("Digite as notas do aluno");
		
		int cont = 4;
		double notas[] = new double[4];
		
		for(int i = 0; i < cont;i++) {
			System.out.print("Nota" + (i+1) + ": ");
			notas[i] = scan.nextDouble();
		}
		
		System.out.println();
		
		System.out.printf("Média final de %s: %.1f%n",aluno.getNome(),calc.calcularMedia(notas[0],notas[1],notas[2],notas[3]));
		System.out.print("Status: ");
		result.exibirResultado(calc.calcularMedia(notas[0],notas[1],notas[2],notas[3]));
		
		scan.close();
	}
}
