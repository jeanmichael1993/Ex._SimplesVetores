import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,qtd=0;
		
		n = sc.nextInt();
		
		int [] m = new int[n];
		
		for(int i=0;i<n;i++)
		{
			m[i] = sc.nextInt();
		    
			if(m[i] % 2 == 0) {
				
				System.out.println(m[i]);
				
				qtd++;

			}
			else {}
		}
		
		System.out.println(qtd);
		
		sc.close();
	}

}
