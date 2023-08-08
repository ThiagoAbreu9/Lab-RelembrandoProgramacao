import java.util.Scanner;

public class SomaColecao {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int a = scan.nextInt();
		while(a!=-1) {
			result = result + a;
			a = scan.nextInt();
		}
		System.out.print(result);
	}
}
