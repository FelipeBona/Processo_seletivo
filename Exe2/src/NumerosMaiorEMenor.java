// Feito por Felipe Bona 16/03/2023
import java.util.Scanner;
public class NumerosMaiorEMenor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, num5;
		int maior, menor;

		System.out.println("Digite cinco números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		// encontra o número maior
		maior = num1;
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		if (num4 > maior) {
			maior = num4;
		}
		if (num5 > maior) {
			maior = num5;
		}

		// encontra o número menor
		menor = num1;
		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}
		if (num4 < menor) {
			menor = num4;
		}
		if (num5 < menor) {
			menor = num5;
		}

		System.out.println("O número maior é: " + maior);
		System.out.println("O número menor é: " + menor);

		sc.close();
	}
}
