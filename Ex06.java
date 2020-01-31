import java.util.Scanner; 
import java.util.Locale;

public class Ex06{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);

	int n,j=0; 
	n = sc.nextInt();
	String[] nome = new String[n];
	int[] idade = new int[n];
	String nomefim ="";
	
	for(int i=0;i<n;i++){
	
	nome[i] = sc.next();
	idade[i] = sc.nextInt();
	
	if(idade[i] > j){
	
	j = idade[i];
	nomefim = nome[i];
				
	}
	
	
	}


System.out.println("Pessoa mais velha: " + nomefim);


sc.close();

	}
}
