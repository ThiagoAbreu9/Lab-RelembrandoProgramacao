import java.util.Scanner;
public class SomaColecoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int soma=0;

		
		int flag =0;
		if (num!=-1) {
			while(flag==0) {
				soma = soma+num;
		
				num = teclado.nextInt();
				if (num == -1) {
					
					System.out.print(soma);
					soma = 0;
				
					num = teclado.nextInt();
				}
				if (num==-1) {
					flag = 1;
				}
				
			}
	}
}}
