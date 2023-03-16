// Feito por Felipe Bona 16/03/2023
import java.util.Scanner;
public class NumerosParesImpares {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];
		int soma = 0;
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = scanner.nextInt();
			soma += numeros[i];

			if (numeros[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		double media = (double) soma / numeros.length;

		System.out.println("Números pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println();

		System.out.println("Números ímpares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println();

		System.out.println("Média geral: " + media);
	}
}
