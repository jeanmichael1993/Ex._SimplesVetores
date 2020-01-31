import java.util.Scanner;
import java.util.Locale;

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n,fim = 0;
		
		n = sc.nextInt();
		double [] m = new double[n];
		double t = 0;
		
		for(int i = 0;i<n;i++) {
			
			m[i] = sc.nextDouble();
			
			if(m[i] > t) {
				
				t = m[i];
				fim = i;
			}
		
			
			
			
		}
		
		System.out.println(t);
		System.out.println(fim);
		
		
		
		sc.close();
	}

}
