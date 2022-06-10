import java.util.Scanner;
public class MediaColecao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double num = teclado.nextDouble();
		double soma = 0;
		double i=0;
		while (num !=-1) {
			soma = soma+num;
			i = i+1;
			num = teclado.nextDouble();
		}
		soma = soma/i;
		System.out.printf("%.2f", soma);
	}
}
