import java.util.Scanner;
public class OperacoesInteiros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num = teclado.nextDouble();
		int qtdelementos = 0;
		int qtdpar = 0;
		int qtdimpar = 0;
		double soma=0;
		double contador=0;
		double maior=0;
		double menor=num;
		int flag;
		flag = 0;
		if (num!=-1) {
			while(flag == 0) {
				qtdelementos = qtdelementos+1;
				if (num%2==0) {
					qtdpar= qtdpar+1;
				}
				else if(num%2==1) {
					qtdimpar = qtdimpar+1;
				}
				soma = soma+num;
				contador = contador+1;
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
				num = teclado.nextDouble();
				if (num==-1) {
					System.out.println(qtdelementos);
					System.out.println(qtdpar);
					System.out.println(qtdimpar);
					System.out.printf("%.0f\n",soma);
					soma = soma/contador;
					System.out.printf("%.2f\n",soma);
					System.out.printf("%.0f\n",maior);
					System.out.printf("%.0f\n",menor);
					soma = 0;
					contador = 0;
					maior = 0;
					qtdimpar = 0;
					qtdpar = 0;
					qtdelementos = 0;
					num = teclado.nextDouble();
					menor = num;
				}
				if (num==-1) {
					flag = 1;
				}
			
			}
		}
	}
}
