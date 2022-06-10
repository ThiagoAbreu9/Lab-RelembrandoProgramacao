import java.util.Scanner;
public class MediaColecoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num = teclado.nextDouble();
		double soma=0;
		double i=0;
		int flag = 0;
		
		if(num!=-1) {
			while(flag==0) {
				soma = soma+num;
				i = i+1;
				num = teclado.nextDouble();
				if (num==-1) {
					soma = soma/i;
					System.out.printf("%.2f",soma);
					soma = 0;
					i = 0;
					num = teclado.nextDouble();
				}
				if (num== -1) {
					flag = 1;
				}
			}
		}
	}
}
