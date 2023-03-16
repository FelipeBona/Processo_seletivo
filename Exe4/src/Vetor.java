// Feito por Felipe Bona 16/03/2023
import java.util.Scanner;
public class Vetor {
	public static void main(String[] args) {

		int[] vetor = new int[5];

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			vetor[i] = input.nextInt();
		}

		System.out.println("O valor na posição três é: " + vetor[2]);
	}
}
