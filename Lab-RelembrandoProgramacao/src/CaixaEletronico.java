import java.util.Scanner;
public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int cinquenta = 0;
		int dez = 0;
		int dois = 0;
		if (num < 0) { 
			System.out.print("Valor invalido");
		}
		else if (num %2 == 1) {
			System.out.print("Valor invalido");
		}	else {
			cinquenta = num/50;

			dez = (num%50)/10;	

			dois = ((num%50)%10)/2;
		
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2", cinquenta, dez, dois);
}
		}
	}