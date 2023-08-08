import java.util.Scanner;

public class SomaDigitos {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int div = scan.nextInt();
		while(div/10 > 0) {
			result = result + div%10;
			div = div/10;
		}
		result = result + div;
		System.out.println(result);
}}
