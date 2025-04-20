package funcionalidades;
import funcionalidades.Calcular;

public class Resultado {
	public void exibirResultado(double result) {
		Calcular calc = new Calcular();
		if(result < 7) {
			System.out.println("O aluno está reprovado");
		}else {
			System.out.println("O aluno está aprovado, parabéns!");
		}
	}
}
