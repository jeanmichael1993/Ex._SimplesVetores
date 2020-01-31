import java.util.Scanner;
import java.util.Locale;

public class Ex04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		double[] valores = new double[n];
		double media = 0.0, soma = 0;

		for (int i = 0; i < n; i++) {

			valores[i] = sc.nextDouble();

			soma = valores[i] + soma;

		}

		media = soma / n;
		System.out.println(media);

		for (int i = 0; i < n; i++) {

			if (valores[i] < media) {

				System.out.println(valores[i]);
			}

		}

		sc.close();

	}

}
