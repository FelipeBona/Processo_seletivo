// Feito por Felipe Bona 16/03/2023
import java.util.Scanner;
public class CalculoDeNotas {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String nome;
		double nota1, nota2, nota3, nota4, media;
		char opcao;

		do {
			System.out.println("Digite o nome do aluno: ");
			nome = input.nextLine();

			System.out.println("Digite a primeira nota: ");
			nota1 = input.nextDouble();

			System.out.println("Digite a segunda nota: ");
			nota2 = input.nextDouble();

			System.out.println("Digite a terceira nota: ");
			nota3 = input.nextDouble();

			System.out.println("Digite a quarta nota: ");
			nota4 = input.nextDouble();

			media = (nota1 + nota2 + nota3 + nota4) / 4;

			System.out.printf("Aluno: %s\n", nome);
			System.out.printf("Média: %.2f\n", media);

			if (media >= 6.0) {
				System.out.println("Situação: Aprovado\n");
			} else {
				System.out.println("Situação: Reprovado\n");
			}

			System.out.println("Digite 's' para sair ou qualquer outra tecla para continuar: ");
			opcao = input.next().charAt(0);
			input.nextLine();

		} while (opcao != 's');

		input.close();
	}
}
