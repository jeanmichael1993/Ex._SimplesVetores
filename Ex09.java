import java.util.Scanner; 
import java.util.Locale;

public class Ex09{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	
	int n,LA=0,LE=0,LAC=0;
	n = sc.nextInt();

	
	String[] nome = new String[n];
	double[] PrecoCompra = new double[n];
	double[] PrecoVenda = new double[n];
	double Lucro = 0.0,PrecoCompraFIM = 0.0, PrecoVendaFIM = 0.0, LucroTotal=0.0;


	for(int i=0;i<n;i++){
		
	nome[i] = sc.next();
	PrecoCompra[i] = sc.nextDouble();
	PrecoVenda[i] = sc.nextDouble();

	Lucro = ((PrecoVenda[i] / PrecoCompra[i]) - 1);

	if(Lucro < 0.10){
	LA++;
	}
	else if(Lucro >= 0.10 && Lucro <= 0.20){
	LE++;
	}
	else{
	LAC++;
	}

	PrecoCompraFIM = PrecoCompra[i] + PrecoCompraFIM;
	PrecoVendaFIM = PrecoVenda[i] + PrecoVendaFIM;

		}
	
	
	LucroTotal = Math.abs(PrecoVendaFIM - PrecoCompraFIM);

	
	System.out.println("Lucro abaixo de 10%: " + LA);
	System.out.println("Lucro entre 10% e 20%: " + LE);
	System.out.println("Lucro acima de 20%: " + LAC);
	System.out.printf("Valor total de compra: %.2f%n",PrecoCompraFIM);
	System.out.printf("Valor total de venda: %.2f%n",PrecoVendaFIM);
	System.out.printf("Lucro total: %.2f%n",LucroTotal);

	sc.close();

	}
}