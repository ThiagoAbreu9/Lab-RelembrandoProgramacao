import java.util.Scanner;

public class Mediana {
	public void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] vetor = new int[10];
		int tam = 0;
		int i = 0;
		while(num!=-1) {
			vetor[i] = num;
			num = scan.nextInt();
			tam++;
			i++;
		}
		double result=0;
		if(tam%2==0) {
			result = vetor[tam/2] + vetor[(tam/2)-1];
			
		}
		System.out.println(result);
	}

}
