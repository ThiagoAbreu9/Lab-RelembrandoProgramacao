import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num=1 ;
		
		while(num!= -1) {
			num = teclado.nextInt();
			if (num%2==0 ) {
				System.out.print("PAR");
			}
			if (num%2==1) {
				System.out.print("\nIMPAR\n");
		}
		}
		
	}
}
