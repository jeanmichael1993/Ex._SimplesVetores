import java.util.Scanner;
import java.util.Locale;

public class Ex01_2 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n,fim = 0;
		
		n = sc.nextInt();
		double [] m = new double[n];
		
		for(int i = 1;i<n;i++) {
			
			m[i] = sc.nextDouble();
			
			if(m[i] > m[fim]) {
				fim = i;
			}
		
			
			
			
		}
		
		System.out.println(m[fim]);
		System.out.println(fim);
		
		
		
		sc.close();
	}

}
