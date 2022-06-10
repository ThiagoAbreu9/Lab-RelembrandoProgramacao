import java.util.Scanner;
public class ContaEnergia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num = teclado.nextDouble();
		String nome = teclado.next();
		double result = 0;
		
		if ( nome.contains("R") == true) {
			if(num>=0) {
				if ( num <= 500) {
					result = num * 0.4;
					System.out.printf("%.2f",result);
				}
				else if (num > 500) {
					result = num *0.65;
					System.out.printf("%.2f",result);
				}
				else {
					System.out.print("-1.00");}
			}
			else {
				System.out.print("-1.00");
			}			}
		else if ( nome.contains("C")== true) {
			if(num>=0) {
				if (num <= 1000) {
					result = num *0.55;
					System.out.printf("%.2f",result);
				}
				else if(num>1000) {
					result = num *0.6;
					System.out.printf("%.2f",result);
				}
				else {
					System.out.print("-1.00");
				}}
			else
			{ System.out.print("-1.00");
			}		}
		else if(nome.contains("I")==true) {
			if(num>=0) {
				if(num<=5000) {
					result = num*0.55;
					System.out.printf("%.2f",result);
				}
				else if(num>5000) {
					result = num*0.60;
					System.out.printf("%.2f",result);
				}
		}
			else {
				System.out.print("-1.00");
			}}
		else {
			System.out.printf("-1.00");
		}
		}}