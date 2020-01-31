import java.util.Scanner;
import java.util.Locale;

public class Ex03 {

	public static void main(String [] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		
		n = sc.nextInt();
		
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for(int i=0; i<n;i++) {
			
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			
			c[i] = a[i] + b[i];
			
			System.out.println(c[i]);
		}
		
		
		
		sc.close();
		
	}
	
}
