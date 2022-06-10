import java.util.Scanner;

public class AreaPoligono {
	public static void main (String[] args) {
		double vetorx[];
		vetorx = new double[20];
		double vetory[];
		vetory = new double[20];
		int i=0;
		float n=0;
		int num=0;
		
		Scanner scan = new Scanner(System.in);
		
		while (n!=-1) {
			n = scan.nextFloat();
			if (n!=-1) {
				
				vetorx[num]=n;
				num++;
			}
		}

		n = 0;
		i = 0;
		
		
		while (n!=-1) {
			n = scan.nextFloat();
			if (n!=-1) {
				
				vetory[i]=n;
				i++;
			}
		}

		
		float A=0;
		double soma=0;
		
		for (i=0;i<num-1;i++) {
			soma = soma + (vetorx[i+1] + vetorx[i]) * (vetory[i+1] - vetory[i]);
		}
		
		
		soma = Math.abs(soma);
		soma = (1.0/2.0)*soma;
		
		System.out.printf("%.4f ",soma);
		}
}