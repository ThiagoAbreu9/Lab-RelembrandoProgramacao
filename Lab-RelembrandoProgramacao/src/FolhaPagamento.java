import java.util.Scanner;

public class FolhaPagamento {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double valor = tec.nextDouble();
		double horas= tec.nextDouble();
		
		double salario = valor * horas;
		double ir = salario * 11 / 100;
		double inss = salario * 8 /100;
		double total = ir+inss;
		double saldoliq = salario - total;
		System.out.printf("Salario bruto: R$%.2f\n", salario);
		System.out.printf("IR: R$%.2f\n", ir);
		System.out.printf("INSS: R$%.2f\n", inss);
		System.out.printf("Total de descontos: R$%.2f\n", total);
		System.out.printf("Salario liquido: R$%.2f\n", saldoliq);
}		
	
}
