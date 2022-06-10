import java.util.Scanner;

public class AsciiArt {
	public static void main(String[] args) {
		Scanner teclado2 = new Scanner(System.in);
		int numero = teclado2.nextInt();
		int i;
		int contador;
		i=numero;
		int cont;
		cont=0;
		while(i!=0) {
			for(contador=i;contador>0;contador--) {
				System.out.print("*");
			}
			for(contador=cont;contador>0;contador--) {
				System.out.print(" ");
			}
			for(contador=cont;contador>0;contador--) {
				System.out.print(" ");
			}
			for(contador=i;contador>0;contador--) {
				System.out.print("*");
			}
			System.out.println();
			i= i-1;
			cont = cont+1;
		}
	}	
}