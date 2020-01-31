import java.util.Scanner;
import java.util.Locale;

public class Ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n,soma=0,qtd = 0;
		
		n = sc.nextInt();
		int [] valores = new int[n];

		
		for(int i=0;i<n;i++) {
			
			valores[i] = sc.nextInt();
			
			if(valores[i] % 2 == 0) {
				
				soma = valores[i] + soma;
				qtd++;
				
			}
			
			
		}
		
		
		System.out.println((double) soma/qtd);
		
		
		sc.close();

	}

}
