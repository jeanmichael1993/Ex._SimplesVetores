import java.util.Scanner; 
import java.util.Locale;

public class Ex07{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	int n; 
    
    n = sc.nextInt();
	String [] nome = new String[n];
	double [] nota1 = new double[n];
	double [] nota2 = new double[n];
	double [] soma = new double [n];

	for (int i=0;i<n;i++){
	
	nome[i] = sc.next();
	nota1[i] = sc.nextDouble();
	nota2[i] = sc.nextDouble();

	
		soma[i] = nota1[i] + nota2[i];
		soma[i] = soma[i] / 2;


}

		System.out.println("Alunos aprovados:");



	for(int i=0;i<n;i++){

		if(soma[i] >= 6.0){
			
			System.out.println(nome[i]);
					
			}
		
		
	}

	


	

sc.close();

	}
}