import java.util.Scanner;
import java.lang.*;
public class NumeroNarcisista {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int contador;
		contador = 0;
		int aux = num;
		while(aux>0) {
			aux = aux/10;
			contador = contador+1;
		};
		aux = num;
		double soma =	 0;
		double aux2 = 0;
		while(aux>0) {
			aux2 = Math.pow(aux%10, contador);
			soma = soma+aux2;
			aux = aux/10;
		}
		if ( soma == num) {
			System.out.print("SIM");
		} else {
			System.out.print("NAO");
		}
	}}