// Feito por Felipe Bona 16/03/2023
import java.util.Scanner;
public class MatrizBio {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[][] notas = new double[3][4];

		String[] nomes = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			nomes[i] = input.nextLine();
		}

		// solicitando as notas dos alunos
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite as quatro notas de " + nomes[i] + ": ");
			for (int j = 0; j < 4; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				notas[i][j] = input.nextDouble();
			}
			input.nextLine();
		}

		double[] medias = new double[3];
		for (int i = 0; i < 3; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}

		System.out.println("Médias dos alunos:");
		for (int i = 0; i < 3; i++) {
			System.out.println(nomes[i] + ": " + medias[i]);
		}

		String alunoMaiorMedia = "";
		String alunoMenorMedia = "";
		double maiorMedia = 0;
		double menorMedia = Double.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			if (medias[i] > maiorMedia) {
				maiorMedia = medias[i];
				alunoMaiorMedia = nomes[i];
			}
			if (medias[i] < menorMedia) {
				menorMedia = medias[i];
				alunoMenorMedia = nomes[i];
			}
		}

		System.out.println("Aluno com maior média: " + alunoMaiorMedia);
		System.out.println("Aluno com menor média: " + alunoMenorMedia);
	}
}
