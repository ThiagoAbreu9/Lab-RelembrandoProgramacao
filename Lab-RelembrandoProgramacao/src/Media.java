import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int i;
		i=3;
		float num;
		float soma = 0;
		float media = 0;
		while(i!=0) {
			num = teclado.nextFloat();
			i = i-1;
			soma = soma + num;
		}
		media = soma/3;
		System.out.printf("%.2f\n", media);
	}
}
