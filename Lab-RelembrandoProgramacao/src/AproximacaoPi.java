import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		double aprox = 3;
		double den1, den2, den3;
		
		den1 = 2;
		den2 = 3;
		den3 = 4;
		
		for(int i=0;i<num;i++){
			if (i==0) {
				System.out.printf("%.6f",aprox);
			}
			else {
				if (i%2==1) {
					aprox = aprox + (4.0/(den1*den2*den3));
					den1 = den1+2;
					den2 = den2+2;
					den3 = den3+2;
					System.out.printf("\n%.6f",aprox);
				}
				if(i%2==0) {
				
					aprox = aprox - (4.0/(den1*den2*den3));
					den1 = den1+2;
					den2 = den2+2;
					den3 = den3+2;
					
					System.out.printf("\n%.6f",aprox);
				}
			}
		}
	}
}