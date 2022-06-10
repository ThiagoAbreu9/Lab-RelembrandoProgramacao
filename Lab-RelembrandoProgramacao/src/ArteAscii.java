import java.util.Scanner;
public class ArteAscii {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = teclado.nextInt();
		int i;
		int contador;
		i= num;
		while(i!=0) {
			for(contador=i;contador>0;contador--) {
				System.out.print("*");
			}
			System.out.println();
			i= i-1;
		}
		i = 1;
		while(i!=num+1) {
			for(contador=i;contador>0;contador--) {
				System.out.print("*");
			}
			System.out.println();
			i=i+1;
		}
	}	
}