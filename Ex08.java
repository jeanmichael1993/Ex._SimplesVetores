import java.util.Scanner; 
import java.util.Locale;

public class Ex08{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	
	int n,nH = 0;
	n = sc.nextInt();
	
	double[] altura = new double[n];
	char[] sexo = new char[n];
	double MenorAltura = 0.0,MaiorAltura=0.0,MediaAltura = 0.0,nM = 0.0;

	for(int i=0;i<n;i++){
	
	altura[i] = sc.nextDouble();
	sexo[i] = sc.next().charAt(0);	
	
	if(altura[i] > MaiorAltura){

	MaiorAltura = altura[i];
	MenorAltura = MaiorAltura;	
		}
	if(altura[i] < MenorAltura){
		
	MenorAltura = altura[i];

			}
	if(sexo[i] == 'F' || sexo[i] == 'f'){
					
		MediaAltura = altura[i] + MediaAltura;
		nM++;
		
		}
	if(sexo[i] == 'M' || sexo[i]== 'm'){
		
		nH++;

		}
	
	
	}
	
	System.out.printf("Menor altura = %.2f%n", MenorAltura);
	System.out.printf("Maior altura = %.2f%n", MaiorAltura);
	System.out.printf("Media das alturas das mulheres = %.2f%n",MediaAltura/nM);
	System.out.println("Numero de homens = " + nH);	
	

	sc.close();

	}
}
