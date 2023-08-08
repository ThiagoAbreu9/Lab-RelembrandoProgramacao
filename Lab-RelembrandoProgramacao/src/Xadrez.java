import java.util.*;
public class Xadrez {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		for (int i = 0;i<a;i++) {
			if(i%2==0) {
				for (int j=0;j<a;j++) {
					System.out.print("* ");
					}
			}
			if(i%2==1) {
				for (int k=0;k<a;k++) {
					System.out.print(" *");
				}
			}
			System.out.println(" ");
	}
}
}
